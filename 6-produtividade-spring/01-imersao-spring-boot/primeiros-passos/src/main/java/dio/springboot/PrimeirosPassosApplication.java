package dio.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.google.gson.Gson;

import dio.springboot.app.ConversorJson;
import dio.springboot.app.ViaCepResponse;

@SpringBootApplication
public class PrimeirosPassosApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeirosPassosApplication.class, args);
	}

	/*
	 * A anotação @Bean indica que o método é responsável por criar um objeto que
	 * será gerenciado pelo Spring
	 * Esse objeto não é instanciado diretamente, mas sim injetado em outras classes
	 */
	@Bean
	public CommandLineRunner run(ConversorJson conversor) throws Exception {
		return args -> {
			String json = "{\"cep\":\"01001-000\",\"logradouro\":\"Praça da Sé\",\"complemento\":\"lado ímpar\"}";
			ViaCepResponse response = conversor.converter(json);
			System.out.println(response);
		};
	}
}
