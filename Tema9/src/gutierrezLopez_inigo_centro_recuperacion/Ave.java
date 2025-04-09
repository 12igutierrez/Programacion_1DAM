package gutierrezLopez_inigo_centro_recuperacion;

public class Ave extends AnimalBase {
	private boolean puedeVolar;
	private String habitat;
	
	
	public boolean isPuedeVolar() {
		return puedeVolar;
	}
	public void setPuedeVolar(boolean puedeVolar) {
		this.puedeVolar = puedeVolar;
	}

	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public Ave(String nombre, int edad, EstadoSalud estadoSalud, String dieta, int nivelEnergia, boolean puedeVolar,
			String habitat) {
		super(nombre, edad, estadoSalud, dieta, nivelEnergia);
		this.puedeVolar = puedeVolar;
		this.habitat = habitat;
	}

	public void volar() {
		if (puedeVolar == true && nivelEnergia > 10) {
			nivelEnergia -= 10;
		}
	}
	
	public String migrar() {
		return "El ave esta migrando a otra zona en el habitat " +getHabitat();
	}
	
	@Override public String mostrarInformacion() {
		return "Nombre: "+getNombre()+"\nEdad: "+getEdad()+"\nEstado de salud: "+getEstadoSalud()+"\nDieta: "+getDieta()+
				"\nNivel de energia: "+getNivelEnergia()+"\nPuede volar: "+isPuedeVolar()+"\nHabitat: "+getHabitat();		
	}

	@Override public boolean necesitaDescanso() {
		if (getNivelEnergia() < 20) {
			return true;
		} else {
			return false;
		}
	}
	

}
