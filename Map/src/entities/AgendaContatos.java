package entities;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
	
	private Map<String, Integer>agendaContatoMap;
	
	public AgendaContatos() {
		this.agendaContatoMap = new HashMap<>();
	}
	
	public void AdicionarContato(String noe, Integer telefone) {
		agendaContatoMap.put(noe, telefone);
	}
	
	public void removerContato(String nome) {
		if(!agendaContatoMap.isEmpty()) {
			agendaContatoMap.remove(nome);
		}
	}
	
	public void exibirContato() {
		System.out.println(agendaContatoMap);
	}
	
	public Integer pesquisarPorNome(String nome) {
		Integer numeroPornome = null;
		if(!agendaContatoMap.isEmpty()) {
			numeroPornome = agendaContatoMap.get(nome);
		}
		return numeroPornome;
	}
	
	

}
