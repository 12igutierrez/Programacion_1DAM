package Clase3_Ejercicio1;

public class PoligonoRegular extends Poligono{
	private int numeroLados;
	private double apotema;
	
	public PoligonoRegular(double base, double altura, int numeroLados, double apotema) {
		super(base, altura);
		this.numeroLados = numeroLados;
		this.apotema = apotema;
	}
	
	@Override public double area() {
		return ((numeroLados * altura) * apotema) / 2;
	}

}
