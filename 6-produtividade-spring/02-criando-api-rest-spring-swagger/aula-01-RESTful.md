# RESTful Web Service

## O que é API?

Uma API (interface application program) é um código programável que faz a "ponte" de comunicação entre duas aplicações distintas.
Por meio de uma API podemos requisitar ou enviar informações de um sistema para outro.

## REST e RESTful

A API *REST* (representational state transfer) é como um guia de boas práticas e *RESTful* é a capacidade de determinado sistema aplicar os princípios de REST.

## Princípios REST

Para que uma arquitetura seja RESTful, é necessário ter uma série de princípios ou padrões, como por exemplo:

1. **Cliente-Servidor**: Separação entre o cliente e o servidor, ou seja, o cliente não precisa saber como o servidor funciona e vice-versa. De tal forma que ambas as partes possam evoluir e ser mantidas separadamente.
2. **Interface Uniforme**: A interface entre o cliente e o servidor deve ser uniforme, é necessário que o cliente saiba como interagir com o servidor e que haja padrão entre os métodos de comunicação.
3. **Stateless**: O servidor não deve guardar informações sobre o estado do cliente, cada requisição deve ser independente e auto-suficiente. De tal maneira que cada requisição possa ser feita de forma isolada e traga todas as informações necessárias para ser processada.
4. **Cache**: O servidor deve permitir que algumas informações sejam armazenadas em cache, para que o cliente possa acessar essas informações de forma mais rápida.
5. **Sistema em camadas**: O servidor pode ser menos ou mais complexo, dependendo da necessidade do cliente. O cliente pode acessar um servidor intermediário, que por sua vez acessa o servidor final.

## Níveis de maturidade REST

Para padronizar e facilitar o desenvolvimento de APIs REST, Leonard Richardson propôs um modelo de maturidade REST, conhecido como Glory of REST. Esse modelo é dividido em 4 níveis:

* **Nível 0 - POX**
* **Nível 1 - Resources**
* **Nível 2 - HTTP Verbs**
* **Nível 3 - HATEOAS**

### Nível 0 - POX: Ausência de regras

Esse é considerado o mais básico, pois não segue nenhuma das regras definidas pelo REST. Nesse nível, as requisições são feitas por meio de mensagens XML ou JSON, sem seguir um padrão.

Exemplo:

|Verbo HTTP|URI|Operação|
|---|---|---|
| POST | /getUsuario | Pesquisar usuário |
| POST | /salvarUsuario | Salvar usuário |
| POST | /atualizarUsuario | Atualizar usuário |
| POST | /deletarUsuario | Deletar usuário |

### Nível 1 - Resources: Utilização de recursos

Neste nível as requisições são feitos por meio de recursos, ou seja, cada recurso é uma entidade que pode ser acessada por meio de uma URI.

Melhor dizendo, descrevemos na URI a classe de recurso que queremos acessar.

Exemplo:

|Verbo HTTP|URI|Operação|
|---|---|---|
| GET | /usuarios | Listar usuários |
| GET | /usuarios/1 | Buscar usuário por ID |
| POST | /usuarios | Salvar usuário |
| PUT | /usuarios/1 | Atualizar usuário |
| DELETE | /usuarios/1 | Deletar usuário |

### Nível 2 - HTTP Verbs: Utilização de verbos HTTP

Neste nivel nós utilizamos os verbos HTTP para definir a operação que queremos realizar.

Os verbos HTTP mais utilizados são:
- GET: Obter informações
- POST: Criar informações
- PUT: Atualizar informações
- DELETE: Deletar informações

Temos outros menos utilizados como:
- PATCH: Atualizar parcialmente uma informação
- HEAD: Obter informações do cabeçalho
- OPTIONS: Obter informações sobre os métodos HTTP permitidos

Já ajustamos isso no nível 1, mas agora vamos utilizar os verbos HTTP para definir a operação.

Exemplo:

|Verbo HTTP|URI|Operação|
|---|---|---|
| GET | /usuarios | Listar usuários |
| GET | /usuarios/1 | Buscar usuário por ID |
| POST | /usuarios | Salvar usuário |
| PUT | /usuarios/1 | Atualizar usuário |
| DELETE | /usuarios/1 | Deletar usuário |

### Nível 3 - HATEOAS: Utilização de HATEOAS

HATEOAS (Hypermedia as the Engine of Application State) é um dos princípios do REST que permite que o servidor envie links para o cliente, de forma que o cliente saiba quais são as próximas ações possíveis.

Esse é um método pouco aplicado na prática.

Exemplo:

```json
{
  "id": 1,
  "nome": "Fulano",
  "links": [
    {
      "rel": "self",
      "href": "http://localhost:8080/usuarios/1"
    },
    {
      "rel": "delete",
      "href": "http://localhost:8080/usuarios/1"
    },
    {
      "rel": "update",
      "href": "http://localhost:8080/usuarios/1"
    }
  ]
}
```



