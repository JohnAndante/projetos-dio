package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numeroList;

    public OrdenacaoNumeros() {
        this.numeroList = new ArrayList<>();
    }

    public void adicionarNumero(Integer numero) {
        this.numeroList.add(numero);
    }

    public void removerNumero(Integer numero) {
        this.numeroList.remove(numero);
    }

    public List<Integer> getNumeroList() {
        return numeroList;
    }

    public void ordenarAscendente() {
        this.numeroList.sort(Integer::compareTo);
    }

    public void ordenarDescendente() {
        this.numeroList.sort((n1, n2) -> n2.compareTo(n1));
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
        ordenacaoNumeros.adicionarNumero(10);
        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(15);

        System.out.println("Lista de números:");
        System.out.println(ordenacaoNumeros.getNumeroList());

        ordenacaoNumeros.ordenarAscendente();
        System.out.println("\nOrdenação ascendente:");
        System.out.println(ordenacaoNumeros.getNumeroList());

        ordenacaoNumeros.ordenarDescendente();
        System.out.println("\nOrdenação descendente:");
        System.out.println(ordenacaoNumeros.getNumeroList());
    }
}
