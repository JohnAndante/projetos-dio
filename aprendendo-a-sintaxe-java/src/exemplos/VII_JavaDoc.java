package exemplos;

public class VII_JavaDoc {

    /**
     * ? Java Documentation
     * Java documentation é composto por tags que representam dados
     * relevantes para a compreensão da proposta de uma classe e os
     * conjuntos de seus métodos e atributos.
     *
     * @author - Autor da classe
     * @version - Versão da classe
     * @since - Desde qual versão a classe está disponível
     * @param - Parâmetro de um método
     * @return - Retorno de um método
     * @throws - Exceção lançada por um método
     *
     */
    private void exemplo() {
        System.out.println("Exemplo de JavaDoc");
    }

    /**
     * <h1>Calculadora</h1>
     * A calculadora realiza operações matemáticas básicas entre números.
     * <p>
     * <b>Note: </b> Leia atentamente a documentação desta classe para
     * desfrutar dos recursos oferecidos pelo autor.
     *
     * @author Walker Silvestre
     * @version 1.0
     * @since 2024
     */
    private class Calculadora {
        /**
         * Este método é utilizado para somar dois números inteiros.
         *
         * @param numOne - Primeiro número inteiro
         * @param numTwo - Segundo número inteiro
         * @return int o resultado deste método é a soma dos dois outros números
         */
        public int somar(int numOne, int numTwo) {
            return numOne + numTwo;
        }

    }

    // Comentário de uma linha

    /*
     * Comentário de várias linhas
     */

    /**
     * Comentário de documentação
     *
     * @param args
     */

     /* Criando documentação no formato html para disponibilizar via web
      * 1. Execute no terminal o seguinte comando:
      * javadoc -encoding UTF-8 -docencoding ISO-8859-1 -d ../docs src/*.java [ou o caminho do arquivo]
      */

    public static void main(String[] args) {
    }
}
