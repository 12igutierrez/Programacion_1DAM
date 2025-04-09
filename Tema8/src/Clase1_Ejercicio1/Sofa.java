package Clase1_Ejercicio1;

public class Sofa extends Mueble {
	int sitios;

	public Sofa(int id, String nombre, int cantidad_disponible, double precio, Stock stock, int sitios) {
		super(id, nombre, cantidad_disponible, precio, stock);
		this.sitios = sitios;
	}
	
	public int getSitios() {
		return sitios;
	}
	public void setSitios(int sitios) {
		this.sitios = sitios;
	}
	
	@Override public String mostrarInfo() {
		String cad = "";
		cad += "El sofa de "+sitios+" plazas de nombre "+nombre+" está "+stock+" y vale "+precio;
		return cad;
	}
	
	
}
