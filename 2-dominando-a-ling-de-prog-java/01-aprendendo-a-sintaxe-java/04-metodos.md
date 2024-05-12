## Métodos ##

Métodos são blocos de código que realizam uma tarefa específica. Eles são usados para dividir um programa em tarefas menores e mais gerenciáveis. Em Java, um método é um bloco de código que é executado quando é chamado. Um método é definido dentro de uma classe e é composto por um cabeçalho e um corpo. O cabeçalho do método contém o modificador de acesso, o tipo de retorno, o nome do método e os parâmetros. O corpo do método contém o código que é executado quando o método é chamado.

```java
    public double somar(double a, double b) {
        return a + b;
    }
```
Neste exemplo o nome descreve corretamente a função do método, que é somar dois doubles.

```java
    public void imprimir(String texto) {
        System.out.println(texto);
    }
```
Neste exemplo o nome descreve corretamente a função do método, que é imprimir um texto.
Note que este método não retorna nada, por isso o tipo de retorno é void.

```java
    public double dividir(int dividendo, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Divisor não pode ser zero");
        }
        return dividendo / divisor;
    }
```

Neste exemplo o nome descreve corretamente a função do método, que é dividir dois inteiros.
Note que este método lança uma exceção caso o divisor seja zero. Isso é feito para evitar uma divisão por zero, que resultaria em uma exceção em tempo de execução.

```java
private void metodoPrivado() {
    System.out.println("Método privado");
}
```

Neste exemplo o nome descreve corretamente a função do método, que é ser um método privado.
Este método só pode ser chamado dentro da classe onde ele está definido.

```java
    public void validar() {

    }
```

Tipo do método incorreto, a partir do nome, este método deve retornar uma boolean

```java
    public void calcularEnviar() {

    }
```

Nome do método incorreto, a partir do nome, este método deve ser dividido em dois métodos, um para calcular e outro para enviar.


