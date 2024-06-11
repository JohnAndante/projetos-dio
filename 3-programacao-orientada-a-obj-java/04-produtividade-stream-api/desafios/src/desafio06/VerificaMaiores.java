package desafio06;

import java.util.Arrays;
import java.util.List;

/*
 ? Desafio 6 - Verificar se a lista contém algum número maior que 10:
 * Utilize a Stream API para verificar se a lista contém algum número
 * maior que 10 e exiba o resultado no console.
 */

public class VerificaMaiores {
    public static void verificaMaiores(List<Integer> numeros) {
        // ? método tradicional
        /*
         * List<Integer> numMaiores = new ArrayList<>();
         * for (Integer num : numeros) {
         * if (num > 10)
         * numMaiores.add(num);
         * }
         *
         * System.out.println("Convencional: " + numMaiores);
         */

        // ? método stream
        List<Integer> numsMaiores = numeros.stream()
                .filter(n -> n > 10)
                .toList();

        System.out.println("Stream: " + numsMaiores);

    }

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        verificaMaiores(numeros);
    }
}
