package app;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import entities.AgendaContatos;
import entities.AgendaEventos;
import entities.EstoqueProdutos;

public class Program {

	public static void main(String[] args) {
		
		AgendaContatos agenda = new AgendaContatos();
		
		agenda.AdicionarContato("Deco", 12);
		agenda.AdicionarContato("Ingra", 20);
		agenda.AdicionarContato("Gordinha", 18);
		agenda.AdicionarContato("Manuca", 32);
		agenda.AdicionarContato("Heitor", 40);
		
		agenda.exibirContato();
		
		System.out.println(agenda.pesquisarPorNome("Ingra"));
		agenda.removerContato("Deco");
		agenda.exibirContato();
		
		System.out.println("-------------------------------------");
		EstoqueProdutos estoque = new EstoqueProdutos();
		
		estoque.adicinarProduto(1L, "Tv", 2500.00, 3);
		estoque.adicinarProduto(2L, "Celular", 850.00, 10);
		estoque.adicinarProduto(3L, "Ps5", 3500.00, 5);
		estoque.adicinarProduto(4L, "Ps4", 2000.00, 7);
		estoque.adicinarProduto(5L, "Xbox X", 2700.00, 4);
		
		estoque.exebirProdutos();
		System.out.println(estoque.calcularValorTotalEstoque());
		System.out.println(estoque.obterProdutoaisCaro());
		
		System.out.println("-------------------------------------");
		
		AgendaEventos eventos = new AgendaEventos();
		
		eventos.adicionar(LocalDate.of(2024, Month.JUNE, 05), "Evento1", "Atracao1");
		eventos.adicionar(LocalDate.of(2025, Month.AUGUST, 12), "Evento2", "Atracao2");
		eventos.adicionar(LocalDate.of(2024, Month.JULY, 18), "Evento3", "Atracao3");
		
		eventos.ExibirOrdenado();
		
		eventos.proximoEvento();
		
		Set<String> coresDaBandeiraDoBrasil = new TreeSet<>(Arrays.asList("verde", "amarelo", "azul", "branco"));
		System.out.println(coresDaBandeiraDoBrasil);
		
		List<Character> consoantesMeuNome = Arrays.asList('c', 'm', 'l', 'c', 'v', 'l', 'c', 'n', 't');
		 System.out.println(consoantesMeuNome);
		
		
		
	}

}
