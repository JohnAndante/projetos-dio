## Pacotes ##

### O que são pacotes? ###

Em Java, pacotes são diretórios que contêm classes e interfaces. Eles são usados para organizar e agrupar classes relacionadas. Um pacote é um namespace que organiza um conjunto de classes e interfaces relacionadas. O uso de pacotes permite que você evite conflitos de nome e fornece um mecanismo para controlar o acesso.

### Estrutura de pacotes ###

A estrutura de pacotes é uma hierarquia de diretórios que corresponde à hierarquia de pacotes. Por exemplo, o pacote `com.example` é representado por um diretório chamado `com`, que contém um diretório chamado `example`. Dentro do diretório `example`, você pode ter um arquivo chamado `Example.java`, que contém a definição de uma classe chamada `Example`.

```
com
└── example
    └── Example.java
```

### Nomenclatura ###

Os nomes de pacotes são escritos em letras minúsculas e geralmente seguem a convenção de nomenclatura de pacotes reversos de domínio. Por exemplo, se você possui um domínio chamado `example.com`, você pode usar o pacote `com.example` para suas classes e interfaces, ou por exemplo, se você possui um domínio chamado `powersoft.com`, você pode usar o pacote `com.powersoft` para suas classes e interfaces.

Para criar um pacote, você pode usar a palavra-chave `package` seguida pelo nome do pacote no início de um arquivo Java. Por exemplo, se você deseja criar um pacote chamado `com.example`, você pode adicionar a seguinte linha ao início de um arquivo Java:

```java
package com.example;
```

E para a pré nomenclatura, temos a seguinte convenção:

- **com**: empresas comerciais, por exemplo, `com.example`.
- **org**: organizações sem fins lucrativos, por exemplo, `org.example`.
- **net**: organizações relacionadas à Internet, por exemplo, `net.example`.
- **edu**: instituições educacionais, por exemplo, `edu.example`.
- **gov**: agências governamentais, por exemplo, `gov.example`.
- **mil**: organizações militares, por exemplo, `mil.example`.

Há também uma convenção de nomenclatura de pacotes internos, que pode ser classificado da seguinte forma:

- **model**: classes que representam entidades de negócios, como `com.example.model.User`, ou `com.example.model.Product`.
- **repository**: classes ou interfaces que lidam com a persistência de dados, como `com.example.repository.UserRepository`, ou `com.example.repository.ProductRepository`.
- **service**: classes ou interfaces que contêm a lógica de negócios, como `com.example.service.UserService`, ou `com.example.service.ProductService`.
- **controller**: classes que lidam com solicitações HTTP, como `com.example.controller.UserController`, ou `com.example.controller.ProductController`.
- **view**: classes que lidam com a interface do usuário, como `com.example.view.UserView`, ou `com.example.view.ProductView`.
- **util**: classes ou interfaces de utilitários, como `com.example.util.DateUtil`, ou `com.example.util.StringUtil`.

### Identificação ###

Uma das características de uma classe é sua identificação: Cliente, NotaFiscal, TituloPagar, etc. Porém, quando esta classe é organizada por pacotes, ela passa a ter duas identificações: O nome simples (**próprio nome**) e o nome qualificado (**endereçamento do pacote + nome simples**). Por exemplo, a classe Cliente, que está no pacote `com.example.model`, tem a identificação qualificada `com.example.model.Cliente`.

### Package vs Import ###

A localização de uma classe é definida pela palavra reservada package, logo uma classe só contem uma definição de package no arquivo, sempre na primeira linha de código do arquivo.
Já a importação de classes é feita pela palavra reservada import, que é usada para importar classes de outros pacotes. A importação de classes é feita no início do arquivo, após a definição do package.
Para a utilização de uma classe existente em outros pacotes, necessita-se importar a classe, ou utilizar o nome qualificado da classe.

```java
package com.example;

import com.example.model.Cliente;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
    }
}
```

### Pacotes padrões ###

O Java possui pacotes padrões que são usados para fornecer classes e interfaces comuns, como `java.lang`, `java.util`, `java.io`, `java.net`, `java.sql`, `java.awt`, `java.swing`, etc. Esses pacotes são importados automaticamente e não precisam ser importados explicitamente.

```java
package com.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello, World!");
        System.out.println(list.get(0));
    }
}
```


