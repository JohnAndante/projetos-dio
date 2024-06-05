package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public void removerLivro(String titulo) {
        Livro livroARemover = null;
        for (Livro l : livroList) {
            if (l.getTitulo().equalsIgnoreCase(titulo)) {
                livroARemover = l;
                break;
            }
        }

        livroList.remove(livroARemover);
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();

        if (!livroList.isEmpty()) {

            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }

        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicio, int anoFim) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();

        if (!livroList.isEmpty()) {

            for (Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoInicio && l.getAnoPublicacao() <= anoFim) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }

        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        for (Livro l : livroList) {
            if (l.getTitulo().equalsIgnoreCase(titulo)) {
                livroPorTitulo = l;
                break;
            }
        }

        return livroPorTitulo;
    }

    public void obterLivros() {
        System.out.println(livroList.toString());
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Java Como Programar", "Deitel", 2015);
        catalogoLivros.adicionarLivro("Java 8 Prático", "Casa do Código", 2016);
        catalogoLivros.adicionarLivro("Spring Boot", "Casa do Código", 2017);
        catalogoLivros.adicionarLivro("Spring Data JPA", "Casa do Código", 2018);

        System.out.println("Livros por autor: " + catalogoLivros.pesquisarPorAutor("Casa do Código"));
        System.out.println("Livros por intervalo de anos: " + catalogoLivros.pesquisarPorIntervaloAnos(2017, 2018));
        System.out.println("Livro por título: " + catalogoLivros.pesquisarPorTitulo("Spring Boot"));

        catalogoLivros.removerLivro("Spring Data JPA");

        catalogoLivros.obterLivros();
    }

}
