## Hierarquia das exceções ##

A linguagem java dispõe de uma variedade de classes que representam exceções, e estas classes são organizadas em uma hierarquia denominada `Checked Exceptions` e `Unchecked Exceptions`.

> O que determina uma exceção de ser `Checked` ou `Unchecked`?
> É o risco dela ser disparada e logo ser tratada.

```java
import java.text.NumberFormat;

public class ExemploExcecao {
    public static void main(String[] args) {
        Number valor = Double.valueOf("a1.75"); // NumberFormatException

        valor = NumberFormat.getInstance().parse("a1.75"); // ParseException

        System.out.println(valor);
    }
}
```

No exemplo acima, temos duas exceções que podem ser lançadas.
A primeira ocorre na linha 5, onde tentamos converter uma string para um número. Quando no ambiente de desenvolvimento, o compilador não consegue identificar que a string não é um número, e por isso, não consegue lançar uma exceção. Por isso, a exceção `NumberFormatException` é uma exceção `Unchecked`.
A segunda exceção ocorre na linha 7, onde tentamos converter uma string para um número. Neste caso, o compilador consegue identificar que a string não é um número, e por isso, lança uma exceção. Por isso, a exceção `ParseException` é uma exceção `Checked`. Neste caso inclusive o ambiente pode sugerir que o programador trate a exceção, pois é uma exceção que pode ser tratada.

```java
import java.text.NumberFormat;

public class ExemploExcecao {
    public static void  main(String[] args) {
        try {
            Number valor = Double.valueOf("a1.75"); // NumberFormatException

            valor = NumberFormat.getInstance().parse("a1.75"); // ParseException

            System.out.println(valor);
        } catch (ParseException e) {
            System.out.println("Erro ao converter a string em número");
        }
    }
}
```
Em resumo, uma exceção `Checked` é uma exceção que o compilador obriga a tratar, ele geralmente acusa o erro e impede que você compile o código.
Já uma exceção `Unchecked` é uma exceção que o compilador não obriga a tratar. São exceções que podem acontecer durante a compilação ou a execução do programa.

## Exceções Customizadas ##

Podemos criar nossas próprias exceções baseadas em regras de negócio e assim melhor direcionar quem for utilizar os recursos desenvolvidos no projeto, exemplo:

```java
public class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }
}
```

```java
public class Conta {
    private double saldo;

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (saldo < valor) {
            throw new SaldoInsuficienteException("Saldo insuficiente para sacar o valor de " + valor);
        }
        saldo -= valor;
    }
}
```

```java
public class ExemploExcecao {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.sacar(100);
    }
}
```

No exemplo acima, criamos uma exceção `SaldoInsuficienteException` que estende de `Exception`. Esta exceção é lançada quando o saldo da conta é insuficiente para realizar um saque.

