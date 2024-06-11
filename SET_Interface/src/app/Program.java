package app;

import entities.AgendaContatos;
import entities.ConjuntoConvidados;

public class Program {

	public static void main(String[] args) {
		
		ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
		
		conjuntoConvidados.adicionarConvidado("Deco", 1);
		conjuntoConvidados.adicionarConvidado("Ingra", 22);
		conjuntoConvidados.adicionarConvidado("Manuca", 3);
		conjuntoConvidados.adicionarConvidado("Gordinha", 5);
		conjuntoConvidados.adicionarConvidado("Heitor", 12);
		conjuntoConvidados.adicionarConvidado("Jeff", 20);
		conjuntoConvidados.adicionarConvidado("Felipe", 18);
		conjuntoConvidados.adicionarConvidado("Agnaldo", 30);
		
		System.out.printf("Quantidade de convidados: " + conjuntoConvidados.contarConvidados());
		conjuntoConvidados.exibirConvidados();
		
		System.out.println("Removendo um convidado");
		conjuntoConvidados.removerConvidado(30);
		
		System.out.printf("Quantidade de convidados: " + conjuntoConvidados.contarConvidados());
		conjuntoConvidados.exibirConvidados();
		
		System.out.println("-----------------------------------");
		
		AgendaContatos agenda = new AgendaContatos();
		
		agenda.adicionarContato("deco", 12);
		agenda.adicionarContato("ingra", 14);
		agenda.adicionarContato("gordinha", 16);
		agenda.adicionarContato("mauca", 18);
		agenda.adicionarContato("heitor", 20);
		agenda.adicionarContato("jeff", 22);
		
		agenda.exibirContatos();
		
		System.out.println("atualizarcontato");
		agenda.atualizarContato("deco", 26);
		System.out.println(agenda.exibirContatoPorNome());
		agenda.exibirContatos();
		
		System.out.println("pesquisar contato ");
		System.out.println(agenda.pesquisarContato("ingra"));

	}

}
