# Configure Adapter

Nos exemplos citados anteriormente podemos considerar já certo nível de segurança na aplicação, mas ainda não é o suficiente. Para isso, podemos configurar o `WebSecurityConfigurerAdapter` para definir regras de segurança mais específicas, removendo configurações adicionais dos nossos `@Controllers`.

Na classe `WebSecurityConfig.java` podemos definir o seguinte método:

```java
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

```


