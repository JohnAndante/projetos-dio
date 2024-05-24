# Interface #

Interface é uma classe abstrata que contém apenas métodos abstratos. Ela define um contrato que as classes que a implementam devem seguir. Em Java, uma classe pode implementar múltiplas interfaces, mas não pode herdar de múltiplas classes.

Em outras palavras, uma interface é como um guia que define quais os caminhos e métodos que uma classe deve seguir. Ela não contém implementações de métodos, apenas a assinatura dos métodos.

## Exemplo ##

```java

public interface Animal {

    void emitirSom();

    boolean isMamifero();
}

public class Cachorro implements Animal {

    public void emitirSom() {
        System.out.println("Au au");
    }

    public boolean isMamifero() {
        return true;
    }

}

public class Main {

    public static void main(String[] args) {
        Animal cachorro = new Cachorro();

        cachorro.emitirSom();   // Saída: Au au
        System.out.println(cachorro.isMamifero());  // Saída: true
    }

}
```

Uma classe pode implementar múltiplas interfaces, como no exemplo abaixo:

```java

public interface Animal {

    void emitirSom();

    boolean isMamifero();
}

public interface AnimalDomestico {

    void brincar();
}

public class Cachorro implements Animal, AnimalDomestico {

    public void emitirSom() {
        System.out.println("Au au");
    }

    public boolean isMamifero() {
        return true;
    }

    public void brincar() {
        System.out.println("Brincando com o cachorro");
    }

}

public class Main {

    public static void main(String[] args) {
        Animal cachorro = new Cachorro();

        cachorro.emitirSom();   // Saída: Au au
        System.out.println(cachorro.isMamifero());  // Saída: true

        AnimalDomestico cachorroDomestico = new Cachorro();
        cachorroDomestico.brincar();  // Saída: Brincando com o cachorro
    }

}
```

Neste exemplo, a classe `Cachorro` implementa as interfaces `Animal` e `AnimalDomestico`, que definem os métodos `emitirSom()`, `isMamifero()` e `brincar()`. Isso permite que a classe `Cachorro` tenha comportamentos específicos de um animal e de um animal doméstico.

---


