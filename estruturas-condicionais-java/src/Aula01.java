public class Aula01 {
    /*
     * Controle de fluxo
     * Habilidade de ajustar a maneira como um programa realiza suas tarefas
     *
     * Classificação
     * Estruturas condicionais - if, else, switch
     * Estruturas de repetição - for, while, do-while
     * Estruturas de exceções - try, catch, finally, throw, throws
     */

    /*
     * > Estruturas condicionais
     * Estruturas condicionais possibilitam a escolha de um grupo de ações e
     * comportamentos a serem executados quando determinadas condições são ou
     * não satisfeitas. A estrutura condicional pode ser simples ou composta.
     *
     * > Condicionais Simples
     * Ocorre quando uma validação de execução de fluxo somente quando a
     * condição for positiva, consideramos como uma estrutura Simples.
     *
     * sacar() {
     * . if (saldo >= valor) {
     * . . saldo -= valor;
     * . }
     * }
     *
     * Início -> Sacar -> Contém saldo?
     * | Sim -> Sacar valor -> Atualiza saldo -> Fim
     * | Não -> Fim
     *
     *
     * > Condicionais Compostas
     * Quando o programa deve seguir mais de uma jornada de execução
     * condicionado a uma regra de negócio, consideramos como uma estrutura
     * composta.
     *
     * emprestimo() {
     * . if (idade >= 18 && salario >= 1000) {
     * . . System.out.println("Empréstimo concedido");
     * . } else {
     * . . System.out.println("Empréstimo negado");
     * }
     *
     * Início -> Empréstimo -> (Idade >= 18? -> Salário >= 1000?)
     * | Sim -> Empréstimo concedido -> Fim
     * | Não -> Empréstimo negado -> Fim
     *
     *
     * > Condicionais encadeadas
     * Quando em um controle de fluxo funcional, nem sempre nos limitamos ao if
     * e else, podemos ter uma terceira, quarta ou mais condições a serem
     * validadas. Consideramos então uma estrutura encadeada.
     *
     * classificacao() {
     * . if (idade < 18) {
     * . . System.out.println("Menor de idade");
     * . } else if (idade >= 18 && idade < 60) {
     * . . System.out.println("Adulto");
     * . } else {
     * . . System.out.println("Idoso");
     * . }
     * }
     *
     * Início -> Classificação -> Idade < 18?
     * | Sim -> Menor de idade
     * -> Idade >= 18 && Idade < 60?
     * | Sim -> Adulto
     * | Não -> Idoso
     *
     *
     * ? Cibdição ternária
     * A condição ternária é uma forma simplificada de escrever uma estrutura
     * condicional, onde a condição é avaliada e o resultado é retornado.
     * A condição ternária é composta por três partes: a condição, o valor
     * retornado se a condição for verdadeira e o valor retornado se a condição
     * for falsa.
     *
     * int idade = 18;
     * String resultado = (idade >= 18) ? "Maior de idade" : "Menor de idade";
     * System.out.println(resultado);
     * // Saída: Maior de idade
     *
     * Início -> Idade >= 18? -> Maior de idade -> Fim
     *
     * > Switch case
     * A estrutura switch compara o valor de cada caso com o da variável
     * sequencialmente, e sempre que encontra um valor correspondente, executa o
     * código associado ao caso. Para evitar que as comparações continuem a ser
     * executadas após um caso correspondente ter sido encontrado, acrescentamos
     * o comando break no final de cada bloco de códigos. O comando break,
     * quando executado, encerra a execução da estrutura onde ele se encontra.
     *
     * switch (dia) {
     * . case 1:
     * . . System.out.println("Domingo");
     * . . break;
     * . case 2:
     * . . System.out.println("Segunda-feira");
     * . . break;
     * . case 3:
     * . . System.out.println("Terça-feira");
     * . . break;
     * . default:
     * . . System.out.println("Dia inválido");
     * }
     *
     * Início -> Dia -> Dia == 1? -> Domingo -> Fim
     *
     */
}
