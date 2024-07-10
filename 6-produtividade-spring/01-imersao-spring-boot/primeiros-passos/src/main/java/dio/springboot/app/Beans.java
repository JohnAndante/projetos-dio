package dio.springboot.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.gson.Gson;

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
    @Bean
    public Gson gson() {
        return new Gson();
    }
}
