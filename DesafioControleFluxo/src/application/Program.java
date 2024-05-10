package application;

import java.util.Scanner;

import entities.Contador;
import exception.ParametrosInvalidosException;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
	
		
		try {
			System.out.print("Digite o primeiro parâmetro: ");
			int parametro1 = sc.nextInt();
			System.out.print("Digite o segundo  parâmetro: ");
			int parametro2 = sc.nextInt();
			
			Contador contador = new Contador(parametro1, parametro2);
			contador.ContadorF(parametro1, parametro2);
			
			contador.Iteracoes();
		} catch (ParametrosInvalidosException e) {
			e.printStackTrace();
		}
		
		sc.close();
	}

}
