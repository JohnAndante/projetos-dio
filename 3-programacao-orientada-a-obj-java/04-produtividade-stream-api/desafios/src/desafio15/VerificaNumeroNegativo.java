package desafio15;

import java.util.Arrays;
import java.util.List;

/*
 ? Desafio 15 - Verifique se a lista contém pelo menos um número negativo:
 * Utilizando a Stream API, verifique se a lista contém pelo menos um número
 * negativo e exiba o resultado no console.
 */
public class VerificaNumeroNegativo {
    public static void verificaNumeroNegativo(List<Integer> numeros) {
        boolean possuiNumeroNegativo = numeros.stream()
                .anyMatch(n -> n < 0);

        System.out.println(possuiNumeroNegativo
                ? "A lista informada possui números negativos."
                : "A lista informada não possui números negativos.");

    }

    public static void main(String[] args) {
        // Lista de numeros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        verificaNumeroNegativo(numeros);
    }
}
