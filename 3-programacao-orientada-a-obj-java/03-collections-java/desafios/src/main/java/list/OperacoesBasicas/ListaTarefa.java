package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        this.tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasARemover = new ArrayList<>();
        for (Tarefa t : this.tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasARemover.add(t);
            }
        }

        this.tarefaList.removeAll(tarefasARemover);
    }

    public int obterNumeroTotalTarefas() {
        return this.tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefaList.toString());
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        listaTarefa.adicionarTarefa("Estudar Java");
        listaTarefa.adicionarTarefa("Estudar Spring");
        listaTarefa.adicionarTarefa("Estudar Spring Boot");

        System.out.println("Número total de tarefas: " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.obterDescricoesTarefas();

        listaTarefa.removerTarefa("Estudar Spring");

        System.out.println("Número total de tarefas: " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.obterDescricoesTarefas();

        System.out.println("Tarefa: " + listaTarefa.tarefaList.get(0).toString());
    }

}
