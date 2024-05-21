## Classes ##

Em Java, são arquivos que contêm a definição de uma classe. Uma classe é uma estrutura que define um tipo de objeto, que contém atributos e métodos. Atributos são variáveis que representam o estado do objeto, e métodos são funções que representam o comportamento do objeto.

```java
public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
```

São salvos em arquivos com extensão `.java`, e o nome do arquivo deve ser o mesmo da classe. Por exemplo, a classe `Pessoa` deve ser salva no arquivo `Pessoa.java`.

### Identificador, Características e Comportamentos ###

- **Classe** (_class_): A estrutura e/ou representação que direciona a criação dos objetos de mesmo tipo.

- **Identificador** (_identity_): Propósito existencial aos objetos que serão criados.

- **Características** (_attributes_): Também conhecidos como **atributos** ou **propriedades**, são as variáveis que representam o estado do objeto.

- **Comportamentos** (_behaviors_): Também conhecidos como **métodos** ou **funções**, são as ações que o objeto pode realizar.

- **Instanciar** (_new_): Ação de criar um objeto a partir de uma classe.

- **Objeto** (_object_): Instância de uma classe.

## Convenções ##

Seguindo as convenções, nossas classes são classificadas como:

- **Classe de modelo** (_model_): Classes que representem estrutura de domínio da aplicação, como `Pessoa`, `Conta`, `Produto`, etc.

- **Classe de serviço** (_service_): Classes que representam serviços, que contém regras de negócio do sistema como `Calculadora`, `Validador`, `Conversor`, etc.

- **Classe de repositorio** (_repository_): Classes que contém uma integração com o banco de dados, são responsáveis pela conexão e comunicação com o memso, como `PessoaRepository`, `ContaRepository`, `ProdutoRepository`, etc.

- **Classe de controle** (_controller_): Classes que representam o controle de uma aplicação, é responsável por receber as requisições e retornar as respostas, como `PessoaController`, `ContaController`, `ProdutoController`, etc.

- **Classe utilitária** (_util_): Classes que contém métodos utilitários, recursos comuns para toda a nossa aplicação, como `DataUtil`, `StringUtil`, `NumberUtil`, etc.
