## Configuração - Dependências

Continuando, devemos adicionar as seguintes dependências ao arquivo `pom.xml`:

```xml
<dependency>
    <groupId>io.jsonwebtoken</groupId>
    <artifactId>jjwt</artifactId>
    <version>0.9.1</version>
</dependency>
```

## Estrutura do Projeto

O projeto terá a seguinte estrutura:

### Estrutura de Pacotes

```plaintext
.
├── src
│   └── main
│       └── java
│           └── dio.spring.security.jwt
│               ├── config
│               ├── controller
│               ├── dto
│               ├── model
│               ├── repository
│               ├── security
│               ├── service
│               └── util
└── target
```

Onde:

| Pacote | Descrição |
| --- | --- |
| **model** | Camada que contém as entidades da aplicação |
| **dto** | Camada que contém os objetos de transferência de dados |
| **repository** | Camada que contém as interfaces de acesso ao banco de dados |
| **service** | Camada que contém as regras de negócio da aplicação e comunicação com a base de dados |
| **controller** | Camada que contém os controladores da aplicação dos recursos http expostos da API |
| **security** | Camada que contém as classes de segurança da aplicação |
| **config** | Camada que contém as classes de configuração da aplicação |
| **util** | Camada que contém as classes utilitárias da aplicação |

### Estrutura de Classes

```plaintext
.
├── src
│   └── main
│       └── java
│           └── dio.spring.security.jwt
│               ├── config
│               │   └── SwaggerConfig.java
│               ├── controller
│               │   └── UserController.java
│               ├── dto
│               │   └── UserDTO.java
│               ├── model
│               │   └── User.java
│               ├── repository
│               │   └── UserRepository.java
│               ├── security
│               │   ├── JWTObject.java
│               │   └── JWTCreator.java
│               ├── service
│               │   └── UserService.java
│               └── util
│                   └── PasswordUtils.java
└── target
```


| Classe | Descrição |
| --- | --- |
| **SwaggerConfig** | Configuração do Swagger, classe responsável pela documentação da API |
| **JWTObject** | Classe que representa um Objeto correspondente a estrutura JWT |
| **JWTCreator** | Classe responsável por gerar o Token com base no Objeto e ou instanciar o Objeto JWT com base no Token |
| **UserController** | Controlador da API REST para manipulação de usuários |
| **UserDTO** | Objeto de Transferência de Dados para a entidade `User` |
| **User** | Entidade que representa um usuário |
| **UserRepository** | Interface de acesso ao banco de dados para a entidade `User` |
| **UserService** | Classe de serviço que contém as regras de negócio para a entidade `User` |
| **PasswordUtils** | Classe utilitária para manipulação de senhas |

#### Entidade `User`

Criando a classe `User`:

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
}

#### DTO `UserDTO`

Criando a classe `UserDTO`:

```java
public class UserDTO {
    private Integer id;
    private String name;
    private String username;
    private String password;
    private List<Integer> roles;

    public UserDTO() {
    }

    public UserDTO(Integer id, String name, String username, String password, List<Integer> roles) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.roles = roles;
    }

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

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", roles=" + roles +
                '}';
    }
}
```

#### Repositório `UserRepository`

Criando a interface `UserRepository`:

```java
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    @Query("SELECT u FROM User u WHERE u.username = :username")
    User findByUsername(String username);

    @Query("SELECT u FROM User u JOIN FETCH u.roles WHERE u.username = :username")
    User findByUsernameWithRoles(String username);

    @Query("INSERT INTO tab_user_roles (id_user, role_id) VALUES (:id, :role)")
    void addRole(Integer id, Integer role);

    @Query("DELETE FROM tab_user_roles WHERE id_user = :id AND role_id = :role")
    void removeRole(Integer id, Integer role);

    @Query("INSERT INTO User u (u.name, u.username, u.password) VALUES (:name, :username, :password)")
    void insert(String name, String username, String password);

    @Query("UPDATE User u SET u.name = :name, u.username = :username, u.password = :password WHERE u.id = :id")
    void update(Integer id, String name, String username, String password);

    @Query("DELETE FROM User u WHERE u.id = :id")
    void delete(Integer id);

    @Query("SELECT u FROM User u JOIN FETCH u.roles")
    List<User> findAll();
}
```

