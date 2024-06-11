package entities;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class AgendaContatos {
	
	private Set<Contato> contatoSet;
	
	public AgendaContatos() {
		this.contatoSet = new HashSet<>();
	}
	
	public void adicionarContato(String nome, int numero) {
		contatoSet.add(new Contato(nome, numero));
	}
	
	public void exibirContatos() {
		System.out.println(contatoSet);
	}
	
	public Set<Contato> pesquisarContato(String nome){
		Set<Contato> contatoPorNome = new HashSet<>();
		for(Contato c : contatoSet) {
			if(c.getNome().startsWith(nome)) {
				contatoPorNome.add(c);
			}
		}
		return contatoPorNome;
	}
	
	public Contato atualizarContato(String nome, int numero) {
		Contato contatoAtualizado = null;
		for(Contato c : contatoSet) {
			if(c.getNome().equalsIgnoreCase(nome)) {
				c.setNumero(numero);
				contatoAtualizado = c;
				break;
			}
		}
		return contatoAtualizado;
	}
	
	public Set<Contato> exibirContatoPorNome(){
		Set<Contato> contatoPorNome = new TreeSet<>(contatoSet);
		return contatoPorNome;
	}

}
