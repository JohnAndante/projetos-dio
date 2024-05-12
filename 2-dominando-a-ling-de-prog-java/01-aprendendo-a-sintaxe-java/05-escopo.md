## Escopo ##

O escopo de uma variável é o local onde ela pode ser acessada. Em Java, o escopo de uma variável é definido por onde ela foi declarada. Existem três tipos de escopo em Java:

```java
    private class Conta {

        double saldo = 10.0;// variavel da classe conta

        public void sacar(Double valor) {

            double novoSaldo = saldo - valor; // variavel local de método
        }

        public void imprimirSaldo() { // disponível em toda classe

            System.out.println(saldo);

            System.out.println(novoSaldo); // somente o método sacar conhece esta variável
        }

        public double calcularDividaExponencial() {

            double valorParcela = 50.0; // variável local de método
            double valorMontante = 0.0; // inicializando a variável

            // escopo de fluxo
            // x e valorCalculado nunca estarão disponíveis fora do bloco for
            for (int x = 1; x <= 5; x++) {
                double valorCalculado = valorParcela * x;
                valorMontante = valorMontante + valorCalculado;
            }

            return valorMontante;
        }
    }

```
