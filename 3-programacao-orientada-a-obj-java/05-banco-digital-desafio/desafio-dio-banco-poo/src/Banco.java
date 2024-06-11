import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Cliente> clientes;

    public Banco(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarCliente(Cliente cliente) {
        if (this.clientes == null) {
            this.clientes = new ArrayList<>();
        }
        this.clientes.add(cliente);
    }

    public void removerCliente(Cliente cliente) {
        this.clientes.remove(cliente);
    }

    public List<Cliente> getClientes() {
        return this.clientes;
    }

    public void calcularRendimentos() {
        double total = 0;
        for (Cliente cliente : this.clientes) {
            for (Conta conta : cliente.getContas()) {
                if (conta instanceof ContaCorrente) {
                    ContaCorrente cc = (ContaCorrente) conta;
                    total += cc.getTarifa();
                }
            }
        }

        System.out.println("O banco lucrou " + total + " com rendimentos e tarifas.");
    }
}
