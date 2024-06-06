package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, Palavra> dicionario;

    public Dicionario() {
        this.dicionario = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        this.dicionario.put(palavra, new Palavra(palavra, definicao));
    }

    public void removerPalavra(String palavra) {
        this.dicionario.remove(palavra);
    }

    public void exibirPalavras() {
        System.out.println(dicionario);
    }

    public Map<String, Palavra> pesquisarPorPalavra(String palavra) {
        Map<String, Palavra> palavras = new HashMap<>();
        if (!dicionario.isEmpty()) {
            palavras.put(palavra, dicionario.get(palavra));
        }

        return palavras;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();
        dicionario.adicionarPalavra("Casa", "Lugar onde se mora");
        dicionario.adicionarPalavra("Casa", "Lugar onde se mora");
        dicionario.adicionarPalavra("Carro", "Veículo automotor");
        dicionario.adicionarPalavra("Moto", "Veículo automotor");

        dicionario.exibirPalavras();

        System.out.println(dicionario.pesquisarPorPalavra("Carro"));

        dicionario.removerPalavra("Carro");

        dicionario.exibirPalavras();
    }
}
