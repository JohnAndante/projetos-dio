package dio.springboot;

import org.springframework.stereotype.Component;

/*
 * Usamos essa anotação para indicar que é um componente gerenciado pelo Sprint
 */
@Component
public class Calculadora {

    public int somar(int a, int b) {
        return a + b;
    }
}
