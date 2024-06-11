public class Cliente {
    private String nome;
    private String cpf;
    private String dataNascimento;
    private Conta[] contas;

    public Cliente(String nome, String cpf, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Conta[] getContas() {
        return this.contas;
    }

    public void addConta(Conta conta) {
        if (this.contas == null) {
            this.contas = new Conta[1];
            this.contas[0] = conta;
        } else {
            Conta[] novoArray = new Conta[this.contas.length + 1];
            for (int i = 0; i < this.contas.length; i++) {
                novoArray[i] = this.contas[i];
            }
            novoArray[this.contas.length] = conta;
            this.contas = novoArray;
        }
    }

    public void imprimeInfos() {
        System.out.println("=== Dados do Cliente ===");
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Data de Nascimento: " + this.dataNascimento);
    }

}
