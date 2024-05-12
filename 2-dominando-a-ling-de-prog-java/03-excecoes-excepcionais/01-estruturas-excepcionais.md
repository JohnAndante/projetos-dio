## Estruturas Excepcionais ##
Ao executar o código, diferentes erros podem acontecer. Quando ocorre um rerro, o programa é interrompido e uma mensagem de erro é exibida.

De forma interpretativa em Java, um erro é algo irreparável e o programa é interrompido.

Temos a possibilidade de tratar esses erros, para que o programa não seja interrompido.

Para tratar esses erros, utilizamos as estruturas de exceção.

Existem dois tipos de exceções em Java:
- **Checked**: são exceções que o compilador obriga a tratar. São exceções que podem acontecer e o programador deve tratar.
- **Unchecked**: são exceções que o compilador não obriga a tratar. São exceções que podem acontecer e o programador não é obrigado a tratar.

Para tratar exceções, utilizamos as palavras-chave `try`, `catch` e `finally`.

### 1. Try ###
O bloco `try` é onde colocamos o código que pode lançar uma exceção.

```java
try {
    // Código que pode lançar uma exceção
}
```

### 2. Catch ###
O bloco `catch` é onde tratamos a exceção lançada no bloco `try`.

```java
try {
    // Código que pode lançar uma exceção
} catch (Exception e) {
    // Tratamento da exceção
}
```

### 3. Finally ###
O bloco `finally` é opcional e é executado após o bloco `try` e `catch`, independentemente de uma exceção ter sido lançada ou não.

```java
try {
    // Código que pode lançar uma exceção
} catch (Exception e) {
    // Tratamento da exceção
} finally {
    // Código que será executado após o bloco try-catch
}
```

### 4. Exemplo ###

```java
try {
    int[] numeros = new int[5];
    System.out.println(numeros[6]);
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Erro: índice fora do limite do array");
} finally {
    System.out.println("Fim do programa");
}
```

O código acima tenta acessar um índice fora do limite do array.
Como o índice não existe, uma exceção é lançada e capturada pelo bloco catch.
O bloco finally é executado, independente de ter ocorrido uma exceção ou não.

