package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao, false));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaARemover = null;
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equals(descricao)) {
                tarefaARemover = t;
                break;
            }
        }

        if (tarefaARemover != null) {
            tarefaSet.remove(tarefaARemover);
        }
    }

    public void exibirTarefas() {
        System.out.println(tarefaSet);
    }

    public int contarTarefas() {
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if (t.isConcluida()) {
                tarefasConcluidas.add(t);
            }
        }

        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if (!t.isConcluida()) {
                tarefasPendentes.add(t);
            }
        }

        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equals(descricao)) {
                t.setConcluida(true);
                break;
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equals(descricao)) {
                t.setConcluida(false);
                break;
            }
        }
    }

    public void limparListaTarefas() {
        tarefaSet.clear();
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Estudar Spring");
        listaTarefas.adicionarTarefa("Estudar Spring Boot");
        listaTarefas.adicionarTarefa("Estudar Spring Data JPA");
        listaTarefas.adicionarTarefa("Estudar Spring Security");
        listaTarefas.adicionarTarefa("Estudar Spring Cloud");
        listaTarefas.adicionarTarefa("Estudar Spring Cloud Data Flow");

        listaTarefas.marcarTarefaConcluida("Estudar Java");
        listaTarefas.marcarTarefaConcluida("Estudar Spring");
        listaTarefas.marcarTarefaConcluida("Estudar Spring Boot");

        System.out.println("Quantidade de tarefas: " + listaTarefas.contarTarefas());
        listaTarefas.exibirTarefas();

        System.out.println("Tarefas concluídas: " + listaTarefas.obterTarefasConcluidas());
        System.out.println("Tarefas pendentes: " + listaTarefas.obterTarefasPendentes());

        listaTarefas.marcarTarefaPendente("Estudar Spring Boot");
        System.out.println("Tarefas pendentes: " + listaTarefas.obterTarefasPendentes());

        listaTarefas.removerTarefa("Estudar Spring Boot");
        System.out.println("Quantidade de tarefas: " + listaTarefas.contarTarefas());

        listaTarefas.limparListaTarefas();
        System.out.println("Quantidade de tarefas: " + listaTarefas.contarTarefas());
    }

}
