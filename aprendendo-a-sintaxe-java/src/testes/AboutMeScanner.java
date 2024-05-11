package testes;

import java.util.Locale;
import java.util.Scanner;

public class AboutMeScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.nextLine();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.nextLine();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        System.out.println("Olá! Me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("e " + altura + " de altura.");

        scanner.close();

        /*
         * $ java --enable-preview testes.AboutMeScanner
         * > Digite seu nome
         * $ Cleito
         * > Digite seu sobrenome
         * $ Rasta
         * > Digite sua idade
         * $ 19
         * > Digite sua altura
         * $ 190
         * > Olá! Me chamo Cleito Rasta
         * > Tenho 19 anos
         * > e 190.0 de altura.
         */
    }
}
