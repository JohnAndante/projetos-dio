package dio.springboot.app.aula04;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem2 implements CommandLineRunner {

    /*
     * A anotação @Value é usada para injetar valores/dados de um arquivo de
     * propriedades, no momento sendo o ./resources/application.properties.
     * Se faz necessário que neste arquivo existam as chaves que identificamos aqui.
     */
    @Value("${nome}")
    private String nome;
    /*
     * Caso o valor não seja encontrado, ele vai usar o valor que identificamos
     * depois do ':'.
     */
    @Value("${emailo:noreply-dio@dio.com.br}")
    private String email;
    @Value("${telefones}")
    private List<Long> telefones;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Mensagem enviada por " + nome
                + "\nEmail: " + email
                + "\nCom telefones para contato: " + telefones);
        System.out.println("Mensagem enviada com sucesso!");
    }

}
