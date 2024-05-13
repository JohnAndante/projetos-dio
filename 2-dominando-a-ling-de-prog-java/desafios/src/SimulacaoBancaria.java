import java.util.Scanner;

public class SimulacaoBancaria {
    Scanner scanner = new Scanner(System.in);
    double saldo = 0;

    public static void main(String[] args) {
        SimulacaoBancaria simulacao = new SimulacaoBancaria();
        simulacao.menu();
    }

    public void menu() {

        while (true) {
            // System.out.println("Escolha uma opção:");
            // System.out.println("1 - Depositar");
            // System.out.println("2 - Sacar");
            // System.out.println("3 - Consultar Saldo");
            // System.out.println("4 - Encerrar");
            int opcao = this.scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    depositar();
                    break;
                case 2:
                    sacar();
                    break;
                case 3:
                    saldo();
                    break;
                case 4:
                case 0:
                    System.out.println("Programa encerrado.");
                    System.exit(0);
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    void depositar() {
        // Solicitar o valor a ser depositado e atualizar o saldo
        // System.out.println("Digite o valor a ser depositado: ");
        int valor = this.scanner.nextInt();
        this.scanner.nextLine();

        this.saldo += valor;
        this.saldo();

        // System.out.println("Depósito realizado com sucesso.");
    }

    void sacar() {
        // Solicitar o valor a ser sacado e verificar se há saldo suficiente, então
        // atualizar o saldo
        // System.out.println("Digite o valor a ser sacado: ");
        int valor = this.scanner.nextInt();
        this.scanner.nextLine();

        if (this.saldo >= valor) {
            this.saldo -= valor;
            this.saldo();

            // System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    void saldo() {
        // Exibir o saldo atual
        System.out.println("Saldo atual: " + this.saldo);
    }

}
