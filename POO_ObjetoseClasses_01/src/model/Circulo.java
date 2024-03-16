package model;

public class Circulo {

	public double raio;

	public double getPerimetro() {
		double perimetro = raio * 2 * 3.14;
		return perimetro;
	}
	
	public double getArea() {
		double area = 3.14 * (Math.pow(raio, 2));
		return area;
	}
	
	public void setRaio(double raio) {
		this.raio = raio;
	}
}
