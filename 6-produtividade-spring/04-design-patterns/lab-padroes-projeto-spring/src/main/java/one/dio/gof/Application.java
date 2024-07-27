package one.dio.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * Projeto Spring Boot gerado via Spring Initializr.
 * Os seguintes móulos foram selecionados:
 * - Spring Data JPA
 * - Spring Web
 * - H2 Database
 * - OpenFeign
 *
 *  @author <a href="https://github.com/JohnAndante">JohnAndante</a>
 */
@EnableFeignClients
@SpringBootApplication
@ComponentScan(basePackages = "one.dio.gof")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
