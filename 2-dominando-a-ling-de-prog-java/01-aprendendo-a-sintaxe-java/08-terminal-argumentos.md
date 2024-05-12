## Argumentos de terminal ##

Argumentos de terminal são valores passados para um programa Java no momento de sua execução. Eles são utilizados para configurar o comportamento do programa, como definir um arquivo de entrada ou saída, ativar ou desativar funcionalidades, entre outras possibilidades.

Para acessar os argumentos de terminal em um programa Java, utilizamos o parâmetro `String[] args` no método `main`. Este parâmetro é um array de strings que contém os argumentos passados para o programa.

Vamos criar um programa que recebe dois números inteiros como argumentos de terminal e exibe a soma deles:

```java
public class SomaArgumentos {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Informe dois números inteiros como argumentos.");
            return;
        }

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int soma = a + b;

        System.out.println("A soma de " + a + " e " + b + " é " + soma);
    }

}
```

Para executar o programa, abra o terminal e navegue até o diretório onde o arquivo `SomaArgumentos.java` está localizado. Compile o programa com o comando `javac SomaArgumentos.java` e execute-o com o comando `java SomaArgumentos 10 20`. O resultado será a soma dos números 10 e 20:

```bash
A soma de 10 e 20 é 30
```

Caso você não informe os dois números inteiros como argumentos, o programa exibirá a mensagem "Informe dois números inteiros como argumentos." e encerrará a execução.

