package gutierrezLopez_inigo_coches;

public class Ford extends Coches{
	private int fabricacion;
	private int anios_concesionario;
	
	
	public int getFabricacion() {
		return fabricacion;
	}
	public void setFabricacion(int fabricacion) {
		fabricacion = 1;
		this.fabricacion = fabricacion;
	}
	public int getAnios_concesionario() {
		return anios_concesionario;
	}
	public void setAnios_concesionario(int anios_concesionario) {
		this.anios_concesionario = anios_concesionario;
	}
	
	
	public Ford(int velocidad, int precio, String color, int fabricacion, int anios_concesionario) {
		super(velocidad, precio, color);
		this.fabricacion = fabricacion;
		this.anios_concesionario = anios_concesionario;
	}
	
	@Override public double calcularPrecio() {
		double precio = 0;
		if (anios_concesionario > 3) {
			precio = getPrecio() - ((getPrecio() * 15) / 100);
		} else {
			precio = getPrecio();
		}
		return precio;
	}

}
