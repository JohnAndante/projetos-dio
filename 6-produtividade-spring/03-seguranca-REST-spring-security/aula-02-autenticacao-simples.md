# Autenticação Simples

> O Spring possui algumas configurações para definir os usuários na sua camada de segurança.

<br/>

Como sabemos por padrão o **Sprint Security** habilita um usuário de nome `user` e uma senha gerada aleatoriamente em cada inicialização. Mas podemos definir nossos próprios usuários e senhas.

## No arquivo `application.properties`

O **Spring Security** permite que você defina usuários e senhas no arquivo `application.properties`:

```properties
spring.security.user.name=admin
spring.security.user.password=admin
```

## Em memória

Você pode definir usuários e senhas em memória, criando uma classe de configuração que estende `WebSecurityConfigurerAdapter` e sobrescrevendo o método `configure(AuthenticationManagerBuilder auth)`:

```java
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
            .withUser("user")
            .password("{noop}user123")
            .roles("USERS");
            .and()
            .withUser("admin")
            .password("{noop}admin123")
            .roles("MANAGERS");

    }
}
```

Nas novas versões do Spring Security, é necessário adicionar `{noop}` antes da senha para indicar que a senha não está codificada.

Existem algumas implementações de **criptografias** utilizadas pelo **Spring Security**:

* Use `{bcrypt}` for **BCryptPasswordEncoder** (mais comum)
* Use `{noop}` for **NoOpPasswordEncoder**
* Use `{pbkdf2}` for **Pbkdf2PasswordEncoder**
* Use `{scrypt}` for **SCryptPasswordEncoder**
* Use `{sha256}` for **StandardPasswordEncoder**
* Use `{argon2}` for **Argon2PasswordEncoder**


