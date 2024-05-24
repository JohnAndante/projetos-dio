# Polimorfismo #

O conceito de polimorfismo é a capacidade de um objeto de se comportar de diferentes formas. Em POO, o polimorfismo é utilizado para criar métodos com o mesmo nome, mas com comportamentos diferentes. Isso permite que um método seja chamado de diferentes formas, dependendo do objeto que o chama.

Para que o polimorfismo funcione, é necessário que exista uma relação de herança entre as classes envolvidas. Isso significa que uma classe deve herdar de outra para que o polimorfismo possa ser aplicado.

O polimorfismo pode ser dividido em dois tipos: polimorfismo de sobrecarga e polimorfismo de sobrescrita.

## Polimorfismo de Sobrecarga ##

O polimorfismo de sobrecarga ocorre quando uma classe possui vários métodos com o mesmo nome, mas com parâmetros diferentes. Isso permite que um método seja chamado de diferentes formas, dependendo dos parâmetros passados.

## Exemplo ##

```java

public class Calculadora {

    public int somar(int a, int b) {
        return a + b;
    }

    public double somar(double a, double b) {
        return a + b;
    }

    public int somar(int a, int b, int c) {
        return a + b + c;
    }

}

public class Main {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println(calc.somar(2, 3));          // Saída: 5
        System.out.println(calc.somar(2.5, 3.5));      // Saída: 6.0
        System.out.println(calc.somar(2, 3, 4));       // Saída: 9
    }

}
```

Neste exemplo, a classe `Calculadora` possui três métodos com o mesmo nome `somar`, mas com parâmetros diferentes. Isso permite que o método `somar` seja chamado de diferentes formas, dependendo dos parâmetros passados.

## Polimorfismo de Sobrescrita ##

O polimorfismo de sobrescrita ocorre quando uma classe filha redefine um método da classe pai. Isso permite que a classe filha tenha seu próprio comportamento para o método, sem alterar a assinatura do método na classe pai.

## Exemplo ##

```java

public abstract class Animal {

    public abstract void emitirSom();

}

public class Cachorro extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("Au Au");
    }

}

public class Gato extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }

}

public class Main {

    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();

        cachorro.emitirSom();   // Saída: Au Au
        gato.emitirSom();       // Saída: Miau
    }

}
```

Neste exemplo, a classe `Animal` possui um método abstrato `emitirSom`, que é redefinido pelas classes `Cachorro` e `Gato`. Isso permite que cada classe tenha seu próprio comportamento para o método `emitirSom

---

