package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra) {
        palavrasUnicas.remove(palavra);
    }

    public int contarPalavras() {
        return palavrasUnicas.size();
    }

    public void verificarPalavra(String palavra) {
        System.out.println(palavrasUnicas.contains(palavra));
    }

    public void exibirPalavrasUnicas() {
        System.out.println(palavrasUnicas);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
        conjuntoPalavrasUnicas.adicionarPalavra("João");
        conjuntoPalavrasUnicas.adicionarPalavra("Maria");
        conjuntoPalavrasUnicas.adicionarPalavra("José");
        conjuntoPalavrasUnicas.adicionarPalavra("Ana");
        conjuntoPalavrasUnicas.adicionarPalavra("Carlos");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
        System.out.println("Quantidade de palavras: " + conjuntoPalavrasUnicas.contarPalavras());

        conjuntoPalavrasUnicas.removerPalavra("José");
        conjuntoPalavrasUnicas.removerPalavra("Carlos");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
        System.out.println("Quantidade de palavras: " + conjuntoPalavrasUnicas.contarPalavras());

        conjuntoPalavrasUnicas.verificarPalavra("Maria");
        conjuntoPalavrasUnicas.verificarPalavra("Carlos");
    }
}
