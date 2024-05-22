## Getters e Setters ##

Os métodos *getters* e *setters* são métodos que permitem que você obtenha e defina os valores de atributos de uma classe, respectivamente. Eles são usados para garantir que os atributos de uma classe sejam acessados e modificados de maneira controlada, seguindo o princípio de encapsulamento.

### Getters ###

Um método *getter* é um método que permite que você obtenha o valor de um atributo de uma classe. Ele geralmente segue o padrão `getNomeDoAtributo`, onde `NomeDoAtributo` é o nome do atributo que você deseja obter. Por exemplo, se você tiver um atributo `nome` em uma classe `Pessoa`, o método *getter* correspondente seria `getNome`.

```java
public class Pessoa {
    private String nome;

    public String getNome() {
        return nome;
    }
}
```

### Setters ###

Um método *setter* é um método que permite que você defina o valor de um atributo de uma classe. Ele geralmente segue o padrão `setNomeDoAtributo`, onde `NomeDoAtributo` é o nome do atributo que você deseja definir. Por exemplo, se você tiver um atributo `nome` em uma classe `Pessoa`, o método *setter* correspondente seria `setNome`.

```java
public class Pessoa {
    private String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }
}
```

### Exemplo de Uso ###
```java
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Alice");
        System.out.println(pessoa.getNome()); // Output: Alice
    }
}
```

### Vantagens dos Getters e Setters ###
- **Encapsulamento**: Os *getters* e *setters* permitem que você controle o acesso e a modificação dos atributos de uma classe, garantindo que eles sejam usados de maneira segura e consistente.
- **Flexibilidade**: Você pode adicionar lógica adicional aos *getters* e *setters* conforme necessário, como validações de entrada ou cálculos de valores derivados.
- **Compatibilidade**: Os *getters* e *setters* são amplamente utilizados em muitos frameworks e bibliotecas Java, tornando sua classe mais compatível com o ecossistema Java.


