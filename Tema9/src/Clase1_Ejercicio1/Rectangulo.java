package Clase1_Ejercicio1;

public class Rectangulo implements Figura {
	private double base;
	private double altura;
	
	public Rectangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	
	
	@Override public double calcularArea() {
		return base*altura;
	}
	
	@Override public double calcularPerimetro() {
		return (2*base) + (2*altura);
	}
}
