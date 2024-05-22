## Construtores ##

Construtores são métodos especiais que são chamados automaticamente quando um objeto é criado. Eles são usados para inicializar objetos.

### Construtor Padrão ###

O construtor padrão é um construtor sem argumentos. Se você não fornecer nenhum construtor em sua classe, o Java criará automaticamente um construtor padrão para você. O construtor padrão inicializa os atributos do objeto com valores padrão (por exemplo, `0` para tipos numéricos, `false` para tipos booleanos e `null` para tipos de referência).

```java
public class Pessoa {
    private String nome;
    private int idade;

    // Construtor padrão
    public Pessoa() {
        nome = "Sem nome";
        idade = 0;
    }
}
```

### Construtor Personalizado ###

Você também pode criar construtores personalizados que aceitam argumentos para inicializar os atributos do objeto com valores específicos. Isso permite que você defina o estado inicial do objeto de acordo com os valores fornecidos.

```java
public class Pessoa {
    private String nome;
    private int idade;

    // Construtor personalizado
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}
```

### Chamando Construtores de Outros Construtores (Sobrecarga) ###

Em Java, você pode chamar um construtor de outro construtor da mesma classe usando a palavra-chave `this`. Isso é conhecido como sobrecarga de construtores.

```java
public class Pessoa {
    private String nome;
    private int idade;

    // Construtor padrão
    public Pessoa() {
        this("Sem nome", 0); // Chama o construtor personalizado
    }

    // Construtor personalizado
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}
```

### Exemplo de Uso ###

```java
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(); // Construtor padrão
        Pessoa pessoa2 = new Pessoa("Alice", 30); // Construtor personalizado

        System.out.println(pessoa1.getNome()); // Output: Sem nome
        System.out.println(pessoa2.getNome()); // Output: Alice
    }
}
```

### Vantagens dos Construtores ###
- **Inicialização de Objetos**: Os construtores permitem que você inicialize os atributos de um objeto com valores específicos, garantindo que ele esteja em um estado válido.
- **Sobrecarga de Construtores**: Você pode fornecer vários construtores com diferentes parâmetros para permitir a inicialização de objetos de várias maneiras.
- **Reutilização de Código**: Você pode chamar um construtor de outro construtor da mesma classe, evitando a duplicação de código de inicialização.


