# Abstração #

"Abstrair é a arte de esconder detalhes." - Desconhecido

A abstração é o ato de simplificar a complexidade de um sistema, isolando os detalhes mais importantes. Em POO, a abstração é utilizada para definir um modelo genérico que pode ser reutilizado em diferentes situações.

Um exemplo de abstração é a classe `Veiculo`. Ela é um modelo genérico que pode ser utilizado para representar diferentes tipos de veículos, como carros, motos, caminhões, etc. A classe `Veiculo` possui atributos e métodos que são comuns a todos os veículos, como `chassi`, `ligado`, `ligar()`, `desligar()`, etc.

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
```

Neste exemplo, a classe `Veiculo` é um modelo genérico que pode ser utilizado para representar diferentes tipos de veículos. A classe `Carro` herda os atributos e métodos da classe `Veiculo` e implementa o método abstrato `ligar()`. Isso permite que a classe `Carro` tenha seu próprio comportamento ao ligar o veículo, como conferir se há combustível e se o câmbio está na posição correta.

A abstração é um dos pilares da programação orientada a objetos e é fundamental para o desenvolvimento de sistemas mais flexíveis e reutilizáveis. Ela permite que os desenvolvedores criem modelos genéricos que podem ser adaptados para diferentes situações, facilitando a manutenção e evolução do sistema.

---

