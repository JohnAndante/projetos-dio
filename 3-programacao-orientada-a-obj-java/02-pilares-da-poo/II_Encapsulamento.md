# Encapsulamento #

Nem tudo deve ser acessível por todos. O encapsulamento é o ato de proteger os atributos de uma classe, ou seja, não permitir que eles sejam acessados diretamente. Para isso, utilizamos os modificadores de acesso, que são eles:

1. **public**: Atributos e métodos públicos podem ser acessados por qualquer classe.
2. **private**: Atributos e métodos privados só podem ser acessados pela própria classe.
3. **protected**: Atributos e métodos protegidos só podem ser acessados pela própria classe e por suas subclasses.

## Exemplo ##

```java

public class Veiculo {
    private String chassi;
    private boolean ligado;

    public void getChassi() {               // Método público
        return this.chassi;
    }

    public void setChassi(String chassi) {  // Método público
        this.chassi = chassi;
    }

    public void ligar() {                   // Método público
        this.ligado = true;
    }

}
```


