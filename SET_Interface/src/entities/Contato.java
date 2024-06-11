package entities;

import java.util.Objects;

public class Contato implements Comparable<Contato > {
	
	private String nome;
	private int numero;
	
	public Contato() {
		
	}
	
	public Contato(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", numero=" + numero + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}



	@Override
	public int compareTo(Contato c) {
		// TODO Auto-generated method stub
		return nome.compareToIgnoreCase(c.getNome());
	}

	
	

}
