package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Contato> contatoMap;

    public AgendaContatos() {
        this.contatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, int telefone) {
        contatoMap.put(nome, new Contato(nome, telefone));
    }

    public void removerContato(String nome) {
        contatoMap.remove(nome);
    }

    public void exibirContatos() {
        System.out.println(contatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!contatoMap.isEmpty()) {
            numeroPorNome = contatoMap.get(nome).getTelefone();
        }

        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionarContato("João", 123456789);
        agenda.adicionarContato("João", 123456782);
        agenda.adicionarContato("Maria", 987654321);
        agenda.adicionarContato("José", 456789123);

        agenda.exibirContatos();

        System.out.println(agenda.pesquisarPorNome("Maria"));

        agenda.removerContato("Maria");

        agenda.exibirContatos();
    }

}
