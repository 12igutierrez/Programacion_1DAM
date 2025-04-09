package gutierrezLopez_inigo_centro_recuperacion;

public class Reptil extends AnimalBase{
	protected double temperaturaCorporal;

	public double getTemperaturaCorporal() {
		return temperaturaCorporal;
	}
	public void setTemperaturaCorporal(double temperaturaCorporal) {
		this.temperaturaCorporal = temperaturaCorporal;
	}
	
	
	public Reptil(String nombre, int edad, EstadoSalud estadoSalud, String dieta, int nivelEnergia,
			double temperaturaCorporal) {
		super(nombre, edad, estadoSalud, dieta, nivelEnergia);
		this.temperaturaCorporal = temperaturaCorporal;
	}
	
	
	public void tomarSol() {
		temperaturaCorporal += 1.5;
	}
	
	public void estarALaSombra() {
		temperaturaCorporal -= 2;
	}
	
	@Override public String mostrarInformacion() {
		return "Nombre: "+getNombre()+"\nEdad: "+getEdad()+"\nEstado de salud: "+getEstadoSalud()+"\nDieta: "+getDieta()+
				"\nNivel de energia: "+getNivelEnergia()+"\nTemperatura corporal: "+getTemperaturaCorporal();
	}
	
	@Override public boolean necesitaDescanso() {
		if (getNivelEnergia() < 15 && temperaturaCorporal < 30) {
			return true;
		} else {
			return false;
		}
	}

	
}
