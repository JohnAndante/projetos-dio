# Pilares do Poo #

Temos 4 pilares da programação orientada a objetos, são eles:

1. **Encapsulamento**
2. **Herança**
3. **Abstração**
4. **Polimorfismo**


## Encapsulamento ##

Nem tudo deve ser acessível por todos. O encapsulamento é o ato de proteger os atributos de uma classe, ou seja, não permitir que eles sejam acessados diretamente. Para isso, utilizamos os modificadores de acesso, que são eles:

1. **public**: Atributos e métodos públicos podem ser acessados por qualquer classe.
2. **private**: Atributos e métodos privados só podem ser acessados pela própria classe.
3. **protected**: Atributos e métodos protegidos só podem ser acessados pela própria classe e por suas subclasses.

## Herança ##

Características e comportamentos de uma classe podem ser herdados por outra. A herança é um dos pilares da programação orientada a objetos e é utilizada para reutilizar código e facilitar a manutenção. A classe que herda é chamada de subclasse e a classe que é herdada é chamada de superclasse.

## Abstração ##

A abstração é o ato de simplificar a complexidade de um sistema, isolando os detalhes mais importantes. Em POO, a abstração é utilizada para definir um modelo genérico que pode ser reutilizado em diferentes situações.

## Polimorfismo ##

O polimorfismo é a capacidade de um objeto de se comportar de diferentes formas. Em POO, o polimorfismo é utilizado para criar métodos com o mesmo nome, mas com comportamentos diferentes. Isso permite que um método seja chamado de diferentes formas, dependendo do objeto que o chama.

Esses são os 4 pilares da programação orientada a objetos. Eles são fundamentais para o desenvolvimento de sistemas mais robustos e flexíveis.

## Exemplo ##

```java

public abstract class Veiculo {
    private String chassi;
    private boolean ligado;

    public void getChassi() {               // Método público
        return this.chassi;
    }

    public void setChassi(String chassi) {  // Método público
        this.chassi = chassi;
    }

    public abstract void ligar();           // Método abstrato

}

public class Carro extends Veiculo {

    public void ligar() {                   // Método público, implementação do método abstrato e herdado da classe Veiculo
        private boolean temCombustivel = confereCombustível();
        private boolean cambioNaPosicaoP = confereCambio();

        if (temCombustivel && cambioNaPosicaoP) {
            this.ligado = true;
            System.out.println("Carro ligado");
        } else {
            this.ligado = false;
            System.out.println("Não foi possível ligar o carro");
        }
    }

    public void desligar() {                // Método público
        System.out.println("Carro desligado");
        this.ligado = false;
    }

    private boolean confereCombustível() {  // Método privado
        System.out.println("Conferindo Combustível...");
        return true;
    }

    private boolean confereCambio() {       // Método privado
        System.out.println("Conferindo Cambio...");
        return true;
    }
}

public class Moto extends Veiculo {

    public void ligar() {                   // Método público, implementação do método abstrato e herdado da classe Veiculo
        System.out.println("Moto ligada");
        this.ligado = true;
    }

}

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();               // Instância da classe Carro
        jeep.ligar();                           // Chama o método ligar()
        jeep.desligar();                        // Chama o método desligar()
        jeep.setChassi("ABC");                  // Chama o método setChassi(), herdado da classe Veiculo
        System.out.println(jeep.getChassi());   // Chama o método getChassi(), herdado da classe Veiculo

        Moto honda = new Moto();                // Instância da classe Moto
        honda.setChassi("123");                 // Chama o método setChassi()
        honda.ligar();                          // Chama o método ligar()
        honda.desligar();                       // Chama o método desligar(), não existe na classe Moto
        honda.getChassi();                      // Chama o método getChassi(), herdado da classe Veiculo

        Veiculo coringa = jeep;                 // Instância da classe Veiculo, referência a um objeto da classe Carro
        coringa.ligar();                        // Chama o método ligar(), da classe Carro

        Veiculo coringa2 = honda;               // Instância da classe Veiculo, referência a um objeto da classe Moto
        coringa2.ligar();                       // Chama o método ligar(), da classe Moto
    }
}

```

Em nosso exemplo, temos uma classe abstrata `Veiculo`. Essa classe possui dois atributos privados, `chassi` e `ligado`, e dois métodos públicos, `getChassi()` e `setChassi()`. Além disso, a classe possui um método abstrato `ligar()`, que deve ser implementado pelas subclasses.

Quando herdados, os métodos possuem o seguinte comportamento:
- Os métodos `getChassi()`e `setChassi()` podem ser acessados por qualquer classe, pois são públicos, os métodos são herdados pelas subclasses e se comportam exatamente como descrito na classe veículo
- O método `ligar()` é abstrato, ou seja, não possui uma implementação (uma descrição de como ele deve funcionar) na classe `Veiculo`. Por isso, ele deve ser implementado pelas subclasses quando herdado.

Temos duas subclasses, `Carro` e `Moto`, que herdam da classe `Veiculo`.

A classe `Carro` possui os métodos `ligar()`, `desligar()`, `confereCombustível()` e `confereCambio()`. Os métodos `ligar()` e `desligar()` são públicos, `confereCombustível()` e `confereCambio()` são privados. O método `ligar()` implementa o método abstrato `ligar()` da classe `Veiculo`, e é responsável por verificar se o carro possui combustível e se o câmbio está na posição P. Se sim, o carro é ligado, caso contrário, não é possível ligar o carro.

A classe `Moto` possui o método `ligar()`, que implementa o método abstrato `ligar()` da classe `Veiculo`. Esse método apenas imprime "Moto ligada".

Temos então uma classe `Autodromo`, que possui o método `main()`. Nesse método, instanciamos um objeto da classe `Carro` e um objeto da classe `Moto`. Em seguida, chamamos os métodos `ligar()`, `desligar()`, `setChassi()` e `getChassi()` de cada objeto. Por fim, criamos duas referências da classe `Veiculo`, que apontam para os objetos da classe `Carro` e `Moto`, e chamamos o método `ligar()` de cada referência.

Ao executar o código, temos a seguinte saída:

```
Conferindo Combustível...
Conferindo Cambio...
Carro ligado
Carro desligado
ABC
Moto ligada
Exception in thread "main" java.lang.Error: Unresolved compilation problem:
    The method desligar() is undefined for the type Veiculo
    at Autodromo.main(Autodromo.java:27)
```

O carro é ligado, desligado e tem seu chassi impresso. A moto é ligada, mas não é possível desligá-la, pois o método `desligar()` não existe na classe `Moto`, e então encontramos um erro de compilação.

Nesse exemplo, vimos os exemplos diretos dos pilares do POO em ação:

- **Encapsulamento**: Atributos privados e métodos públicos e privados, onde em nosso exemplo os métodos `confereCombustível()` e `confereCambio()` são privados e só podem ser acessados pela própria classe.
- **Herança**: A classe `Carro` herda da classe `Veiculo` e implementa o método abstrato `ligar()`.
- **Abstração**: A classe `Veiculo` é abstrata e possui um método abstrato `ligar()`.
- **Polimorfismo**: As referências da classe `Veiculo` chamam o método `ligar()` de acordo com o objeto que apontam.

