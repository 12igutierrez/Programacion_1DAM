package gutierrezLopez_inigo_alimentaria;

public class Productos {
	private String nombre;
	private String fecha_caducidad;
	private int n_lote;

	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFecha_caducidad() {
		return fecha_caducidad;
	}
	public void setFecha_caducidad(String fecha_caducidad) {
		this.fecha_caducidad = fecha_caducidad;
	}
	public int getN_lote() {
		return n_lote;
	}
	public void setN_lote(int n_lote) {
		this.n_lote = n_lote;
	}
	
	
	public Productos(String nombre, String fecha_caducidad, int n_lote) {
		this.nombre = nombre;
		this.fecha_caducidad = fecha_caducidad;
		this.n_lote = n_lote;
	}
	
}
