## Estruturas de Repetição ##

São comandos que permitem iteração de código, que comandos presentes nos blocos sejam repetidos diversas vezes

1. **For**
2. **While**
3. **Do-While**

### 1. For ###
O comando `for` permite que uma variável contadora seja testada e incrementada a cada iteração, sendo essas informações definidas na chamada do comando. O comando `for` recebe como entrada uma *variável contadora*, a *condição* e o *valor de incrementação*.

```java
for (int i = 0; i < 10; i++) {
    System.out.println(i);
}
```
Onde:
- `int i = 0` é a declaração da variável contadora `i` com valor inicial `0`
- `i < 10` é a condição de parada do loop
- `i++` é o incremento da variável contadora

### 1.1. For em arrays ###
O comando `for` também pode ser usado para interagir sobre arrays e coleções de dados.

```java
int[] numeros = {1, 2, 3, 4, 5};
for (int i = 0; i < numeros.length; i++) {
    System.out.println(numeros[i]);
}
```

### 2. For-each ###
O comando `for-each` permite iterar sobre arrays e coleções de dados sem a necessidade de definir uma variável contadora. Neste caso, é necessário um *tipo de dado* e um *nome de variável* para cada elemento da coleção.

```java
int[] numeros = {1, 2, 3, 4, 5};
for (int numero : numeros) {
    System.out.println(numero);
}
```
No exemplo acima, a variável `numero` recebe o valor de cada elemento do array `numeros` a cada iteração.

### 2.1. Break e Continue ###

O comando `break`interrompe a execução do laço de repetição, enquanto o comando `continue` interrompe a iteração atual e passa para a próxima.

```java
for (int i = 0; i < 10; i++) {
    if (i == 5) {
        break;
    }
    if (I == 3) {
        continue;
    }
    System.out.println(i);
    // Saída: 0, 1, 2, 4
}
```

### 3. While ###
O comando `while` executa um bloco de código enquanto uma condição for verdadeira.
Ele valida a condição *antes* de executar o bloco de código.

```java
int i = 0;
while (i < 10) {
    System.out.println(i);
    i++;
}
```

### 3.1. Do-While ###
O comando `do-while` executa um bloco de código enquanto uma condição for verdadeira.
Ele valida a condição *após* executar o bloco de código.

```java
int i = 0;
do {
    System.out.println(i);
    i++;
} while (i < 10);
```


