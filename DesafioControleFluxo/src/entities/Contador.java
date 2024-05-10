package entities;

import exception.ParametrosInvalidosException;

public class Contador {
	
	
	
	private int parametro1;
	private int parametro2;
	private int soma = 0;
	
	public Contador() {
	}
	
	public Contador(int parametro1, int parametro2) {
		this.parametro1 = parametro1;
		this.parametro2 = parametro2;
		
	}

	public int getParametro1() {
		return parametro1;
	}

	public void setParametro1(int parametro1) {
		this.parametro1 = parametro1;
	}

	public int getParametro2() {
		return parametro2;
	}

	public void setParametro2(int parametro2) {
		this.parametro2 = parametro2;
	}

	public int getSoma() {
		return soma;
	}

	public void setSoma(int soma) {
		this.soma = soma;
	}
	
	public  int ContadorF(int parametro1, int parametro2) throws ParametrosInvalidosException {
		if (parametro1 > parametro2) {
			throw new ParametrosInvalidosException();
		}
		for(int p1 = 1; p1 <= parametro1; p1++) {
			System.out.println("Primeiro parametro: " + p1);
		}
		
		for(int p2 = 1; p2 <= parametro2; p2++) {
			System.out.println("Segundo parametro: " + p2);
		}
		
		return soma = parametro2 - parametro1;
	}
	
	public void Iteracoes() {
		System.out.println("Iteracoes: " + soma);
	}

}
