package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBanco;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("digite o numero da conta: ");
		int numeroConta = sc.nextInt();
		sc.nextLine();
		System.out.print("Digite o número da Agência: ");
		String numeroAgencia = sc.nextLine();
		System.out.print("digite seu nome seu nome: ");
		String nome = sc.nextLine();
		
		
		ContaBanco contaBanco = new ContaBanco(numeroConta, numeroAgencia, nome);
		System.out.println(contaBanco.toString());
		
		
		sc.close();
		

	}

}
