# Herança #

"Nem tudo se copia, as vezes se herda." - Desconhecido

Características e comportamentos de uma classe podem ser herdados por outra. A herança é um dos pilares da programação orientada a objetos e é utilizada para reutilizar código e facilitar a manutenção. A classe que herda é chamada de subclasse e a classe que é herdada é chamada de superclasse.

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

}
```

