package desafio14;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*
 ? Desafio 14 - Encontre o maior número primo da lista:
 * Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.
 */

public class MaiorNumero {

    public static boolean verificaPrimo(int number) {
        if (number <= 1)
            return false;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void maiorNumero(List<Integer> numeros) {
        Optional<Integer> maiorNum = numeros.stream()
                .filter(MaiorNumero::verificaPrimo)
                .max(Integer::compare);

        System.out.println("O maior número primo da lista informada é de: " + maiorNum.get());

    }

    public static void main(String[] args) {
        // Lista de numeros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        maiorNumero(numeros);
    }
}
