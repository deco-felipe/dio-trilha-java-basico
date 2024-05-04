package entities;

public class ContaBanco {
	
	private int numero;
	private String agencia;
	private String nomeCliente;
	private Double saldo = 2500.00;
	
	public ContaBanco() {
	}
	
	public ContaBanco(int numero, String agencia, String nomeCliente) {
		this.numero = numero;
		this.agencia = agencia;
		this.nomeCliente = nomeCliente;
		
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}


	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public Double getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		return "Olá " + getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " + getAgencia()
					+ ", conta " + getNumero() + " e seu saldo " + String.format("%.2f", getSaldo()) + " já está disponível para saque. "
				;
	}

	
	
	

}
