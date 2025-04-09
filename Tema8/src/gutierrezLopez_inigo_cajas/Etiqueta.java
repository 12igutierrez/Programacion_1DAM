package gutierrezLopez_inigo_cajas;

public class Etiqueta {
	private String nombre;
	private String direccion;
	private String direccion_rem;
	private String empresa;
	private double peso;
	private String descripcion;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getDireccion_rem() {
		return direccion_rem;
	}
	public void setDireccion_rem(String direccion_rem) {
		this.direccion_rem = direccion_rem;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public Etiqueta(String nombre, String direccion, String direccion_rem, String empresa, double peso,
			String descripcion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.direccion_rem = direccion_rem;
		this.empresa = empresa;
		this.peso = peso;
		this.descripcion = descripcion;
	}

}
