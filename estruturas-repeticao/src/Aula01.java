public class Aula01 {
    /*
     * Estruturas de repetição
     * São comandos que permitem iteração de código, que comandos presentes
     * nos blocos sejam repetidos diversas vezes
     *
     * 1. For
     * 2. While
     * 3. Do-While
     *
     * 1. For
     * O comando for permite que uma variável contadora seja testada e
     * incrementada a cada iteração, sendo essas informações definidas na chamada
     * do comando. O comando for recebe como entrada uma variável contadora, a
     * condição e o valor de incrementação.
     *
     * for (inicialização; condição; incremento) {
     * . // bloco de código
     * }
     *
     * for (int i = 0; i < 10; i++) {
     * . System.out.println(i);
     * }
     *
     * 1.1. For em arrays
     * O comando for também pode ser usado para interagir sobre arrays e coleções
     * de dados.
     *
     * int[] numeros = {1, 2, 3, 4, 5};
     * for (int i = 0; i < numeros.length; i++) {
     * . System.out.println(numeros[i]);
     * }
     *
     * 2. For-each
     * O comando for-each permite iterar sobre arrays e coleções de dados sem a
     * necessidade de definir uma variável contadora.
     *
     * for (tipo variável : coleção) {
     * . // bloco de código
     * }
     *
     * int[] numeros = {1, 2, 3, 4, 5};
     * for (int numero : numeros) {
     * . System.out.println(numero);
     * }
     *
     * 2.1. Break e continue
     * O comando break interrompe a execução do laço de repetição, enquanto o
     * comando continue interrompe a iteração atual e passa para a próxima.
     *
     * for (int i = 0; i < 10; i++) {
     * . if (i == 5) {
     * . . break;
     * . }
     * . if (i == 3) {
     * . . continue;
     * . }
     * . System.out.println(i);
     * }
     * // Saída: 0, 1, 2, 4
     *
     * 3. While
     * O comando while executa um bloco de código enquanto uma condição for
     * verdadeira. Valida a condição antes de executar o bloco de código.
     *
     * while (condição) {
     * . // bloco de código
     * }
     *
     * int i = 0;
     * while (i < 10) {
     * . System.out.println(i);
     * . i++;
     * }
     *
     * 3.1. Do-While
     * O comando do-while executa um bloco de código pelo menos uma vez, e
     * enquanto uma condição for verdadeira. Valida a condição após executar o
     * bloco de código.
     *
     * do {
     * . // bloco de código
     * } while (condição);
     *
     * int i = 0;
     * do {
     * . System.out.println(i);
     * . i++;
     * } while (i < 10);
     * // Saída: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
     *
     *
     *
     *
     */
}
