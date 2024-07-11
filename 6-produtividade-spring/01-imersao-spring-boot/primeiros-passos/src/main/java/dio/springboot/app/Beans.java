package dio.springboot.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

// import com.google.gson.Gson;
import dio.springboot.app.aula03.Remetente;

/*
 * Anotação adicionada para garantir que o Spring entenda que essa classe é responsável
 * por criar objetos que serão gerenciados por ele. Mais pra não dar erro mesmo.
 */
@Configuration
public class Beans {

    /*
     * A anotação @Bean indica que o método é responsável por criar um objeto que
     * será gerenciado pelo Spring. No caso estamos criando um objeto do tipo Gson
     * para ser injetado em outras classes, sem usar o new.
     * Fazemos essa anotação pois não conseguimos colocar um @Autowired em um objeto
     * que não é gerenciado pelo Spring,
     * ou seja, que não é um componente (com a anotação @component)
     */

    /* Aula 02 */
    /*
     * @Bean public Gson gson() { return new Gson(); }
     */

    /* Aula 03 */
    @Bean
    /*
     * A anotação @Scope("prototype") indica que o Spring deve criar um novo objeto
     * sempre que for injetado em outra classe.
     */
    @Scope("prototype")
    public Remetente remetente() {
        System.out.println("CRIANDO UM OBJETO REMETENTE");
        Remetente remetente = new Remetente();
        remetente.setEmail("noreply@dio.com.br");
        remetente.setNome("Digital Innovation One");
        return remetente;
    }
}
