package entities;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
	
	private Map<Long, Produto> estoqueProdutosMap;
	
	public EstoqueProdutos() {
		this.estoqueProdutosMap = new HashMap<>();
	}
	
	public void adicinarProduto(Long cod,String nome, double preco, int quantidade) {
		estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
	}
	
	public void exebirProdutos() {
		System.out.println(estoqueProdutosMap);
	}
	
	public double calcularValorTotalEstoque() {
		double valorTotalEstoque = 0;
		if(!estoqueProdutosMap.isEmpty()) {
			for(Produto p : estoqueProdutosMap.values()) {
				valorTotalEstoque += p.getPreco() * p.getQuantidade();
			}
		}
		return valorTotalEstoque;
	}
	
	public Produto obterProdutoaisCaro() {
		Produto produtoMaisCaro = null;
		Double maiorPreco = Double.MIN_VALUE;
		if(!estoqueProdutosMap.isEmpty()) {
			for(Produto p : estoqueProdutosMap.values()) {
				if(p.getPreco() > maiorPreco) {
					produtoMaisCaro = p;
				}
			}
		}
		return produtoMaisCaro;
	}

}
