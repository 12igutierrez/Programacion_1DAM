package gutierrezLopez_inigo_dispositivo;

public class Lavadora implements Dispositivo{
	protected String modo;
	protected int potencia;
	protected boolean estado;
	protected int capacidad;
	protected final int capacidadMaxima = 100;
	
	
	public String getModo() {
		return modo;
	}
	public void setModo(String modo) {
		this.modo = modo;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}
	
	
	public Lavadora(String modo, int potencia, boolean estado, int capacidad) {
		this.modo = modo;
		this.potencia = potencia;
		this.estado = estado;
		this.capacidad = capacidad;
	}
	
	
	@Override public void encender() {
		estado = true;
	}
	
	@Override public void apagar() {
		estado = false;
	}
	
	@Override public String mostrarInformacion() {
		return "Lavadora [modo=" + modo + ", potencia=" + potencia + ", estado=" + estado + ", capacidad=" + capacidad
				+ "%, capacidadMaxima=" + capacidadMaxima + "%]";
	}
	
	public void restarCapacidad(int cantidad) {
		capacidad -= cantidad;
	}
	
	public void aumentarCapacidad(int cantidad) {
		if ((cantidad + capacidad) < capacidadMaxima) {
			capacidad += cantidad;
		} else {
			System.out.println("ERROR: La cantidad a aumentar es mayor que la capacidad maxima.");
		}
	}
	
	public void seleccionarModo(String cadena) {
		if (cadena == "Corta duracion" || cadena == "Potencia maxima" || cadena == "Sostenible") {
			modo = cadena;
		}
	}
	
	public void seleccionarPotencia(int cantidad) {
		potencia = cantidad;
	}
	
	
}
