package main.java.map.Ordenacao;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LivrariaOnline {
    private Map<String, Livro> livrosMap;

    public LivrariaOnline() {
        this.livrosMap = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco) {
        livrosMap.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String link) {
        livrosMap.remove(link);
    }

    public void exibirLivrosOrdenadosPorPreco() {
        Comparator<Livro> comparator = Comparator.comparing(Livro::getPreco);
        Map<Livro, String> livrosOrdenados = new TreeMap<>(comparator);

        for (Map.Entry<String, Livro> entry : livrosMap.entrySet()) {
            livrosOrdenados.put(entry.getValue(), entry.getKey());
        }
        
        for (Map.Entry<Livro, String> entry : livrosOrdenados.entrySet()) {
            System.out.println(entry.getKey());
        }
    }

    public Map<String, Livro> pesquisarLivrosPorAutor(String autor) {
        Map<String, Livro> livrosPorAutor = new HashMap<>();

        for (Map.Entry<String, Livro> entry : livrosMap.entrySet()) {
            if (entry.getValue().getAutor().equals(autor)) {
                livrosPorAutor.put(entry.getKey(), entry.getValue());
            }
        }

        return livrosPorAutor;
    }

    public Livro obterLivroMaisCaro() {
        Livro livroMaisCaro = null;
        double precoMaisCaro = Double.MIN_VALUE;

        for (Map.Entry<String, Livro> entry : livrosMap.entrySet()) {
            if (entry.getValue().getPreco() > precoMaisCaro) {
                livroMaisCaro = entry.getValue();
                precoMaisCaro = entry.getValue().getPreco();
            }
        }

        return livroMaisCaro;
    }

    public void exibirLivroMaisBarato() {
        Livro livroMaisBarato = null;
        double precoMaisBarato = Double.MAX_VALUE;

        for (Map.Entry<String, Livro> entry : livrosMap.entrySet()) {
            if (entry.getValue().getPreco() < precoMaisBarato) {
                livroMaisBarato = entry.getValue();
                precoMaisBarato = entry.getValue().getPreco();
            }
        }

        System.out.println("Livro mais barato: " + livroMaisBarato);
    }

    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();

        livrariaOnline.adicionarLivro("https://www.livraria.com/livro1", "Dom Casmurro", "Machado de Assis", 29.90);
        livrariaOnline.adicionarLivro("https://www.livraria.com/livro2", "O Pequeno Príncipe",
                "Antoine de Saint-Exupéry", 19.90);
        livrariaOnline.adicionarLivro("https://www.livraria.com/livro3", "O Hobbit", "J.R.R. Tolkien", 39.90);

        livrariaOnline.exibirLivrosOrdenadosPorPreco();

        System.out.println(
                "Livros do autor Machado de Assis: " + livrariaOnline.pesquisarLivrosPorAutor("Machado de Assis"));

        System.out.println("Livro mais caro: " + livrariaOnline.obterLivroMaisCaro());

        livrariaOnline.exibirLivroMaisBarato();

        livrariaOnline.removerLivro("https://www.livraria.com/livro2");

        livrariaOnline.exibirLivrosOrdenadosPorPreco();
    }
}
