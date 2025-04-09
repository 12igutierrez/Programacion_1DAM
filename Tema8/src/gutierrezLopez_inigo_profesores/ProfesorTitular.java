package gutierrezLopez_inigo_profesores;

public class ProfesorTitular extends Profesor{
	private Fecha fecha_alta;
	private int n_anios;

	public ProfesorTitular() {
		fecha_alta = new Fecha (1,1,2000);
		n_anios = 0;
	}
	
	public ProfesorTitular(String nombre, String especialidad, String n_centro, int anios_cons, Fecha fecha_alta,
			int n_anios) {
		super(nombre, especialidad, n_centro, anios_cons);
		this.fecha_alta = fecha_alta;
		this.n_anios = n_anios;
	}
	
	
	public Fecha getFecha_alta() {
		return fecha_alta;
	}
	public void setFecha_alta(Fecha fecha_alta) {
		this.fecha_alta = fecha_alta;
	}
	public int getN_anios() {
		return n_anios;
	}
	public void setN_anios(int n_anios) {
		this.n_anios = n_anios;
	}
	
	@Override public double obtenerSalarioBase() {
		return (725 + (47.80 * n_anios));
	}
	
	@Override public String toString() {
		return "El profesor "+ getNombre()+" con fecha de alta "+fecha_alta+ " en el centro "+getN_centro()+ 
				"\n con especialidad "+getEspecialidad()+" y salario "+obtenerSalarioBase()+"€";
	}
	
	
	
}
