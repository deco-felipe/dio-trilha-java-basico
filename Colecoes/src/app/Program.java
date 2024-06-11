package app;

import java.util.Scanner;

import entities.ListaTarefa;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ListaTarefa listaTarefas = new ListaTarefa();
		
		System.out.println("Digite o numero de tarefas que sera adicionada:");
		int n = sc.nextInt();
		for(int i = 0; i <= n; i++) {
			System.out.println("Tarefa: ");
			String descricao = sc.nextLine();
			listaTarefas.AdicionatTarefa(descricao);
			listaTarefas.descricaoTarefas();
		}
		
		System.out.println("total tarefas" + listaTarefas.totalTarefas());
		System.out.println("------------------");
		System.out.println("Digite a tarefa quedeseje remover: ");
		String descricao = sc.nextLine();
		listaTarefas.remverTarefa(descricao);
		System.out.println("total tarefas " + listaTarefas.totalTarefas());
		
		System.out.println("-------------------------");
		System.out.println("Pesquisar Tarefa: ");
		String pesquisa = sc.nextLine();
		System.out.println("Resultado da pesquisa: ");
		listaTarefas.pesquisarTarefa(pesquisa);
		
		sc.close();
	}

}
