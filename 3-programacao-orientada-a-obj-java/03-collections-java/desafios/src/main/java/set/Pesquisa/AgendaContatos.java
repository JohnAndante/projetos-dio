package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void removerContatoPorNome(String nome) {
        Contato contatoARemover = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equals(nome)) {
                contatoARemover = c;
                break;
            }
        }

        if (contatoARemover != null) {
            contatoSet.remove(contatoARemover);
        }
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosEncontrados = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().contains(nome)) {
                contatosEncontrados.add(c);
            }
        }

        return contatosEncontrados;
    }

    public void atualizarNumeroContato(String nome, int novoNumero) {
        for (Contato c : contatoSet) {
            if (c.getNome().equals(nome)) {
                c.setNumero(novoNumero);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("João Cleito", 123456789);
        agendaContatos.adicionarContato("Maria Joana", 987654321);
        agendaContatos.adicionarContato("José Fagundes", 456789123);
        agendaContatos.adicionarContato("Ana Maria", 654321987);
        agendaContatos.adicionarContato("Carlos Maia", 321987654);
        agendaContatos.adicionarContato("José Maria", 789123456);
        agendaContatos.adicionarContato("José Maria", 789123456);

        agendaContatos.exibirContatos();

        System.out.println("Contatos encontrados: " + agendaContatos.pesquisarPorNome("José"));
        System.out.println("Contatos encontrados: " + agendaContatos.pesquisarPorNome("a"));

        agendaContatos.atualizarNumeroContato("Maria", 111111111);
        agendaContatos.atualizarNumeroContato("Ana", 222222222);

        agendaContatos.exibirContatos();
    }
}
