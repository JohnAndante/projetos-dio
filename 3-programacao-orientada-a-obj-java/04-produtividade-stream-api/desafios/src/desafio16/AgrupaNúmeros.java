package desafio16;

import java.util.Arrays;
import java.util.List;

/*
 ? Desafio 16 - Agrupe os números em pares e ímpares:
 * Utilize a Stream API para agrupar os números em duas
 * listas separadas, uma contendo os números pares e outra
 * contendo os números ímpares da lista original, e exiba os resultados no console.
 */

public class AgrupaNúmeros {
    public static void agrupaNumeros(List<Integer> numeros) {
        List<Integer> numerosPares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        List<Integer> numerosImpares = numeros.stream()
                .filter(n -> n % 2 != 0)
                .toList();

        System.out.println("Números pares da lista: " + numerosPares);
        System.out.println("Números ímpares da lista: " + numerosImpares);
    }

    public static void main(String[] args) {
        // Lista de numeros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        agrupaNumeros(numeros);
    }
}
