package app;

import iphone.NovoIphone;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("Novo Iphone ".toUpperCase());
		System.out.println();
		
		NovoIphone novoIphone = new NovoIphone();
		
		String numero = "12345678";
		String musica = "musica 2";
		String url = "url";
		novoIphone.IphoneFuncoes(numero, musica, url);

	}

}
