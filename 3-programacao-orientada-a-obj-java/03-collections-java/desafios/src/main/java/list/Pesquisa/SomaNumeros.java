package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeroList = new ArrayList<>();

    public SomaNumeros() {
        this.numeroList = new ArrayList<>();
    }

    public void adicionarNumero(Integer numero) {
        this.numeroList.add(numero);
    }

    public void removerNumero(Integer numero) {
        this.numeroList.remove(numero);
    }

    public Integer calcularSoma() {
        int soma = 0;
        if (!this.numeroList.isEmpty()) {
            for (Integer n : this.numeroList) {
                soma += n;
            }
        }

        return soma;
    }

    public Integer encontrarMaiorNumero() {
        Integer maiorNumero = null;
        if (!this.numeroList.isEmpty()) {
            maiorNumero = this.numeroList.get(0);
            for (Integer n : this.numeroList) {
                if (n > maiorNumero) {
                    maiorNumero = n;
                }
            }
        }

        return maiorNumero;
    }

    public Integer encontrarMenorNumero() {
        Integer menorNumero = null;
        if (!this.numeroList.isEmpty()) {
            menorNumero = this.numeroList.get(0);
            for (Integer n : this.numeroList) {
                if (n < menorNumero) {
                    menorNumero = n;
                }
            }
        }

        return menorNumero;
    }

    public void exibirNumeros() {
        System.out.println(this.numeroList.toString());
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(20);
        somaNumeros.adicionarNumero(30);
        somaNumeros.adicionarNumero(40);

        System.out.println("Soma dos números: " + somaNumeros.calcularSoma());
        System.out.println("Maior número: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("Menor número: " + somaNumeros.encontrarMenorNumero());
        somaNumeros.exibirNumeros();

        somaNumeros.removerNumero(10);
        somaNumeros.removerNumero(40);

        System.out.println("Soma dos números: " + somaNumeros.calcularSoma());
        System.out.println("Maior número: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("Menor número: " + somaNumeros.encontrarMenorNumero());
        somaNumeros.exibirNumeros();
    }
}
