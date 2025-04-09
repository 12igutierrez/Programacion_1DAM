package gutierrezLopez_inigo_centro_recuperacion;

public abstract class AnimalBase implements Animal {
	
	enum EstadoSalud {Herido, Grave, Riesgoso, Recuperandose, Bien};
	protected String nombre;
	protected int edad;
	EstadoSalud estadoSalud;
	protected String dieta;
	protected int nivelEnergia;
	
	abstract public String mostrarInformacion();
	
	abstract public boolean necesitaDescanso();

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public EstadoSalud getEstadoSalud() {
		return estadoSalud;
	}
	public void setEstadoSalud(EstadoSalud estadoSalud) {
		this.estadoSalud = estadoSalud;
	}

	public String getDieta() {
		return dieta;
	}
	public void setDieta(String dieta) {
		this.dieta = dieta;
	}

	public int getNivelEnergia() {
		return nivelEnergia;
	}
	public void setNivelEnergia(int nivelEnergia) {
		this.nivelEnergia = nivelEnergia;
	}

	public AnimalBase(String nombre, int edad, EstadoSalud estadoSalud, String dieta, int nivelEnergia) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.estadoSalud = estadoSalud;
		this.dieta = dieta;
		this.nivelEnergia = 50;
	}
	
	@Override public void alimentar(){
		nivelEnergia += 10;
	}
	
	@Override public void revisarSalud() {
		if (getEstadoSalud() == estadoSalud.Herido || getEstadoSalud() == estadoSalud.Grave || getEstadoSalud() == estadoSalud.Riesgoso) {
			estadoSalud = estadoSalud.Recuperandose;
		} if (getEstadoSalud() == estadoSalud.Recuperandose) {
			estadoSalud = estadoSalud.Bien;
		}
	}
	

}
