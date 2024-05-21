## Visibilidade dos recursos ##

### Modificadores ###

Em Java, podemos usar três palavras reservadas e um conceito default (sem palavras reservadas) para definir os quatro tipos de visibilidade de atributos, métodos e até mesmo classes no que se refere ao acesso por outras classes. Os modificadores de acesso são:

- **public**: O acesso é permitido de qualquer lugar, mesmo fora do pacote.
- **protected**: O acesso é permitido apenas para classes do mesmo pacote e para subclasses.
- **private**: O acesso é permitido apenas para a própria classe.
- **default**: O acesso é permitido apenas para classes do mesmo pacote.

### Modificador Public ###

O modificador `public` é o modificador de acesso mais permissivo. Ele permite que uma classe, método ou atributo seja acessado por qualquer outra classe, independentemente do pacote em que a classe reside. Por exemplo, se você tiver uma classe `A` com um método `public void foo()`, qualquer outra classe pode chamar esse método, desde que tenha uma instância de `A`.

```java
public class A {
    public void foo() {
        System.out.println("foo");
    }
}
```

```java
public class B {
    public static void main(String[] args) {
        A a = new A();
        a.foo(); // Output: foo
    }
}
```

### Modificador Protected ###

O modificador `protected` é um pouco menos permissivo do que o modificador `public`. Ele permite que uma classe, método ou atributo seja acessado por classes do mesmo pacote e por subclasses, mesmo que estejam em pacotes diferentes. Por exemplo, se você tiver uma classe `A` com um método `protected void foo()`, qualquer classe no mesmo pacote que `A` ou qualquer subclasse de `A` pode chamar esse método.

```java
public class A {
    protected void foo() {
        System.out.println("foo");
    }
}
```

```java
public class B extends A {
    public static void main(String[] args) {
        B b = new B();
        b.foo(); // Output: foo
    }
}
```

### Modificador Private ###
O modificador `private` é o modificador de acesso mais restritivo. Ele permite que uma classe, método ou atributo seja acessado apenas pela própria classe em que está definido. Por exemplo, se você tiver uma classe `A` com um método `private void foo()`, apenas a própria classe `A` pode chamar esse método.

```java
public class A {
    private void foo() {
        System.out.println("foo");
    }
}
```

```java
public class B {
    public static void main(String[] args) {
        A a = new A();
        a.foo(); // Error: foo() has private access in A
    }
}
```

### Modificador Default ###

O modificador de acesso padrão (também conhecido como "pacote-private") é o modificador de acesso que não usa nenhuma palavra-chave. Ele permite que uma classe, método ou atributo seja acessado apenas por classes no mesmo pacote. Por exemplo, se você tiver uma classe `A` com um método `void foo()`, apenas classes no mesmo pacote que `A` podem chamar esse método.

```java
public class A {
    void foo() {
        System.out.println("foo");
    }
}
```

```java
public class B {
    public static void main(String[] args) {
        A a = new A();
        a.foo(); // Output: foo
    }
}
```



