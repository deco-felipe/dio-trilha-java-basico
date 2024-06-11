package entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CatalagosLivros {

	private List<Livro> livroList;

	public CatalagosLivros() {
		this.livroList = new ArrayList<>();
	}

	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		livroList.add(new Livro(titulo, autor, anoPublicacao));
	}

	public List<Livro> pesquisarPorAutor(String autor){
		
		List<Livro> livroPorAutor = new ArrayList<>();
		if(!livroList.isEmpty()) {
			for(Livro l : livroList) {
				if(l.getAutor().equalsIgnoreCase(autor)) {
					livroPorAutor.add(l);
				}
			}
		}
		return livroPorAutor;
	}
	
	public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal){
		List<Livro> livroPorIntervaloAnos = new ArrayList<>();
		
		if(!livroList.isEmpty()) {
			for(Livro li : livroList) {
				if(li.getAnoPublicacao() >= anoInicial && li.getAnoPublicacao() <= anoFinal) {
					livroPorIntervaloAnos.add(li);
				}
			}
		}
		return livroPorIntervaloAnos;
	}
	
	public Livro pesquisaPorTitulo(String titulo) {
		Livro livroPorTitulo = null;
		
		if(!livroList.isEmpty()) {
			for(Livro l: livroList) {
				if(l.getTitulo().equalsIgnoreCase(titulo)) {
					livroPorTitulo = l;
					break;
				}
			}
		}
		return livroPorTitulo;
	}

	public List<Livro> OrdernarPorAutor(){
		List<Livro> livroPorAutor = new ArrayList<>(livroList);
		Collections.sort(livroPorAutor);
		return livroPorAutor;
	}
	
	public List<Livro>OrdernarPorTitulo(){
		List<Livro> livroPorTitulo = new ArrayList<>(livroList);
		Collections.sort(livroPorTitulo, new Livro());
		return livroPorTitulo;
	}

	

	
}
