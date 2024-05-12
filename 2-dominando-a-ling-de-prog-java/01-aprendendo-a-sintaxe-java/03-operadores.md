## Operações Aritméticas ##

```java
    double soma = 10.2 + 5.3;
    int subtracao = 10 - 5;
    double multiplicacao = 10.2 * 5.3;
    double divisao = 10.2 / 5.3;
    int resto = 10 % 3;
    int resultado = 10 + 3 * 2;
```

## Concatenação com o operador '+' ##

```java
    String nome = "João";
    String sobrenome = "da Silva";
    String nomeCompleto = nome + " " + sobrenome;
    System.out.println(nomeCompleto); // João da Silva
```

## Operadores Unários ##

```java
    int numero = 10;
    numero = -numero; // -10
    numero = +numero; // 10
    numero = numero * -1; // -10
    numero = numero * +1; // 10
```

## Operadores de Incremento e Decremento ##

```java
    int numero = 10;
    numero++; // 11
    numero--; // 10
    int numero2 = 10;
    int resultado = numero2++; // resultado = 10, numero2 = 11
    int resultado2 = ++numero2; // resultado2 = 12, numero2 = 12
```

## Inversão de valores booleanos ##

```java
boolean variavel = true;

System.out.println(variavel); // true
System.out.println(!variavel); // false
System.out.println(!!variavel); // true

variavel = !variavel;

System.out.println(variavel); // false
```

## Operador ternário ##

```java
    int a, b;
    a = 5;
    b = 10;

    String resultado = "";

    if (a > b) {
        resultado = "a é maior que b";
    } else {
        resultado = "b é maior que a";
    }

    System.out.println(resultado);

    resultado = a > b ? "a é maior que b" : "b é maior que a";

    System.out.println(resultado);

```

## Operadores relacionais ##

```java
    boolean maior = a > b;
    boolean menor = a < b;
    boolean maiorOuIgual = a >= b;
    boolean menorOuIgual = a <= b;
    boolean igual = a == b;
    boolean diferente = a != b;

    String nomeUm = "João";
    String nomeDois = new String("João");

    boolean mesmoNome = nomeUm == nomeDois; // false
    boolean mesmoNome2 = nomeUm.equals(nomeDois); // true

```

A Primeira compara os endereços de memória, no caso um objeto String e uma String literal, o que resulta em false. A segunda compara o conteúdo das Strings, o que resulta em true.

## Operadores lógicos ##

```java
    boolean verdadeiro = true;
    boolean falso = false;

    boolean resultadoE = verdadeiro && falso; // false
    boolean resultadoOU = verdadeiro || falso; // true
    boolean resultadoNao = !verdadeiro; // false
```

## Precedência de Operadores ##

```java
    int resultado = 10 + 3 * 2; // 16
    int resultado2 = (10 + 3) * 2; // 26
```



