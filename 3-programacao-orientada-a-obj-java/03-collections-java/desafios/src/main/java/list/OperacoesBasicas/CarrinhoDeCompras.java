package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, double quantidade) {
        this.itens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensARemover = new ArrayList<>();
        for (Item i : this.itens) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                itensARemover.add(i);
            }
        }

        this.itens.removeAll(itensARemover);
    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        for(Item i : this.itens) {
            valorTotal += i.getValorTotal();
        }

        return valorTotal;
    }

    public void exibirItens() {
        System.out.println(itens.toString());
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("Camiseta", 50.0, 2);
        carrinhoDeCompras.adicionarItem("Calça", 100.0, 1);
        carrinhoDeCompras.adicionarItem("Tênis", 200.0, 1);

        System.out.println("Valor total: " + carrinhoDeCompras.calcularValorTotal());
        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.removerItem("Calça");

        System.out.println("Valor total: " + carrinhoDeCompras.calcularValorTotal());
        carrinhoDeCompras.exibirItens();

        System.out.println("Item: " + carrinhoDeCompras.itens.get(0).toString());
    }
}
