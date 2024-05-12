public class Aula01 {
    public static void main(String[] args) throws Exception {
        /*
         * Estruturas excepcionais
         * Ao executar o código, diferentes erros podem acontecer.
         * Quando ocorre um rerro, o programa é interrompido e uma
         * mensagem de erro é exibida.
         *
         * De forma interpretativa em Java, um erro é algo irreparável
         * e o programa é interrompido.
         *
         * Temos a possibilidade de tratar esses erros, para que o
         * programa não seja interrompido.
         *
         * Para tratar esses erros, utilizamos as estruturas de exceção.
         *
         * Existem dois tipos de exceções:
         * - Exceções verificadas: são exceções que o compilador obriga
         * a tratar.
         * - Exceções não verificadas: são exceções que o compilador
         * não obriga a tratar.
         *
         * Para tratar exceções, utilizamos as palavras reservadas:
         * - try: tenta executar um bloco de código.
         * - catch: captura uma exceção.
         * - finally: executa um bloco de código, independente de ter
         * ocorrido uma exceção ou não.
         * - throw: lança uma exceção.
         * - throws: declara que um método pode lançar uma exceção.
         *
         * try {
         * . . . // código que pode lançar uma exceção
         * } catch (Exception e) {
         * . . . // código que trata a exceção
         * } finally {
         * . . . // código que sempre será executado
         * }
         *
         * Exemplo:
         * try {
         * . . int[] numeros = new int[5];
         * . . System.out.println(numeros[6]);
         * } catch (ArrayIndexOutOfBoundsException e) {
         * . . System.out.println("Erro: índice fora do limite do array");
         * } finally {
         * . . System.out.println("Fim do programa");
         * }
         *
         * O código acima tenta acessar um índice fora do limite do array.
         * Como o índice não existe, uma exceção é lançada e capturada
         * pelo bloco catch.
         * O bloco finally é executado, independente de ter ocorrido uma
         * exceção ou não.
         *
         *
         *
         */
    }
}
