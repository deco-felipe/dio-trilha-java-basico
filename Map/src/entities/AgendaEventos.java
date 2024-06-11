package entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
	
	private Map<LocalDate, Evento> eventoMap;

	public AgendaEventos() {
		this.eventoMap = eventoMap = new HashMap<>();
	}
	
	public void adicionar(LocalDate data, String nome, String atracao) {
		Evento evento = new Evento(nome, atracao);
		eventoMap.put(data, evento);
	}
	
	public void exibirEvento() {
		System.out.println(eventoMap);
	}
	
	public void ExibirOrdenado() {
		Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventoMap);
		System.out.println(eventoTreeMap);
		
	}
	
	public void proximoEvento() {
		LocalDate dataAtual = LocalDate.now();
		Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventoMap);
		
		for(Map.Entry<LocalDate, Evento> entry : eventoTreeMap.entrySet()) {
			if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
				System.out.println("Proximo evento: " + entry.getValue() + " sera na data " + entry.getKey());
				break;
			}
		}
	}

}
