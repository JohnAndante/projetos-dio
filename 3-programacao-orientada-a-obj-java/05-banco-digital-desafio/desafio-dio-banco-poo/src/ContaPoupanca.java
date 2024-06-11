public class ContaPoupanca extends Conta {

    private double rendimento = Conta.RENDIMENTO_POUPANCA;

    public ContaPoupanca(Cliente cliente, Banco banco) {
        super(cliente, banco);
    }

    @Override
    public void imprimeExtrato() {
        System.out.println("=== Extrato da Conta Poupança ===");
        super.imprimeInfos();
        System.out.println("==================================");
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    public double getRendimento() {
        return this.rendimento;
    }

    public double calculaRendimento(int meses) {
        double saldoSimulado = this.saldo;
        for (int i = 0; i < meses; i++) {
            saldoSimulado += this.saldo * this.rendimento;
        }
        return saldoSimulado;
    }

    public void simularRendimento(int meses) {
        double rendimento = this.calculaRendimento(meses);
        System.out.println("O rendimento após " + meses + " meses será de: " + rendimento);
    }

    public void aplicaRendimentoMensal() {
        this.saldo += calculaRendimento(1) - this.saldo;
    }

    public void aplicaRendimentoAnual() {
        this.saldo += calculaRendimento(12) - this.saldo;
    }

}
