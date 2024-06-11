package desafio17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/*
 ? Desafio 17 - Filtrar os números primos da lista:
 * Com a ajuda da Stream API, filtre os números primos
 *  da lista e exiba o resultado no console.
 */

public class FiltraPrimos {

    public static void filtraPrimos(List<Integer> numeros) {
        List<Integer> numPrimos = numeros.stream()
                .filter(num -> num > 1 && IntStream
                        .range(2, num)
                        .noneMatch(i -> num % i == 0))
                .toList();

        System.out.println("Números primos da lista: " + numPrimos);

    }

    public static void main(String[] args) {
        // Lista de números
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        filtraPrimos(numeros);
    }
}
