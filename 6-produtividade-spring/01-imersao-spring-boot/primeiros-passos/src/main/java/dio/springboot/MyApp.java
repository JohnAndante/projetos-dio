package dio.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/*
* Usamos essa anotação para indicar que é um componente gerenciado pelo Sprint,
* assim como a classe Calculadora
*/
@Component
public class MyApp implements CommandLineRunner { // Implementa a interface CommandLineRunner para rodar o método run
    /*
     * Para evitar de instanciar a classe Calculadora, usamos essa anotação, assim o
     * spring lida com isso sozinho
     */
    @Autowired
    private Calculadora calculadora;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("O resultado é " + calculadora.somar(1, 2));
    }

}
