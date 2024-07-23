# O que é Swagger?

O Swagger é uma linguagem de descrição de interface para descrever APIs RESTful expressas usando JSON. O Swagger é usado junto com um conjunto de ferramentas de software de código aberto para projetar, construir, documentar e usar serviços da Web RESTful.

# Adicionando o Swagger ao projeto

Abra o arquivo pom.xml e adicione a dependência do Swagger:

```xml

<!-- SWAGGER DOCUMENTACAO -->
<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger2</artifactId>
    <version>2.9.2</version>
</dependency>
<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger-ui</artifactId>
    <version>2.9.2</version>
</dependency>

```
Crie então um novo pacote chamado `doc` e dentro dele uma nova classe chamada `SwaggerConfig`:

```java

package dio.web.api.doc;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    // Configurações do Swagger
}

```

Criando método para retornar dados de um **contato**:

```java

package dio.web.api.doc;

import springfox.documentation.service.Contact;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    private Contact contato() {
        return new Contact( "Nome do contato", "http://www.site.com.br", "123123" );
    }
}

```

Criando método para retornar informações da **API**

```java
import springfox.documentation.builders.ApiInfoBuilder;

[...]

private ApiInfoBuilder informacoesApi() {
       ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();

       apiInfoBuilder
           .title("Titulo da API")
           .description("Descrição da API")
           .version("1.0")
           .license("Licença - Open Source")
           .licenseUrl("http://www.site.com.br")
           .contact(this.contato());

        return apiInfoBuilder;
    }

```

Como se trata de uma aplicação SpringBoot, vamos criar um **Docket** (documento) em forma de `@Bean`

```java

import org.springframework.context.annotation.Bean;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.PathSelectors;

[...]

 @Bean
    public Docket detalheApi() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2);

        docket
            .select()
            .apis(RequestHandlerSelectors.basePackage("pacote.comseus.controllers"))
            .paths(PathSelectors.any())
            .build()
            .consumes(new HashSet<String>(Arrays.asList("application/json")))
            .produces(new HashSet<String>(Arrays.asList("application/json")));

            return docket;
    }

```






