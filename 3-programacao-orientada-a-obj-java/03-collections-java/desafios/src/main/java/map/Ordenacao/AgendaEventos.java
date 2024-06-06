package main.java.map.Ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> agendaEventosMap;

    public AgendaEventos() {
        this.agendaEventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        agendaEventosMap.put(data, new Evento(nome, atracao));
    }

    public void removerEvento(LocalDate data) {
        agendaEventosMap.remove(data);
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(agendaEventosMap);
        System.out.println(eventosTreeMap);
    }

    public Evento obterProximoEvento() {
        Evento proximoEvento = null;
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(agendaEventosMap);

        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                System.out.println("Próximo evento: " + entry.getKey());
                proximoEvento = entry.getValue();
                break;
            }
        }

        return proximoEvento;
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2024, 10, 10), "Show de Rock", "Banda X");
        agendaEventos.adicionarEvento(LocalDate.of(2025, 10, 15), "Festival de Jazz", "Artista Y");
        agendaEventos.adicionarEvento(LocalDate.of(2026, 10, 20), "Balada Eletrônica", "DJ Z");

        agendaEventos.exibirAgenda();

        System.out.println("Próximo evento: " + agendaEventos.obterProximoEvento());

        agendaEventos.removerEvento(LocalDate.of(2025, 10, 15));

        agendaEventos.exibirAgenda();

        System.out.println("Próximo evento: " + agendaEventos.obterProximoEvento());
    }
}
