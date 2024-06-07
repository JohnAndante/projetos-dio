package desafio05;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

/*
 ? Desafio 5 - Calcule a média dos números maiores que 5:
 * Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
 */

public class CalculaMedia {
    public static void calculaMedia(List<Integer> numeros) {

        // ? metodo convencional
        /*  int soma = 0;
         *  int qtd = 0;
         *  for (Integer num : numeros) {
         *      if (num > 5) {
         *          soma += num;
         *          qtd += 1;
         *      }
         *  }
         */

        // double mediaConv = soma / qtd;
        // System.out.println("Convencional: " + mediaConv);

        // ? metodo convencional, mas mais extenso
        // List<Integer> numsMaioresQueCinco = new ArrayList<>();
        // for (Integer num : numeros) {
        //     if (num > 5)
        //         numsMaioresQueCinco.add(num);
        // }

        // int somaDesc = 0;
        // for (Integer num : numsMaioresQueCinco) {
        //     somaDesc += num;
        // }

        // double mediaDesc = somaDesc / numsMaioresQueCinco.size();
        // System.out.println("Descritivo: " + mediaDesc);

        // ? metodo usando a stream api
        OptionalDouble mediaNums = numeros.stream()
                .filter(n -> n > 5)
                .mapToInt(Integer::intValue)
                .average();

        System.out.println("Usando a Stream API: " + mediaNums.getAsDouble());
    }

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        calculaMedia(numeros);
    }
}
