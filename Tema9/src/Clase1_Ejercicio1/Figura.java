package Clase1_Ejercicio1;

public interface Figura {
	public double calcularArea();
	
	public  double calcularPerimetro();
	
	public static double areaCirculo(double radio) {
		return (redondearPI() * (radio * radio));
	}
	
	private static double redondearPI() {
		return Math.round(Math.PI * 100)/100;
	}
}
