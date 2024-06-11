public class ContaCorrente extends Conta {

    private double limite = Conta.LIMITE_CC_INICIAL;
    private double tarifa = Conta.TARIFA_CONTA_CORRENTE;

    public ContaCorrente(Cliente cliente, Banco banco) {
        super(cliente, banco);
    }

    @Override
    public void imprimeExtrato() {
        System.out.println("=== Extrato da Conta Corrente ===");
        super.imprimeInfos();
        System.out.println("==================================");
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getLimite() {
        return this.limite;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public double getTarifa() {
        return this.tarifa;
    }

    public void cobraTarifa() {
        this.saldo -= this.tarifa;
    }

    public void aumentaLimite(double valor) {
        this.limite += valor;
    }

    public void calculaRestanteLimite() {
        System.out.println("Restante do limite: " + (this.limite - this.saldo));
    }

}
