package main;

public class Combustivel {
	int horas;
	double velocidade;
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	public double getDistancia() {
		return horas * velocidade;
	}
	public double getQuantidadel(){
		return getDistancia()/12;
	}
	

}
