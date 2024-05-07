public class III_Operadores {
    public static void main(String[] args) {

        // * Operações Aritméticas ////////////////////////////////////////

        double soma = 10.1 + 5.2;
        int subtracao = 11 - 2;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 10 % 3;
        int resultado = 10 + 3 * 2;

        // * Concatenação com o operador + ////////////////////////////////

        String nome = "João";
        String sobrenome = "Silva";
        String nomeCompleto = nome + " " + sobrenome;
        System.out.println(nomeCompleto); // João Silva

        // * Operadores Unários ///////////////////////////////////////////

        int numero = 10;

        numero = -numero; // -10

        numero = numero * (-1); // +10

        // * Incremento e Decremento //////////////////////////////////////

        System.out.println(numero + 1); // 11

        numero++;
        System.out.println(numero); // 11

        numero--;
        System.out.println(numero); // 10

        numero += 5;
        System.out.println(numero); // 15

        numero -= 5;
        System.out.println(numero); // 10


        // * Inversão de valores booleanos ////////////////////////////////

        boolean variavel = true;
        System.out.println(!variavel); // false
        System.out.println(variavel); // true

        variavel = !variavel;

        System.out.println(variavel); // false

        // * Operador Ternário ////////////////////////////////////////////

        int a, b;
        a = 5;
        b = 6;

        String resultadoAB = "";

        if (a > b) {
            resultadoAB = "A é maior que B";
        } else {
            resultadoAB = "B é maior que A";
        }

        System.out.println(resultadoAB); // B é maior que A

        resultadoAB = a > b ? "A é maior que B" : "B é maior que A";

        System.out.println(resultadoAB); // B é maior que A

        // * Operadores Relacionais ///////////////////////////////////////

        boolean maior = a > b;
        boolean menor = a < b;
        boolean maiorOuIgual = a >= b;
        boolean menorOuIgual = a <= b;
        boolean igual = a == b;
        boolean diferente = a != b;

        String nomeUm = "João";
        String nomeDois = new String("João");
        System.out.println(nomeUm == nomeDois); // false
        System.out.println(nomeUm.equals(nomeDois)); // true
        // ->   A primeira compara os endereços de memória, no caso um objeto String e
        //      uma String literal
        // ->   A segunda compara o conteúdo dos objetos

        // * Operadores Lógicos ///////////////////////////////////////////

        boolean verdadeiro = true;
        boolean falso = false;

        boolean e = verdadeiro && falso;
        boolean ou = verdadeiro || falso;
        boolean negacao = !verdadeiro;

        // * Precedência de Operadores ////////////////////////////////////

        int precedencia = 10 + 3 * 2; // 16
        int precedenciaParenteses = (10 + 3) * 2; // 26

        
















    }
}
