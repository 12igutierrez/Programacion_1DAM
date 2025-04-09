package Clase1_Ejercicio1;

public class main {

	public static void main(String[] args) {
		Circulo c = new Circulo(3.6);
		Rectangulo r = new Rectangulo(2.3,4);
		
		System.out.println(c.calcularArea());
		System.out.println(c.calcularPerimetro());
		System.out.println(r.calcularArea());
		System.out.println(r.calcularPerimetro());
		System.out.println(Figura.areaCirculo(3));

	}

}
