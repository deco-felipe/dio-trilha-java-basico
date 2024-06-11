package app;

import entities.Cliente;
import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Program {

	public static void main(String[] args) {
		
		Cliente deco = new Cliente();
		deco.setNome("Deco");
		
		Conta cc = new ContaCorrente(deco);
		Conta poupanca = new ContaPoupanca(deco);
		
		cc.depositar(250);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
