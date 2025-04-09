package gutierrezLopez_inigo_profesores;

public class Profesor {
	private String nombre;
	private String especialidad;
	private String n_centro;
	private int anios_cons;
	
	public Profesor() {
		String nombre = "";
		String especialidad = "";
		String n_centro = "";
		int anios_cons = 0;
	}
	
	public Profesor(String nombre, String especialidad, String n_centro, int anios_cons) {
		super();
		this.nombre = nombre;
		this.especialidad = especialidad;
		this.n_centro = n_centro;
		this.anios_cons = anios_cons;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getN_centro() {
		return n_centro;
	}
	public void setN_centro(String n_centro) {
		this.n_centro = n_centro;
	}

	public int getAnios_cons() {
		return anios_cons;
	}
	public void setAnios_cons(int anios_cons) {
		this.anios_cons = anios_cons;
	}
	
	
	public double obtenerSalarioBase() {
		return (725 + (anios_cons * 33.25));
	}
}
