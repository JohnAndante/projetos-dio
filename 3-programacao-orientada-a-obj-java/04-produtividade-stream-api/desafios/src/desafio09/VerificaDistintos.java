package desafio09;

import java.util.Arrays;
import java.util.List;

/*
 ? Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):
 * Com a Stream API, verifique se todos os números da lista são distintos (não se
 * repetem) e exiba o resultado no console.
 */
public class VerificaDistintos {

    public static void verificaDistintos(List<Integer> numeros) {
        List<Integer> numerosDistintos = numeros.stream()
                .distinct()
                .toList();

        System.out.println("Números distintos: " + numerosDistintos);
    }

    public static void main(String[] args) {
        // Lista de numeros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        verificaDistintos(numeros);
    }
}
