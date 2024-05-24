package iphone;

import iphone.funcionalidades.NavegadorInternet;
import iphone.funcionalidades.ReprodutorMusical;

public class NovoIphone extends Iphone implements ReprodutorMusical, NavegadorInternet {

	@Override
	public void Ligar(String numero) {
		 super.Ligar(numero);
	}

	@Override
	protected void Atender() {
		super.Atender();
	}

	@Override
	protected void IniciarCorreioVoz() {
		super.IniciarCorreioVoz();
	}

	@Override
	public void ExibirPagina(String url) {
		System.out.println("google.com");

	}

	@Override
	public void AdicionarNovaAba() {
		System.out.println("Nova aba ");

	}

	@Override
	public void AtualizarPagina() {
		System.out.println("Atualizat pagina ");

	}

	@Override
	public void Tocar() {
		System.out.println("play");

	}

	@Override
	public void Pausar() {
		System.out.println("pause");

	}

	@Override
	public void SelecionarMusica(String musica) {
		System.out.println("Selecionar musica: " + "musica 2 ");

	}

	public void IphoneFuncoes(String numero, String musica, String url) {
		Ligar(numero);
		Atender();
		IniciarCorreioVoz();
		Tocar();
		Pausar();
		SelecionarMusica(musica);
		ExibirPagina(url);
		AdicionarNovaAba();
		AtualizarPagina();
	}


}
