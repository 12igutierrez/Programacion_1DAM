package Clase1_Ejercicio2;

public class Pato implements Animal,Nadador,Volador{
	private double energia;

	public Pato(double energia) {
		this.energia = energia;
	}
	
	public double getEnergia() {
		return energia;
	}
	public void setEnergia(double energia) {
		this.energia = energia;
	}

	@Override public double dormir() {
		if (energia != 0) {
			return energia-= 1;
		}else {
			return energia;
		}
	}
	
	@Override public double avanzar(double num) {
		if (energia != 0) {
			return energia -= num;
		}else {
			return energia;
		}
	}
	
	@Override public double volar(double num) {
		if (energia != 0) {
			return energia -= (num * 2);
		}else {
			return energia;
		}
	}
	
	@Override public double nadar(double num) {
		if (energia != 0) {
			return energia -= (num / 2);
		}else {
			return energia;
		}
	}
	
	@Override public double alimentarse(double num) {
		return energia += num;
	}
}
