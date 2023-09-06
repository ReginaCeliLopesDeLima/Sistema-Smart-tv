package br.com;

public class SmartTv {
	private boolean ligada = true;
	private int canal = 1;
	private int volume = 18;
	
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
	public boolean ligar() {
		return ligada = true;
	}
	public boolean desligar() {
		return ligada = false;
	}
	public int aumentarVolume() {
		return volume++;
	}
	public int diminuirVolume() {
		return volume--;
	}
	public int subirCanal() {
		return canal++; 
	}
	public int descerCanal() {
		return canal--; 
	}
	public int novoCanal(int novoCanal) {
		return canal = novoCanal; 
	}
	
	
}
