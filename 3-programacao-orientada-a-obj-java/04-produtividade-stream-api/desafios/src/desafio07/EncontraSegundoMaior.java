package desafio07;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/*
 ? Desafio 7 - Encontrar o segundo número maior da lista:
 * Com a ajuda da Stream API, encontre o segundo número maior
 * da lista e exiba o resultado no console.
 */

public class EncontraSegundoMaior {
    public static void encontraSegundoMaior(List<Integer> numeros) {
        // ? metodo convencional
        /*
         * int maior = 0;
         * int segundoMaior = 0;
         * for (Integer num : numeros) {
         * if (num > maior) {
         * segundoMaior = maior;
         * maior = num;
         * }
         * }
         * 
         * System.out.println("Convencional: " + segundoMaior);
         */

        // ? metodo com o stream
        Optional<Integer> segundoMaiorOpt = numeros.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        System.out.println("Stream: " + segundoMaiorOpt.get());
    }

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        encontraSegundoMaior(numeros);
    }
}
