package gutierrezLopez_inigo_centro_recuperacion;

public class Mamifero extends AnimalBase{
	protected int peso;
	
	
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}


	public Mamifero(String nombre, int edad, EstadoSalud estadoSalud, String dieta, int nivelEnergia, int peso) {
		super(nombre, edad, estadoSalud, dieta, nivelEnergia);
		this.peso = peso;
	}
	
	
	@Override public String mostrarInformacion() {
		return "Nombre: "+getNombre()+"\nEdad: "+getEdad()+"\nEstado de salud: "+getEstadoSalud()+"\nDieta: "+getDieta()+
				"\nNivel de energia: "+getNivelEnergia()+"\nPeso: "+getPeso();
	}
	@Override public boolean necesitaDescanso() {
		if (getNivelEnergia() < 10) {
			return true;
		} else {
			return false;
		}
	}
	
	public void correr() {
		if (nivelEnergia > 10) {
            int resta = nivelEnergia - peso;
            System.out.println(nombre + " ha corrido. Energía restante: " + resta);
        } else {
            System.out.println(nombre + " no tiene suficiente energía para correr.");
        }
	}

	
}
