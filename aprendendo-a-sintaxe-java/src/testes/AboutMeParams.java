package testes;

public class AboutMeParams {
    public static void main(String[] args) {
        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.parseInt(args[2]);
        double altura = Double.parseDouble(args[3]);

        System.out.println("Olá! Me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("e " + altura + " de altura.");

        /*
         * $ java --enable-preview testes.AboutMe Cleito Rasta 19 190
         *
         * Olá! Me chamo Cleito Rasta
         * Tenho 19 anos
         * e 190.0 de altura.
         */
    }
}
