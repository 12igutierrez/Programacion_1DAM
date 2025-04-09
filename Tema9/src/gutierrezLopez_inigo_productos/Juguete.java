package gutierrezLopez_inigo_productos;

public class Juguete implements Producto{
	private String nombre;
	private double precio;
	private String descripcion;
	private int edadRecomendada;
	private int cantidad;
	private boolean esInteractivo;
	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getEdadRecomendada() {
		return edadRecomendada;
	}
	public void setEdadRecomendada(int edadRecomendada) {
		this.edadRecomendada = edadRecomendada;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public boolean isEsInteractivo() {
		return esInteractivo;
	}
	public void setEsInteractivo(boolean esInteractivo) {
		this.esInteractivo = esInteractivo;
	}
	
	
	
	public Juguete(String nombre, double precio, String descripcion, int edadRecomendada, int cantidad,
			boolean esInteractivo) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.descripcion = descripcion;
		this.edadRecomendada = edadRecomendada;
		this.cantidad = cantidad;
		this.esInteractivo = esInteractivo;
	}
	
	
	
	@Override public void aplicarDescuento(double descuento) {
		precio -= (precio * (descuento / 100));
	}
	@Override public void reponer(int cantidad) {
		this.cantidad += cantidad;
	}
	@Override public boolean comprobarDisponibilidad() {
		return cantidad > 0;
	}
	@Override public void mostrarInformacion() {
		System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Edad Recomendada: " + edadRecomendada);
        System.out.println("Interactivo: " + esInteractivo);
	}
	@Override public String getNombre() {
		return nombre;
	}
	@Override public double getPrecio() {
		return precio;
	}
	@Override public String getDescripcion() {
		return descripcion;
	}
	
	
	
	
}
