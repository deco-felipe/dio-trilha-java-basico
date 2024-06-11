package entities;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
	
	private Set<Convidado> convidadosSet;
	
	public ConjuntoConvidados() {
		this.convidadosSet = new HashSet<>();
	}
	
	public void adicionarConvidado(String nome, int numeroConvite) {
		convidadosSet.add(new Convidado(nome, numeroConvite));
	}
	
	@SuppressWarnings("unchecked")
	public void removerConvidado(int codidoConvite) {
		Convidado removerPorNumeroConvite = null;
		for(Convidado c : convidadosSet) {
			if(c.getNumeroConvite() == codidoConvite) {
				removerPorNumeroConvite = c;
				break;
			}
		}
		convidadosSet.remove(removerPorNumeroConvite);
	}
	
	public int contarConvidados() {
		return convidadosSet.size();
	}
	
	public void exibirConvidados() {
		System.out.println(convidadosSet);
	}

}
