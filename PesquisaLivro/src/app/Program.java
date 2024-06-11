package app;

import entities.CatalagosLivros;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CatalagosLivros catalago = new CatalagosLivros();
		catalago.adicionarLivro("batalha", "Deco", 2020);
		catalago.adicionarLivro("mar", "felipe", 2018);
		catalago.adicionarLivro("navio", "jeff", 2022);
		catalago.adicionarLivro("ponte", "agnaldo", 2010);
		catalago.adicionarLivro("nada", "jafsantos", 2021);
		catalago.adicionarLivro("guerreiro", "JeffFelipe", 2024);
		
		System.out.println(catalago.toString());
		
		System.out.println("Pesquisa por ator " + catalago.pesquisarPorAutor("Deco"));
		System.out.println(catalago.pesquisaPorIntervaloAnos(2022, 2022));
		System.out.println("Pesquisapor titulo " + catalago.pesquisaPorTitulo("batalha"));
		
		System.out.println("------------------------");
		System.out.println("Ordenadopor autor");
		System.out.println(catalago.OrdernarPorAutor());
		System.out.println();
		System.out.println("-------------------------");
		System.out.println("Ordenado por titulo");
		System.out.println(catalago.OrdernarPorTitulo());
		

	}

}
