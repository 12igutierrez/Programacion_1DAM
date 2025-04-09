package Clase1_Ejercicio1;

public class Silla extends Mueble {
	boolean esConjunto;
	int cantConjunto;
	
	public Silla(int id, String nombre, int cantidad_disponible, double precio, 
			Stock stock, boolean esConjunto, int cantConjunto) {
		super(id, nombre, cantidad_disponible, precio, stock);
		this.esConjunto = esConjunto;
		this.cantConjunto = cantConjunto;
	}

	public boolean isEsConjunto() {
		return esConjunto;
	}
	public void setEsConjunto(boolean esConjunto) {
		this.esConjunto = esConjunto;
	}

	public int getCantConjunto() {
		return cantConjunto;
	}
	public void setCantConjunto(int cantConjunto) {
		this.cantConjunto = cantConjunto;
	}
	
	@Override public String mostrarInfo() {
		String cad = "";
		if (esConjunto == true) {
			cad += "El conjunto de "+cantConjunto+" sillas de nombre "+nombre+" está "+stock+" y vale "+precio;
			return cad;
		} else {
			cad += "La silla de nombre "+nombre+" está "+stock+" y vale "+precio;
			return cad;
		}
	}
	
	
	@Override public void disminuyeCantidad() {
		if (esConjunto == true) {
			cantidad_disponible -= cantConjunto ;
		}	
	}

}
