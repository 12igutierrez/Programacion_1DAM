package Clase3_Ejercicio1;

public class Rectangulo extends Poligono{

	public Rectangulo(double base, double altura) {
		super(base, altura);
	}
	
	@Override public double area() {
		return base * altura;
	}
	
}
