package dio.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.boot.CommandLineRunner;
// import org.springframework.context.annotation.Bean;
// import dio.springboot.app.aula02.ConversorJson;
// import dio.springboot.app.aula02.ViaCepResponse;
// import dio.springboot.app.aula03.SistemaMensagem;

@SpringBootApplication
public class PrimeirosPassosApplication {

	public static void main(String[] args) {
		/* Aula 01 */
		/*
		 * O método run da classe SpringApplication é responsável por iniciar a
		 * aplicação Spring Boot.
		 */
		SpringApplication.run(PrimeirosPassosApplication.class, args);
	}

	/* Aula 02 */
	/*
	 * A anotação @Bean indica que o método é responsável por criar um objeto que
	 * será gerenciado pelo Spring
	 * Esse objeto não é instanciado diretamente, mas sim injetado em outras classes
	 */
	/*
	 * @Bean
	 * public CommandLineRunner run(ConversorJson conversor) throws Exception {
	 * return args -> {
	 * String json =
	 * "{\"cep\":\"01001-000\",\"logradouro\":\"Praça da Sé\",\"complemento\":\"lado ímpar\"}"
	 * ;
	 * ViaCepResponse response = conversor.converter(json);
	 * System.out.println(response);
	 *
	 *
	 * };
	 * }
	 */

	/* Aula 03 */
	/*
	 * @Bean
	 * public CommandLineRunner run(SistemaMensagem sistema) throws Exception {
	 * return args -> {
	 * sistema.enviarConfirmacaoCadastro();
	 * sistema.enviarMensagemBoasVindas();
	 * sistema.enviarConfirmacaoCadastro();
	 * };
	 * }
	 */

}
