package eletronics;

public class SmartTv {
	
	boolean ligada = false;
	int canal = 1;
	int volume = 25;
	
	public SmartTv() {
	}
	
	public SmartTv(boolean ligada, int canal, int volume) {
		this.ligada = ligada;
		this.canal = canal;
		this.volume = volume;
	}

	public boolean isLigada() {
		return ligada;
	}

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public void ligar() {
		ligada = true;
	}
	
	public void desligar() {
		ligada = false;
	}
	
	public void aumentarVolume() {
		volume++;
	}
	
	public void diminuirVolume() {
		volume--;
	}
	
	public void aumentarCanal() {
		canal++;
	}
	
	public void diminuirCanal() {
		canal--;
	}
	
	public void mudarCanal(int canal) {
		this.canal = canal;
	}

}
