package entities;

public class Convidado {
	
	private String nome;
	private Integer numeroConvite;
	
	public Convidado() {
	}
	
	public Convidado(String nome, int numeroConvite) {
		this.nome =nome;
		this.numeroConvite=numeroConvite;
	}

	public String getNome() {
		return nome;
	}

	public Integer getNumeroConvite() {
		return numeroConvite;
	}

	@Override
	public String toString() {
		return "Convidado : " + nome + " - " +  numeroConvite;
	}

	
	

}