#### Serviço `UserService`

Criando a classe `UserService`:

```java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public User save(User user) {
        return repository.save(user);
    }

    public User findById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public User findByUsername(String username) {
        return repository.findByUsername(username);
    }

    public User findByUsernameWithRoles(String username) {
        return repository.findByUsernameWithRoles(username);
    }

    public List<User> findAll() {
        return repository.findAll();
    }

    public void addRole(Integer id, Integer role) {
        repository.addRole(id, role);
    }

    public void removeRole(Integer id, Integer role) {
        repository.removeRole(id, role);
    }

    public void insert(String name, String username, String password) {
        repository.insert(name, username, password);
    }

    public void update(Integer id, String name, String username, String password) {
        repository.update(id, name, username, password);
    }

    public void delete(Integer id) {
        repository.delete(id);
    }
}
```

#### Utilitário `PasswordUtils`

Criando a classe `PasswordUtils`:

```java
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordUtils {
    public static String encrypt(String password) {
        return new BCryptPasswordEncoder().encode(password);
    }

    public static boolean validate(String password, String hash) {
        return new BCryptPasswordEncoder().matches(password, hash);
    }
}
```

#### Configuração `SwaggerConfig`

Criando a classe `SwaggerConfig`:

```java
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("dio.spring.security.jwt.controller"))
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "API RESTful de Usuários",
                "API RESTful para manipulação de usuários.",
                "v1",
                "Terms of service",
                new Contact("DIO", "https://digitalinnovation.one", ""),
                "License of API", "API license URL", Collections.emptyList());
    }

}
```

#### Segurança `JWTObject`

Criando a classe `JWTObject`:

```java
import java.util.List;

public class JWTObject {
    private String subject;
    private List<String> roles;

    public JWTObject() {
    }

    public JWTObject(String subject, List<String> roles) {
        this.subject = subject;
        this.roles = roles;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "JWTObject{" +
                "subject='" + subject + '\'' +
                ", roles=" + roles +
                '}';
    }
}
```

#### Segurança `JWTCreator`

Criando a classe `JWTCreator`:

```java
import io.jsonwebtoken.Jwts;

import java.util.Date;

public class JWTCreator {
    private static final String SECRET = "secret";

    public static String create(JWTObject jwtObject) {
        return Jwts.builder()
                .setSubject(jwtObject.getSubject())
                .claim("roles", jwtObject.getRoles())
                .setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS256, SECRET)
                .compact();
    }

    public static JWTObject parse(String token) {
        Claims claims = Jwts.parser()
                .setSigningKey(SECRET)
                .parseClaimsJws(token)
                .getBody();

        return new JWTObject(claims.getSubject(), claims.get("roles", List.class));
    }
}
```

#### Controlador `UserController`

Criando a classe `UserController`:

```java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity<List<UserDTO>> findAll() {
        List<UserDTO> list = service.findAll().stream().map(UserDTO::new).collect(Collectors.toList());
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> findById(@PathVariable Integer id) {
        User user = service.findById(id);
        return ResponseEntity.ok(new UserDTO(user));
    }

    @PostMapping
    public ResponseEntity<UserDTO> save(@RequestBody UserDTO userDTO) {
        User user = service.save(userDTO.toEntity());
        return ResponseEntity.status(HttpStatus.CREATED).body(new UserDTO(user));
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserDTO> update(@PathVariable Integer id, @RequestBody UserDTO userDTO) {
        User user = service.findById(id);
        user.setName(userDTO.getName());
        user.setUsername(userDTO.getUsername());
        user.setPassword(userDTO.getPassword());
        user.setRoles(userDTO.getRoles());
        user = service.save(user);
        return ResponseEntity.ok(new UserDTO(user));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
```

