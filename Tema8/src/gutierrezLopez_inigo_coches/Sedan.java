package gutierrezLopez_inigo_coches;

public class Sedan extends Coches{
	private double longitud;
	
	
	public double getLongitud() {
		return longitud;
	}
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	
	
	public Sedan(int velocidad, int precio, String color, double longitud) {
		super(velocidad, precio, color);
		this.longitud = longitud;
	}
	
	
	@Override public double calcularPrecio() {
		double precio = 0;
		if (longitud > 4) {
			precio = getPrecio() - ((getPrecio() * 5) / 100);
		} else {
			precio = getPrecio() - ((getPrecio() * 10) / 100);
		}
		return precio;
	}
	
}
