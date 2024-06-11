package desafio08;

import java.util.Arrays;
import java.util.List;

/*
 ? Desafio 8 - Somar os dígitos de todos os números da lista:
 * Utilizando a Stream API, realize a soma dos dígitos de todos
 * os números da lista e exiba o resultado no console.
 */
public class SomaNumeros {
    public static void somaNumeros(List<Integer> numeros) {
        int soma = numeros.stream()
            .reduce(0, Integer::sum);

            System.out.println("Soma: " +  soma);
        }

    public static void main(String[] args) {
        // Lista de numeros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        somaNumeros(numeros);
    }
}
