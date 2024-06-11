package entities;

import java.util.Comparator;

public class Livro implements Comparable<Livro>, Comparator<Livro>  {
	
	private String titulo;
	private String autor;
	private int anoPublicacao;
	
	public Livro() {
	}
	
	public Livro(String titulo, String autor, int anoPublicacao) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
	}
	public String getTitulo() {
		return titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public int getAnoPublicacao() {
		return anoPublicacao;
	}
	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", anoPublicacao=" + anoPublicacao + "]";
	}
	@Override
	public int compareTo(Livro l) {
		
		return String.CASE_INSENSITIVE_ORDER.compare(autor, l.getAutor() );
	}
	@Override
	public int compare(Livro l1, Livro l2) {
		
		return String.CASE_INSENSITIVE_ORDER.compare(l1.getTitulo(), l2.getTitulo());
	}
		

}
