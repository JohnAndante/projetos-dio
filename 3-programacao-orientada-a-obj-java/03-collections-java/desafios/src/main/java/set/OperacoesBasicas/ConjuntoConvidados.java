package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoARemover = null;
        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoARemover = c;
                break;
            }
        }

        if (convidadoARemover != null) {
            convidadoSet.remove(convidadoARemover);
        }
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        conjuntoConvidados.adicionarConvidado("João", 1);
        conjuntoConvidados.adicionarConvidado("Maria", 2);
        conjuntoConvidados.adicionarConvidado("José", 3);
        conjuntoConvidados.adicionarConvidado("Ana", 4);
        conjuntoConvidados.adicionarConvidado("Carlos", 5);
  
        conjuntoConvidados.exibirConvidados();
        System.out.println("Quantidade de convidados: " + conjuntoConvidados.contarConvidados());

        conjuntoConvidados.removerConvidadoPorCodigoConvite(3);
        conjuntoConvidados.removerConvidadoPorCodigoConvite(5);

        conjuntoConvidados.exibirConvidados();
        System.out.println("Quantidade de convidados: " + conjuntoConvidados.contarConvidados());

    }
}
