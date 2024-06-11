package desafio10;

import java.util.Arrays;
import java.util.List;

/*
 ? Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:
 * Utilize a Stream API para agrupar os valores ímpares múltiplos
 * de 3 ou de 5 e exiba o resultado no console.
 */
public class AgrupaNumeros {
    public static void agrupaNumeros(List<Integer> numeros) {
        List<Integer> grupoImparesMultiplos = numeros.stream()
                .filter(n -> n % 2 != 0)
                .filter(n -> (n % 3 == 0 || n % 5 == 0))
                .toList();

        System.out.println("Numeros impares multiplos de 3 ou de 5: " + grupoImparesMultiplos);
    }

    public static void main(String[] args) {
        // Lista de numeros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        agrupaNumeros(numeros);
    }
}
