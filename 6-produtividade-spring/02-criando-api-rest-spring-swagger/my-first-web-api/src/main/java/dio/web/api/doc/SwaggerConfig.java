package dio.web.api.doc;

import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Arrays;
import java.util.HashSet;

import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    private Contact contato() {
        return new Contact("Nome do contato", "http://www.site.com.br", "123123");
    }

    @SuppressWarnings("unused")
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

    @Bean
    public Docket detalheApi() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2);

        docket
                .select()
                .apis(RequestHandlerSelectors.basePackage("dio.web.api.controller"))
                .paths(PathSelectors.any())
                .build()
                .consumes(new HashSet<String>(Arrays.asList("application/json")))
                .produces(new HashSet<String>(Arrays.asList("application/json")));

        return docket;
    }

}
