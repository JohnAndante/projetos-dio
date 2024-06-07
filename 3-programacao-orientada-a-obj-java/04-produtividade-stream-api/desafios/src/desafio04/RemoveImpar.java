package desafio04;

import java.util.Arrays;
import java.util.List;

/*
 ? Desafio 4 - Remova todos os valores ímpares:
 * Utilize a Stream API para remover os valores ímpares da lista e
 * imprima a lista resultante no console.
 */

public class RemoveImpar {
    public static void removeImpares(List<Integer> numeros) {
        // Verifica e remove os numeros impares
        List<Integer> numPares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        System.out.println(numPares);
    }

    public static void main(String[] args) {
        // Lista de numeros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Remove numeros impares
        removeImpares(numeros);

    }
}
