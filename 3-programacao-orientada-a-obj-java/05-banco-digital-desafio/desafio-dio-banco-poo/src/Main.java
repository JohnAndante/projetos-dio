public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco do Américo");

        Cliente cliente1 = new Cliente("Josias", "123.456.789-00", "01/01/2000");
        Cliente cliente2 = new Cliente("Cleitin", "987.654.321-00", "02/02/2000");

        ContaCorrente cc = new ContaCorrente(cliente1, banco);
        ContaPoupanca cp = new ContaPoupanca(cliente2, banco);

        cc.depositar(1000);
        cp.depositar(1000);

        cc.sacar(100);
        cp.sacar(100);

        cc.transferir(100, cp);

        System.out.println("Saldo da conta corrente: " + cc.getSaldo());
        System.out.println("Saldo da conta poupança: " + cp.getSaldo());

        cc.imprimeExtrato();
        cp.imprimeExtrato();

        cc.cobraTarifa();
        cc.calculaRestanteLimite();

        cp.aplicaRendimentoMensal();
        cp.simularRendimento(12);

        banco.calcularRendimentos();

        cc.imprimeExtrato();
        cp.imprimeExtrato();
        
    }
}
