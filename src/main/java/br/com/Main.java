package br.com;

public class Main {

	public static void main(String[] args) {
		SmartTv smartTv = new SmartTv();
		
		smartTv.ligar();
		System.out.println("A tv está ligada ? " + smartTv.isLigada());
		
		smartTv.aumentarVolume();
		System.out.println("Volume atual : " + smartTv.getVolume());
		
		
		smartTv.novoCanal(152);
		System.out.println("Canal atual : " + smartTv.getCanal());
		
		smartTv.subirCanal();
		System.out.println(smartTv.getCanal());
		
	}

}
