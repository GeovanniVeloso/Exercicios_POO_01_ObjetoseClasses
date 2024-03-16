package view;

import model.Circulo;

public class Principal {

	public static void main(String[] args) {
		Circulo circulo1 = new Circulo();
		
		circulo1.raio = 9.8;
		
		System.out.println("A área do circulo é: "+circulo1.getArea()+"cm");
		System.out.println("O perímetro do circulo é: "+circulo1.getPerimetro()+"cm");
	}

}
