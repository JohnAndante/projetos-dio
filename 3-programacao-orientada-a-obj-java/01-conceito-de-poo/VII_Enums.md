## Enums ##

Enums são tipos de dados especiais em Java que representam um conjunto fixo de constantes. Eles são usados para definir um conjunto de valores que não podem ser alterados e são úteis para representar conceitos como dias da semana, meses do ano, estados de um objeto, etc.

### Declaração de Enums ###

Para declarar um enum em Java, você usa a palavra-chave `enum` seguida pelo nome do enum e uma lista de constantes entre chaves. Cada constante é separada por vírgula e pode ter um valor associado a ela.

```java
public enum DiaDaSemana {
    DOMINGO, SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO
}
```

```java
public enum Estados {
    ACRE('AC', "Rio Branco"),
    ALAGOAS('AL', "Maceió"),
    AMAPA('AP', "Macapá"),
    AMAZONAS('AM', "Manaus"),
    BAHIA('BA', "Salvador"),
    CEARA('CE', "Fortaleza"),
    DISTRITO_FEDERAL('DF', "Brasília"),
    ESPIRITO_SANTO('ES', "Vitória"),
    GOIAS('GO', "Goiânia"),
    MARANHAO('MA', "São Luís"),
    MATO_GROSSO('MT', "Cuiabá"),
    MATO_GROSSO_DO_SUL('MS', "Campo Grande"),
    MINAS_GERAIS('MG', "Belo Horizonte"),
    PARA('PA', "Belém"),
    PARAIBA('PB', "João Pessoa"),
    PARANA('PR', "Curitiba"),
    PERNAMBUCO('PE', "Recife"),
    PIAUI('PI', "Teresina"),
    RIO_DE_JANEIRO('RJ', "Rio de Janeiro"),
    RIO_GRANDE_DO_NORTE('RN', "Natal"),
    RIO_GRANDE_DO_SUL('RS', "Porto Alegre"),
    RONDONIA('RO', "Porto Velho"),
    RORAIMA('RR', "Boa Vista"),
    SANTA_CATARINA('SC', "Florianópolis"),
    SAO_PAULO('SP', "São Paulo"),
    SERGIPE('SE', "Aracaju"),
    TOCANTINS('TO', "Palmas");

    private final String sigla;
    private final String capital;

    Estados(char sigla, String capital) {
        this.sigla = String.valueOf(sigla);
        this.capital = capital;
    }

    public String getSigla() {
        return sigla;
    }

    public String getCapital() {
        return capital;
    }

    @Override
    public String toString() {
        return name() + " - " + sigla + " - " + capital;
    }

    public static void main(String[] args) {
        for (Estados estado : Estados.values()) {
            System.out.println(estado);
        }
    }
}
```

### Acessando Enums ###

```java
public class Main {
    public static void main(String[] args) {
        DiaDaSemana dia = DiaDaSemana.SEGUNDA;
        System.out.println(dia); // Output: SEGUNDA
    }
}
```

### Valores Personalizados ###

```java
public enum DiaDaSemana {
    DOMINGO(1), SEGUNDA(2), TERCA(3), QUARTA(4), QUINTA(5), SEXTA(6), SABADO(7);

    private int valor;

    DiaDaSemana(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
```

### Comparando Enums ###

```java
public class Main {
    public static void main(String[] args) {
        DiaDaSemana dia1 = DiaDaSemana.SEGUNDA;
        DiaDaSemana dia2 = DiaDaSemana.TERCA;

        if (dia1 == dia2) {
            System.out.println("Os dias são iguais");
        } else {
            System.out.println("Os dias são diferentes");
        }
    }
}
```

### Switch com Enums ###
```java
public class Main {
    public static void main(String[] args) {
        DiaDaSemana dia = DiaDaSemana.SEGUNDA;

        switch (dia) {
            case DOMINGO:
                System.out.println("Domingo");
                break;
            case SEGUNDA:
                System.out.println("Segunda");
                break;
            case TERCA:
                System.out.println("Terça");
                break;
            case QUARTA:
                System.out.println("Quarta");
                break;
            case QUINTA:
                System.out.println("Quinta");
                break;
            case SEXTA:
                System.out.println("Sexta");
                break;
            case SABADO:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }
    }
}
```

### Vantagens dos Enums ###
- **Clareza**: Enums tornam o código mais legível e autoexplicativo, pois fornecem nomes significativos para valores constantes.
- **Segurança**: Enums são seguros em tempo de compilação, o que significa que você não pode atribuir um valor inválido a uma variável enum.
- **Manutenção**: Enums facilitam a manutenção do código, pois você pode adicionar ou remover constantes sem alterar o restante do código.


