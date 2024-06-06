package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(nome, cod, preco, quantidade));
    }

    public void removerProduto(long cod) {
        Produto produtoARemover = null;
        for (Produto p : produtoSet) {
            if (p.getCod() == cod) {
                produtoARemover = p;
                break;
            }
        }

        if (produtoARemover != null) {
            produtoSet.remove(produtoARemover);
        }
    }

    public Set<Produto> exibirProdutosPorNome(String nome) {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco(double preco) {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarProduto(1, "QBoa", 10.0, 10);
        cadastroProdutos.adicionarProduto(2, "Calça do Josias", 20.0, 20);
        cadastroProdutos.adicionarProduto(3, "X-Borguer", 30.0, 30);
        cadastroProdutos.adicionarProduto(4, "Ração pra hamster", 40.0, 40);
        cadastroProdutos.adicionarProduto(5, "Rodo de espuma", 50.0, 50);

        System.out.println("Produtos por nome:");
        for (Produto p : cadastroProdutos.exibirProdutosPorNome("Produto 3")) {
            System.out.println(p);
        }

        System.out.println("Produtos por preço:");
        for (Produto p : cadastroProdutos.exibirProdutosPorPreco(30.0)) {
            System.out.println(p);
        }
    }

}
