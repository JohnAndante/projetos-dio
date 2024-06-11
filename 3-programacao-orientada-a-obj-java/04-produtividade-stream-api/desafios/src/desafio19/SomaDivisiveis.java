package desafio19;

import java.util.Arrays;
import java.util.List;

/*
 ? Desafio 19 - Encontre a soma dos números divisíveis por 3 e 5:
 * Com a Stream API, encontre a soma dos números da lista que são
 *  divisíveis tanto por 3 quanto por 5 e exiba o resultado no console.
 */

public class SomaDivisiveis {

    public static void somaDivisiveis(List<Integer> numeros, int num1, int num2) {
        int soma = numeros.stream()
                .filter(n -> (n % num1 == 0) && (n % num2 == 0))
                .reduce(0, Integer::sum);

        System.out.println("A soma dos números da lista divisíveis por " + num1 + " e " + num2 + " é: " + soma);
    }

    public static void main(String[] args) {
        // Lista de números
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        somaDivisiveis(numeros, 5, 9);
    }
}
