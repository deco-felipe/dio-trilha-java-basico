package application;

import eletronics.SmartTv;

public class Program {

	public static void main(String[] args) {
	
		SmartTv smartTv = new SmartTv();
		
		System.out.println("TV Ligada? " + smartTv.isLigada());
		System.out.println("Canal Atual : " + smartTv.getCanal());
		System.out.println("Volume Atual : " + smartTv.getVolume());
		
		smartTv.ligar();
		System.out.println("TV Ligada? " + smartTv.isLigada());
		
		smartTv.aumentarVolume();
		System.out.println("Volume Atual : " + smartTv.getVolume());
		
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		System.out.println("Volume Atual : " + smartTv.getVolume());
		
		smartTv.mudarCanal(15);
		System.out.println("Canal Atual : " + smartTv.getCanal());

	}

}
