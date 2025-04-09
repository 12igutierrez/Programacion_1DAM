package gutierrezLopez_inigo_coches;

public abstract class Coches {
	private int velocidad;
	private int precio;
	private String color;
	
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	public Coches(int velocidad, int precio, String color) {
		super();
		this.velocidad = velocidad;
		this.precio = precio;
		this.color = color;
	}
	
	public abstract double calcularPrecio();

}
