## Java Documentation (Javadoc) ##

Java documentation é composto por tags que representam dados relevantes para a compreensão da proposta de uma classe e os conjuntos de seus métodos e atributos.

A documentação é feita em forma de comentários, que são interpretados pelo Javadoc e transformados em páginas HTML.

```java
/**
 * Classe que representa um carro.
 */
```

No javadoc é possível adicionar tags que representam informações relevantes sobre a classe, como autor, versão, data de criação, entre outras.

As tags são precedidas por um @ e são interpretadas pelo Javadoc.
As tags mais comuns são:

- @author
- @version
- @since
- @param
- @return
- @throws
- @see
- @deprecated


```java
/**
 * Classe que representa um carro.
 * @author João
 * @version 1.0
 * @since 1.0
 */
```

```java
/**
 * Método que soma dois números.
 * @param a Primeiro número a ser somado.
 * @param b Segundo número a ser somado.
 * @return Soma dos dois números.
 */
public double somar(double a, double b) {
    return a + b;
}
```

```java
/**
 * Método que divide dois números.
 * @param dividendo Número a ser dividido.
 * @param divisor Número pelo qual o dividendo será dividido.
 * @return Resultado da divisão.
 * @throws IllegalArgumentException Caso o divisor seja zero.
 */
public double dividir(int dividendo, int divisor) {
    if (divisor == 0) {
        throw new IllegalArgumentException("Divisor não pode ser zero");
    }
    return dividendo / divisor;
}
```

```java
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
```

```java
// Comentário de uma linha
/* Comentário de várias linhas */
/** Comentário de documentação */
```

### Gerando a documentação ###

Para gerar a documentação, basta executar o comando `javadoc` seguido do nome do arquivo que contém a classe que será documentada.

```bash
javadoc Calculadora.java
```

Para gerar a documentação de todas as classes de um pacote, basta executar o comando `javadoc` seguido do nome do pacote.

```bash
javadoc pacote
```

Nos exemplos apresentados em aula, esse foi código usado para gerar um javadoc:

```bash
javadoc -encoding UTF-8 -docencoding ISO-8859-1 -d ../docs src/*.java [ou o caminho do arquivo]
```


