# UML #

Na UML temos três conceitos necessários para compreendermos inicialmente: **diagramas**, **elementos** e **relacionamentos**.

## Diagramas ##

Os diagramas são representações visuais de um sistema de software, mostrando a estrutura, o comportamento e a interação entre seus componentes. Existem vários tipos de diagramas UML, cada um com um propósito específico, como **diagramas de classe**, **diagramas de sequência** e **diagramas de atividade**.


### Diagrama de Classes ###

O diagrama de classes é um dos diagramas mais comuns na UML e é usado para representar a estrutura estática de um sistema, mostrando as **classes**, seus **atributos**, **métodos** e **relacionamentos**. Ele fornece uma visão geral do sistema e ajuda a identificar as principais entidades e suas interações.

```plantuml
@startuml
class Pessoa                    # Nome da classe
class Endereco                  # Nome da classe
class Aluno                     # Nome da classe
class Motor                     # Nome da classe
class Carro                     # Nome da classe

Pessoa "1" *-- "1" Endereco     # Associação
Aluno --|> Pessoa               # Herança
Carro o--> Motor                # Dependência
@enduml
```

### Diagrama de Sequência ###

O diagrama de sequência é usado para representar a **interação entre objetos** em uma determinada sequência de tempo. Ele mostra como os objetos se **comunicam** uns com os outros e em que ordem as mensagens são trocadas. O diagrama de sequência é útil para modelar o comportamento dinâmico de um sistema.

```plantuml
@startuml
participant Cliente                 # Nome do participante Cliente
participant Servidor                # Nome do participante Servidor

Cliente -> Servidor: Requisição     # Mensagem
Servidor -> Cliente: Resposta       # Mensagem
@enduml
```

### Diagrama de Atividade ###

O diagrama de atividade é usado para representar o **fluxo de controle** de um processo ou algoritmo. Ele mostra as etapas do processo, as decisões tomadas e as atividades realizadas em cada etapa. O diagrama de atividade é útil para modelar o comportamento de um sistema em termos de atividades e ações.

```plantuml
@startuml
start                       # Início do processo
:Iniciar processo;          # Ação
if (Condição) then (Sim)    # Decisão
    :Ação 1;                # Ação
    :Ação 2;                # Ação
else (Não)                  # Decisão
    :Ação 3;                # Ação
    :Ação 4;                # Ação
endif                       # Fim da decisão
stop                        # Fim do processo
@enduml
```

## Elementos ##

Os elementos são os componentes básicos de um diagrama UML, como **classes**, **interfaces**, **atributos**, **métodos** e **relacionamentos**. Cada elemento tem um papel específico no diagrama e ajuda a representar o sistema de forma clara e concisa.

### Classes ###

As classes são os blocos de construção fundamentais de um sistema de software e são representadas por **retângulos** no diagrama de classes. Elas contêm **atributos** (*variáveis*) e **métodos** (*funções*) que definem o comportamento e a estrutura da classe.

```plantuml
@startuml
class Pessoa {                      # Nome da classe
    - nome: String                  # Atributo
    - idade: int                    # Atributo
    + getNome(): String             # Método
    + setNome(nome: String): void   # Método
    + getIdade(): int               # Método
    + setIdade(idade: int): void    # Método
}
@enduml
```

### Interfaces ###

As interfaces são semelhantes às classes, mas não têm implementação. Elas definem um **contrato que as classes devem seguir**, especificando os métodos que as classes devem implementar. As interfaces são representadas por um **círculo** no diagrama de classes.

```plantuml
@startuml
interface Autenticavel {        # Nome da interface
    + autenticar(): boolean     # Método
}
@enduml
```

### Atributos ###

Os atributos são **variáveis que pertencem a uma classe** e representam o **estado interno da classe**. Eles são representados no diagrama de classes com o formato `- nome: Tipo`, onde `nome` é o nome do atributo e `Tipo` é o tipo de dado do atributo.

```plantuml
@startuml
class Pessoa {              # Nome da classe
    - nome: String          # Atributo
    - idade: int            # Atributo
}
@enduml
```

### Métodos ###

Os métodos são **funções que pertencem a uma classe** e definem o **comportamento da classe**. Eles são representados no diagrama de classes com o formato `+ nome(parametros): Tipo`, onde `nome` é o nome do método, `parametros` são os parâmetros do método e `Tipo` é o tipo de retorno do método.

```plantuml
@startuml
class Pessoa {                      # Nome da classe
    + getNome(): String             # Método
    + setNome(nome: String): void   # Método
    + getIdade(): int               # Método
    + setIdade(idade: int): void    # Método
}
@enduml
```

