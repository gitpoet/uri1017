package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Combustivel com = new Combustivel();
		com.setHoras(ler.nextInt());
		com.setVelocidade(ler.nextDouble());
		ler.close();
		
		System.out.printf("%.3f%n", com.getQuantidadel());
		

	}

}
