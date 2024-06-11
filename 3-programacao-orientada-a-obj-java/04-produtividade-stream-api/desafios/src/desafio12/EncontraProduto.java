package desafio12;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

/*
 ? Desafio 12 - Encontre o produto de todos os números da lista:
 * Com a ajuda da Stream API, encontre o produto de todos os números
 * da lista e exiba o resultado no console.
 */

public class EncontraProduto {

    public static void encontraProduto(List<Integer> numeros) {
        BigInteger produto = numeros.stream()
                .map(BigInteger::valueOf)
                .reduce(BigInteger.ONE, BigInteger::multiply);

        System.out.println("Produto de todos os numeros da lista: " + produto);
    }

    public static void main(String[] args) {
        // Lista de numeros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        encontraProduto(numeros);
    }
}