### Relacionamentos ###

Os relacionamentos são **conexões entre elementos** em um diagrama UML, indicando como eles interagem uns com os outros. Existem vários tipos de relacionamentos, como **associação**, **herança** e **dependência**, que descrevem diferentes formas de interação entre classes e objetos.

#### Associação ####

A associação é um relacionamento entre duas classes que indica que uma classe "usa" a outra de alguma forma. Por exemplo, uma classe `Pessoa` pode ter uma associação com uma classe `Endereco`, indicando que uma pessoa tem um endereço.

```plantuml
@startuml
class Pessoa {                  # Nome da classe
    - nome: String              # Atributo
    - endereco: Endereco        # Associação
}
class Endereco {                # Nome da classe
    - rua: String               # Atributo
}

Pessoa "1" *-- "1" Endereco     # Associação - Um para um
@enduml
```

```plantuml
@startuml
class SalaDeAula {                                  # Nome da classe
    - alunos: List<Aluno>                           # Atributo

    + adicionarAluno(aluno: Aluno): void            # Método
    + removerAluno(aluno: Aluno): void              # Método
    + getAlunos(): List<Aluno>                      # Método
    + adicionarAlunos(alunos: List<Aluno>): void    # Método
    + removerAlunos(alunos: List<Aluno>): void      # Método
    + getQuantidadeDeAlunos(): int                  # Método
}

class Aluno {                                       # Nome da classe
    - nome: String                                  # Atributo
    - matricula: int                                # Atributo

    + getNome(): String                             # Método
    + setNome(nome: String): void                   # Método
    + getMatricula(): int                           # Método
    + setMatricula(matricula: int): void            # Método
}

SalaDeAula "1" *-- "0..*" Aluno                     # Associação - Um para muitos
@enduml
```

```plantuml
@startuml
class Aluno {                                       # Nome da classe
    - nome: String                                  # Atributo
    - matricula: int                                # Atributo
    + getNome(): String                             # Método
    + setNome(nome: String): void                   # Método
    + getMatricula(): int                           # Método
    + setMatricula(matricula: int): void            # Método
}
class Disciplina {                                  # Nome da classe
    - nome: String                                  # Atributo
    - codigo: int                                   # Atributo
    + getNome(): String                             # Método
    + setNome(nome: String): void                   # Método
    + getCodigo(): int                              # Método
    + setCodigo(codigo: int): void                  # Método
}
class DisciplinaAluno {                             # Nome da classe
    - aluno: Aluno                                  # Atributo
    - disciplina: Disciplina                        # Atributo
    - nota: double                                  # Atributo
    + getAluno(): Aluno                             # Método
    + setAluno(aluno: Aluno): void                  # Método
    + getDisciplina(): Disciplina                   # Método
    + setDisciplina(disciplina: Disciplina): void   # Método
    + getNota(): double                             # Método
    + setNota(nota: double): void                   # Método
}
Aluno "0..*" *-- "0..*" Disciplina                  # Associação - Muitos para muitos
DisciplinaAluno "1" *-- "1" Aluno                   # Associação - Um para um
DisciplinaAluno "1" *-- "1" Disciplina              # Associação - Um para um
@enduml
```

### Herança ###

A herança é um relacionamento entre duas classes onde uma classe (subclasse) herda os atributos e métodos de outra classe (superclasse). Por exemplo, uma classe `Aluno` pode herdar da classe `Pessoa`, pois um aluno é uma pessoa.


```plantuml
@startuml
class Aluno {                   # Nome da classe
    - matricula: int            # Atributo
}

class Pessoa {                  # Nome da classe
    - nome: String              # Atributo
}

Aluno --|> Pessoa               # Herança - Aluno é uma Pessoa
@enduml
```

### Dependência ###

A dependência é um relacionamento entre duas classes onde uma classe depende da outra de alguma forma. Por exemplo, uma classe `Carro` pode depender de uma classe `Motor` para funcionar.


```plantuml
@startuml
class Carro {                   # Nome da classe
    - motor: Motor              # Atributo
}

class Motor {                   # Nome da classe
    - potencia: int             # Atributo
}

Carro o--> Motor                # Dependência - Carro depende de Motor
@enduml
```

```plantuml
@startuml
class Pessoa {                  # Nome da classe
    - nome: String              # Atributo
    - endereco: Endereco        # Atributo
}

class Endereco {                # Nome da classe
    - rua: String               # Atributo
}

Pessoa -- Endereco              # Dependência
@enduml
```
