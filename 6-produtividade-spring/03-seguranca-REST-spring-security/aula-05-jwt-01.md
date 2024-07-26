# JWT - JSON Web Token

O **JSON Web Token (JWT)** é um padrão aberto (RFC 7519) que define uma maneira compacta e autocontida para transmitir informações com segurança entre as partes como um objeto JSON. Essas informações podem ser verificadas e confiáveis porque são assinadas digitalmente. Os **JWTs** podem ser assinados usando um algoritmo (por exemplo, **HMAC** com **SHA-256** ou **RSA**).

Os **JWTs** são usados para autenticação e troca de informações entre serviços. Eles são usados para verificar a identidade do usuário e fornecer acesso a recursos.

## Estrutura

Um **JWT** é composto por três partes: **Header**, **Payload** e **Signature**.

### Header

O **Header** consiste em dois componentes: o tipo do token, que é JWT, e o algoritmo de assinatura, como **HMAC SHA256** ou **RSA**.

```json
{
  "alg": "HS256",
  "typ": "JWT"
}
```

### Payload

O **Payload** contém as **claims**. As **claims** são declarações sobre uma entidade (geralmente o usuário) e metadados adicionais. Existem três tipos de **claims**: **registered**, **public** e **private**.

```json
{
  "sub": "1234567890",
  "name": "John Doe",
  "admin": true
}
```

### Signature

Para criar a assinatura, você deve codificar o **Header**, o **Payload** e uma chave secreta usando o algoritmo especificado no **Header**. O resultado é então codificado em **Base64**.

## Como funciona

Quando o usuário faz login, o servidor cria um **JWT** e o envia de volta para o cliente. O cliente

armazena o **JWT** e o envia de volta para o servidor em cada solicitação. O servidor verifica a assinatura do **JWT** e, se for válida, permite o acesso ao recurso.

## Vantagens

- **Compacto**: Os **JWTs** são compactos e podem ser enviados em um cabeçalho **HTTP**.
- **Autocontido**: Os **JWTs** contêm todas as informações necessárias para verificar a identidade do usuário.
- **Seguro**: Os **JWTs** podem ser assinados digitalmente para garantir que não tenham sido alterados.

## Desvantagens

- **Tamanho**: Os **JWTs** podem ser grandes, especialmente se contiverem muitas **claims**.
- **Segurança**: Se a chave secreta for comprometida, um invasor pode criar **JWTs** falsos.

## Exemplo

```java
import io.jsonwebtoken.Jwts;

import java.util.Date;

public class JwtExample {

    public static void main(String[] args) {
        String secret = "secret";
        String jwt = Jwts.builder()
                .setSubject("1234567890")
                .claim("name", "John Doe")
                .claim("admin", true)
                .setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS256, secret)
                .compact();

        System.out.println(jwt);
    }
}
```

# Spring Security + JWT

Para usar **JWT** com **Spring Security**, você precisa criar um **filter** que intercepta as solicitações, verifica o **JWT** e, se for válido, permite o acesso ao recurso.

## Dependências

Adicione as seguintes dependências ao arquivo `pom.xml`:

```xml
<dependency>
    <groupId>io.jsonwebtoken</groupId>
    <artifactId>jjwt</artifactId>
    <version>0.9.1</version>
</dependency>
```

## Configuração

Crie uma classe que estende `WebSecurityConfigurerAdapter` e sobrescreva o método `configure(HttpSecurity http)`:
