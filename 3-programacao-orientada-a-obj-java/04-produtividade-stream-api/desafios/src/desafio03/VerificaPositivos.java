package desafio03;

import java.util.Arrays;
import java.util.List;

/*
 ? Desafio 3 - Verifique se todos os números da lista são positivos:
 * Com a ajuda da Stream API, verifique se todos os números da lista são
 * positivos e exiba o resultado no console.
 */
public class VerificaPositivos {
    public static void verificar(List<Integer> numeros) {
        // verificando se todos os numeros são positivos
        List<Integer> numPositivos = numeros.stream()
                .filter(n -> n > 0)
                .toList();

        System.out.println(numPositivos);
    }

    public static void main(String[] args) {
        // Lista de números
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Verificando se todos os números são positivos
        verificar(numeros);
    }
}
