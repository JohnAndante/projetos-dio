import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public abstract class Conta implements IConta {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1000;

    protected static double RENDIMENTO_POUPANCA = 0.05;
    protected static double TARIFA_CONTA_CORRENTE = 20.0;
    protected static final double LIMITE_CC_INICIAL = 1000.0;

    protected Banco banco;
    protected int agencia;
    protected int conta;
    protected double saldo;
    protected Cliente cliente;
    protected List<Movimentacao> movimentacoes;

    public Conta(Cliente cliente, Banco banco) {
        this.agencia = AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
        this.cliente = cliente;
        this.banco = banco;
        this.banco.adicionarCliente(cliente);
        this.cliente.addConta(this);
        this.addMovimentacao(new Movimentacao(
                "> Criação da Conta",
                0.0,
                this.saldo,
                new Date(System.currentTimeMillis()),
                this,
                null));
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
        addMovimentacao(new Movimentacao(
                "> Saque",
                valor,
                this.saldo,
                new Date(System.currentTimeMillis()),
                this,
                null));
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        addMovimentacao(new Movimentacao(
                "> Depósito",
                valor,
                this.saldo,
                new Date(System.currentTimeMillis()),
                this,
                null));
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
        addMovimentacao(new Movimentacao(
                "> Transferência",
                valor,
                this.saldo,
                new Date(System.currentTimeMillis()),
                this,
                (Conta) contaDestino));
    }

    public int getAgencia() {
        addMovimentacao(new Movimentacao(
                "> Consulta de Agência",
                0.0,
                this.saldo,
                new Date(System.currentTimeMillis()),
                this,
                null));
        return this.agencia;
    }

    public int getConta() {
        addMovimentacao(new Movimentacao(
                "> Consulta de Conta",
                0.0,
                this.saldo,
                new Date(System.currentTimeMillis()),
                this,
                null));
        return this.conta;
    }

    public Double getSaldo() {
        addMovimentacao(new Movimentacao(
                "> Consulta de Saldo",
                0.0,
                this.saldo,
                new Date(System.currentTimeMillis()),
                this,
                null));
        return this.saldo;
    }

    public void imprimeInfos() {
        this.cliente.imprimeInfos();
        System.out.println("=== Dados da Conta ===");
        System.out.println("Banco: " + this.banco.getNome());
        System.out.println(String.format("Saldo: %.2f", this.saldo));
        System.out.println("Agência: " + this.agencia);
        System.out.println("Conta: " + this.conta);
    }

    public void addMovimentacao(Movimentacao movimentacao) {
        if (this.movimentacoes == null) {
            this.movimentacoes = new ArrayList<>();
        }
        this.movimentacoes.add(movimentacao);
    }

    public void imprimeExtrato() {
        System.out.println("======== Extrato da Conta ========");
        this.imprimeInfos();
        System.out.println(">>===>>> Movimentações <<<===<<");
        if (this.movimentacoes != null) {
            for (Movimentacao movimentacao : this.movimentacoes) {
                movimentacao.getMovimentacao();
            }
        } else

            System.out.println("Nenhuma movimentação realizada.");

        System.out.println("=======================");
    }

}
