package Clase3_Ejercicio1;

public class Triangulo extends Poligono {
	
	
	public Triangulo(double base, double altura) {
		super(base, altura);
	}

	@Override public double area() {
		return (super.base * super.altura) / 2;
		
	}
	
}
