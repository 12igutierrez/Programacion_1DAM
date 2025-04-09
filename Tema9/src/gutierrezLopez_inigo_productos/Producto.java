package gutierrezLopez_inigo_productos;

public interface Producto {
	public String getNombre();
	
	public double getPrecio();
	
	public String getDescripcion();
	
	public void aplicarDescuento(double descuento);
	
	public void reponer(int cantidad);
	
	public boolean comprobarDisponibilidad();
	
	public void mostrarInformacion();
}
