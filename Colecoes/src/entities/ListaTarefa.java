package entities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListaTarefa {
	
	public List<Tarefas> listaTarefa;

	public ListaTarefa() {
		this.listaTarefa = new ArrayList<>();
	}
	
	public void AdicionatTarefa(String descricao) {
		listaTarefa.add(new Tarefas(descricao));
	}
	
	public void remverTarefa(String descricao) {
		List<Tarefas> removerTarefas = new ArrayList<>();
		for	(Tarefas t: listaTarefa) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				removerTarefas.add(t);
			}
		}
		listaTarefa.removeAll(removerTarefas);
	}
	
	public int totalTarefas() {
		return listaTarefa.size();
	}
	
	public void descricaoTarefas() {
		
		System.out.println(listaTarefa.toString());
	}
	
	public void pesquisarTarefa(String descricao) {
		List<Tarefas> pesquisarTarefa = new ArrayList<>();
		for(Tarefas t : listaTarefa) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				listaTarefa.add(t);
			}
		}
		pesquisarTarefa.toString();
	}
	
	

}
