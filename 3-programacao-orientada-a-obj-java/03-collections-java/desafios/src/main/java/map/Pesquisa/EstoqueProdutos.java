package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void removerProduto(long cod) {
        estoqueProdutosMap.remove(cod);
    }

    public double calcularValorTotalEstoque() {
        double valorTotal = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto produto : estoqueProdutosMap.values()) {
                valorTotal += produto.getPreco() * produto.getQuantidade();
            }
        }

        return valorTotal;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;

        for (Produto produto : estoqueProdutosMap.values()) {
            if (produto.getPreco() > maiorPreco) {
                maiorPreco = produto.getPreco();
                produtoMaisCaro = produto;
            }
        }

        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;

        for (Produto produto : estoqueProdutosMap.values()) {
            if (produto.getPreco() < menorPreco) {
                menorPreco = produto.getPreco();
                produtoMaisBarato = produto;
            }
        }

        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorQuantidadeValorTotalNoEstoque = null;
        int maiorQuantidade = Integer.MIN_VALUE;

        for (Produto produto : estoqueProdutosMap.values()) {
            int quantidade = produto.getQuantidade();
            double valorTotal = produto.getPreco() * quantidade;
            if (valorTotal > maiorQuantidade) {
                maiorQuantidade = quantidade;
                produtoMaiorQuantidadeValorTotalNoEstoque = produto;
            }
        }

        return produtoMaiorQuantidadeValorTotalNoEstoque;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.adicionarProduto(1, "QBoa", 10, 10.0);
        estoqueProdutos.adicionarProduto(2, "Calça do Josias", 20, 20.0);
        estoqueProdutos.adicionarProduto(3, "X-Borguer", 30, 30.0);
        estoqueProdutos.adicionarProduto(4, "Ração pra hamster", 40, 40.0);
        estoqueProdutos.adicionarProduto(5, "Rodo de espuma", 50, 50.0);

        System.out.println("Valor total do estoque: " + estoqueProdutos.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: " + estoqueProdutos.obterProdutoMaisCaro());
        System.out.println("Produto mais barato: " + estoqueProdutos.obterProdutoMaisBarato());
        System.out.println("Produto com maior quantidade e maior valor total no estoque: " + estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }
}
