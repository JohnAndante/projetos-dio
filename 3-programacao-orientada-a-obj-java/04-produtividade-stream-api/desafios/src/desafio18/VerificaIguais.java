package desafio18;

import java.util.Arrays;
import java.util.List;

/*
 ? Desafio 18 - Verifique se todos os números da lista são iguais:
 * Utilizando a Stream API, verifique se todos os números da lista são
 * iguais e exiba o resultado no console.
 */

public class VerificaIguais {
    public static void verificaIguais(List<Integer> numeros) {
        boolean todosIguais = numeros.stream()
                .allMatch(n -> n.equals(numeros.get(0)));

        System.out.println(todosIguais
                ? "Todos os números da lista são iguais"
                : "Os números da lista diferem entre si");
    }

    public static void main(String[] args) {
        // Lista de números
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        verificaIguais(numeros);
    }
}
