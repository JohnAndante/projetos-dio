## Introdução

Spring Security é apenas um grupo de filtros de *servlet* que ajudam você a adicionar autenticação e autorização ao seu aplicativo da web.

## Terminologia

- **Autenticação**: Se refere ao processo de verificação da identidade do usuário com base nas credenciais fornecidas. Um exemplo comum é inserir um nome de usuário e uma senha ao fazer login em um aplicativo.

- **Autorização**: Se refere ao processo de determinar se um usuário tem permissão adequada para executar uma ação específica ou ler dados específicos, supondo que o usuário seja autenticado com êxito.

- **Princípio**: Se refere ao usuário autenticado no momento.

- **Autoridade Concedida**: Se refere a uma permissão específica que um princípio tem em um aplicativo.

- **Função**: Se refere a um grupo de autoridades concedidas.

## Habilitando a Segurança

Para habilitar o **Spring Security** em um projeto, você precisa adicionar a dependência `spring-boot-starter-security` ao arquivo `pom.xml`:

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-security</artifactId>
</dependency>
```

Acessando a URL `http://localhost:8080` irá aparecer uma tela de login padrão do **Spring Security**.

## Configuração Padrão

O **Spring Security** possui um usuário padrão chamado `user` e uma senha gerada aleatoriamente que é exibida no console ao iniciar a aplicação.

```bash
Using generated security password: 8b7b3b3b-3b3b-4b3b-8b3b-3b3b3b3b3b3b
```




