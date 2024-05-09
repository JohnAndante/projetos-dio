package exemplos;

public class V_Escopo {

    private class Conta {
        // variavel da classe conta
        double saldo = 10.0;

        public void sacar(Double valor) {
            // variavel local de método
            double novoSaldo = saldo - valor;
        }

        public void imprimirSaldo() {
            // disponível em toda classe
            System.out.println(saldo);
            // somente o método sacar conhece esta variável
            // ! System.out.println(novoSaldo);
        }

        public double calcularDividaExponencial() {
            // variável local de método
            double valorParcela = 50.0;
            double valorMontante = 0.0; // inicializando a variável

            for (int x = 1; x <= 5; x++) {
                double valorCalculado = valorParcela * x;
                valorMontante = valorMontante + valorCalculado;
            }

            // escopo de fluxo
            // x e valorCalculado nunca estarão disponíveis fora do bloco for

            return valorMontante;

        }

    }
}
