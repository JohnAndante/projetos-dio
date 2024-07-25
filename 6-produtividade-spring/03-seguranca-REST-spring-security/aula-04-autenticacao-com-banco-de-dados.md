# Auth Database

> Depois de uma contextualização sobre autenticação e autorização, vamos agora implementar a autenticação com banco de dados.

<!-- TOC -->

Adicionando a dependência `spring-boot-starter-data-jpa` ao arquivo `pom.xml`:

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
```

Criamos então a classe `User`:

```java
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tab_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Integer id;
    @Column(length = 50, nullable = false)
    private String name;
    @Column(length = 50, nullable = false, unique = true)
    private String username;
    @Column(length = 100, nullable = false)
    private String password;
    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "tab_user_roles", joinColumns = @JoinColumn(name = "id_user"))
    @Column(name = "role_id")
    private List<Integer> roles = new ArrayList<>();

    public User() {
    }

    public User(String username) {
        this.username = username;
    }

    //getters e setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Integer> getRoles() {
        return roles;
    }

    public void setRoles(List<Integer> roles) {
        this.roles = roles;
    }

    public void addRole(Integer role) {
        this.roles.add(role);
    }

    public void removeRole(Integer role) {
        this.roles.remove(role);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", roles=" + roles +
                '}';
    }
}
```

Criamos agora um repositório para a entidade `User`:

```java
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    @Query("SELECT u FROM User u JOIN FETCH u.roles WHERE u.username = :username"
    User findByUsername(@Param("username") String username);

    @Query("SELECT u FROM User u JOIN FETCH u.roles WHERE u.username = :username AND u.password = :password")
    User findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

    @Query("SELECT u FROM User u JOIN FETCH u.roles WHERE u.id = :id")
    User findById(@Param("id") Integer id);

    @Query("SELECT u FROM User u JOIN FETCH u.roles")
    List<User> findAll();

    @Query("INSERT INTO User u (u.name, u.username, u.password) VALUES (:name, :username, :password)")
    User save(@Param("name") String name, @Param("username") String username, @Param("password") String password);

    @Query("UPDATE User u SET u.name = :name, u.username = :username, u.password = :password WHERE u.id = :id")
    User update(@Param("id") Integer id, @Param("name") String name, @Param("username") String username, @Param("password") String password);

    @Query("DELETE FROM User u WHERE u.id = :id")
    void deleteById(@Param("id") Integer id);
}
```

## UserDetailService

A interface *UserDetailService* é usada para recuperar dados relacionados ao usuário. Ele possui um método denomidano `LoadUserByUsername()` que pode ser substituído para carregar informações do usuário.

Podemos então criar uma classe **SecurityDatabaseService.java** que implementará a interface `UserDetailsService`:

```java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.HashSet;
import java.util.Set;

@Service
public class SecurityDatabaseService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);

        if (user == null) {
            throw new UsernameNotFoundException("User not found");

        }
        Set<GrantedAuthority> authorities = new HashSet<>();
        for (Integer role : user.getRoles()) {
            authorities.add(new SimpleGrantedAuthority("ROLE_" + role));
        }

        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), authorities);
    }
}
```

## WebSecurityConfig

Agora vamos configurar o `WebSecurityConfig.java` para utilizar o `UserDetailsService`:

```java
import dio.web.api.controller.SecurityDatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private SecurityDatabaseService securityDatabaseService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(securityDatabaseService).passwordEncoder(NoOpPasswordEncoder.getInstance());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
                .antMatchers("/", "/home").permitAll()
                .antMatchers("/login").permitAll()
                .antMatchers("/managers").hasRole("MANAGERS")
                .antMatchers("/users").hasRole("USERS")
                .anyRequest().authenticated()
                .and()
                .formLogin().loginPage("/login").permitAll()
                .and()
                .logout().permitAll();
    }
}
```

## Sign Up

Agora posemos dar uma carga inicial de usuários em nossa aplicação.

Criamos a classe **StartApplication.java&& que implementa a interface `CommandLineRunner`:

```java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class StartApplication implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        User user = new User("admin");
        user.setName("Administrador");
        user.setPassword("admin123");
        user.addRole(1);
        user.addRole(2);
        userRepository.save(user);

        user = new User("user");
        user.setName("Usuário");
        user.setPassword("user123");
        user.addRole(1);
        userRepository.save(user);

        user = new User("manager");
        user.setName("Gerente");
        user.setPassword("manager123");
        user.addRole(2);
        userRepository.save(user);

        user = new User("guest");
        user.setName("Convidado");
        user.setPassword("guest123");
        userRepository.save(user);

        user = new User("user2");
        user.setName("Usuário 2");
        user.setPassword("user123");
        user.addRole(1);
        userRepository.save(user);

        user = new User("manager2");
        user.setName("Gerente 2");
        user.setPassword("manager123");
        user.addRole(2);
        userRepository.save(user);
    }
}
```

Por fim adicionamos a dependência do banco de dados escolhido.

```xml
<dependency>
    <groupId>com.h2database</groupId>
    <artifactId>h2</artifactId>
    <scope>runtime</scope>
</dependency>
```

E configuramos o arquivo `application.properties`:

```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.ddl-auto=create
```

Agora podemos rodar a aplicação e acessar o banco de dados H2 em `http://localhost:8080/h2-console`.




