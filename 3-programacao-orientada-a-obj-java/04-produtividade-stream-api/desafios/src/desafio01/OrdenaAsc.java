package desafio01;

import java.util.Arrays;
import java.util.List;

/*
 ? Desafio 1 - Mostre a lista na ordem numérica:
 * Crie um programa que utilize a Stream API para ordenar a lista de números em
 * ordem crescente e a exiba no console.
 */
public class OrdenaAsc {
    public static void ordenar(List<Integer> numeros) {
        // ordenando a lista
        int[] numsOrdenados = numeros.stream()
                .mapToInt(Integer::intValue)
                .sorted()
                .toArray();

        // Exibindo a lista ordenada
        System.out.println(Arrays.toString(numsOrdenados));
    }

    public static void main(String[] args) {
        // Lista de números
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Ordenando a lista com o método ordenar
        ordenar(numeros);
    }
}
