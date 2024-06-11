package desafio13;

import java.util.Arrays;
import java.util.List;

/*
 ? Desafio 13 - Filtrar os números que estão dentro de um intervalo:
 * Utilize a Stream API para filtrar os números que estão dentro de um intervalo específico (por exemplo, entre 5 e 10) e exiba o resultado no console.
 */

public class FiltraNumeros {

    public static void filtraNumeros(List<Integer> numeros, int num1, int num2) {
        List<Integer> numFiltrados = numeros.stream()
                .filter(n -> (n > num1) && (n < num2))
                .toList();

        System.out.println("Números filtrados entre " + num1 + " e " + num2 + ": " + numFiltrados);
    }

    public static void main(String[] args) {
        // Lista de numeros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        filtraNumeros(numeros, 2, 4);
        filtraNumeros(numeros, 1, 10);
        filtraNumeros(numeros, 2, 8);
    }
}
