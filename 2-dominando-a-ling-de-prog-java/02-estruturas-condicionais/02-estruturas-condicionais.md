## Estruturas Condicionais ##

Estruturas condicionais possibilitam a escolha de um grupo de ações e comportamentos a serem executados quando determinadas condições são ou não satisfeitas. A estrutura condicional pode ser simples ou composta.

### Estrutura Condicional Simples ###
Ocorre quando uma validação de execução de fluxo somente quando a condição for positiva, consideramos como uma estrutura Simples.

```java
sacar() {
    if (saldo >= valor) {
        saldo -= valor;
    }
}
```
Início -> Condição -> Ação -> Fim

### Estrutura Condicional Composta ###
Ocorre quando uma validação de execução de fluxo quando a condição for positiva e outra quando a condição for negativa, consideramos como uma estrutura Composta.

```java
sacar() {
    if (saldo >= valor) {
        saldo -= valor;
    } else {
        System.out.println("Saldo insuficiente");
    }
}
```
Início -> Condição -> Ação se verdadeiro -> Fim
            |-> Ação se falso -> Fim

### Estrutura Condicional Encadeada ###
Quando em um controle de fluxo funcional, nem sempre nos limitamos ao if e else, podemos ter uma terceira, quarta ou mais condições a serem validadas. Neste caso, utilizamos o else if.

```java
sacar() {
    if (saldo >= valor) {
        saldo -= valor;
    } else if (saldo < valor && saldo >= valor + 10) {
        saldo -= valor + 10;
    } else {
        System.out.println("Saldo insuficiente");
    }
}
```

Início -> Condição 1 -> Ação 1 -> Fim
      |-> Condição 2 -> Ação 2 -> Fim
      |-> Condição 3 -> Ação 3 -> Fim

### Estruturas Condicionais Ternárias ###
A estrutura condicional ternária é uma forma simplificada de escrever uma estrutura condicional simples. Ela é composta por três partes: a condição, o valor a ser retornado caso a condição seja verdadeira e o valor a ser retornado caso a condição seja falsa.

```java
int a = 10;
int b = 20;

int maior = (a > b) ? a : b;
```

### Estrutura Condicional Switch ###
A estrutura switch compara o valor de cada caso com o da variável sequencialmente, e sempre que encontra um valor correspondente, executa o código associado ao caso. Para evitar que as comparações continuem a ser executadas após um caso correspondente ter sido encontrado, acrescentamos o comando break no final de cada bloco de códigos. O comando break, quando executado, encerra a execução da estrutura onde ele se encontra.

```java
switch (dia) {
    case 1:
        System.out.println("Domingo");
        break;
    case 2:
        System.out.println("Segunda-feira");
        break;
    case 3:
        System.out.println("Terça-feira");
        break;
    case 4:
        System.out.println("Quarta-feira");
        break;
    case 5:
        System.out.println("Quinta-feira");
        break;
    case 6:
        System.out.println("Sexta-feira");
        break;
    case 7:
        System.out.println("Sábado");
        break;
    default:
        System.out.println("Dia inválido");
}
```


