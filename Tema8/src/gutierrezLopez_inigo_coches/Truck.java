package gutierrezLopez_inigo_coches;

public class Truck extends Coches {
	private double peso_maximo;
	
	
	public double getPeso_maximo() {
		return peso_maximo;
	}
	public void setPeso_maximo(double peso_maximo) {
		this.peso_maximo = peso_maximo;
	}
	

	public Truck(int velocidad, int precio, String color, double peso_maximo) {
		super(velocidad, precio, color);
		this.peso_maximo = peso_maximo;
	}
	
	@Override public double calcularPrecio(){
		double precio;
		if (getPeso_maximo() > 2000) {
			precio = getPrecio() - ((getPrecio() * 10) / 100);
		} else {
			precio = getPrecio() - ((getPrecio() * 20) / 100);
		}
		return precio;
	}

}
