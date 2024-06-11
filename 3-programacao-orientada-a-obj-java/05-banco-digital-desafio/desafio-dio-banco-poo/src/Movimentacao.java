import java.sql.Date;

public class Movimentacao {
    // Classe criada para registrar as movimentações realizadas em uma conta
    private String acao;
    private double valor;
    private Date data;
    private Conta conta1;
    private Conta conta2;

    public Movimentacao(String acao, double valor, double saldoAtual, Date data, Conta conta1) {
        this.acao = acao;
        this.valor = valor;
        this.data = data;
        this.conta1 = conta1;
    }

    public Movimentacao(String acao, double valor, double saldoAtual, Date data, Conta conta1, Conta conta2) {
        this.acao = acao;
        this.valor = valor;
        this.data = data;
        this.conta1 = conta1;
        this.conta2 = conta2;
    }

    public void getMovimentacao() {
        System.out.println("----------> " + this.data
                + "\nAção: " + this.acao
                + "\nValor: " + this.valor
                + "\nSaldo atual: " + this.conta1.getSaldo()
                + (this.conta2 != null
                        ? "\nConta de origem: " + this.conta1.getAgencia() + " - " + this.conta1.getConta()
                        : "")
                + (this.conta2 != null
                        ? "\nConta de destino: " + this.conta2.getAgencia() + " - " + this.conta2.getConta()
                        : ""));

    }

}
