package gutierrezLopez_inigo_transportes;

public class Hidroavion implements Anfibio{
	private int pasajeros;
	private boolean enViaje;
	private boolean enBarco;
	
	
	public int getPasajeros() {
		return pasajeros;
	}
	public void setPasajeros(int pasajeros) {
		this.pasajeros = pasajeros;
	}

	public boolean isEnViaje() {
		return enViaje;
	}
	public void setEnViaje(boolean enViaje) {
		enViaje = false;
		this.enViaje = enViaje;
	}

	public boolean isEnBarco() {
		return enBarco;
	}
	public void setEnBarco(boolean enBarco) {
		enBarco = true;
		this.enBarco = enBarco;
	}
	
	
	public Hidroavion(int pasajeros, boolean enViaje, boolean enBarco) {
		this.pasajeros = 0;
		this.enViaje = false;
		this.enBarco = true;
	}
	
	
	@Override public void despegar() {
		if (enViaje == true) {
			System.out.println("El hidroavion está despegando");
			enViaje = true;
		}
	}

	@Override public double volar() {
		if (enViaje == true) {
			System.out.println("Está volando");
		}
		return 0;
	}

	@Override public void aterrizar() {
		if (enViaje == true) {
			System.out.println("El avión está aterrizando");
			enViaje = false;
		}
	}

	@Override public void zarpar() {
		if (enBarco == true) {
			System.out.println("El hidroavión está zarpando");
			enViaje = true;
		}
	}

	@Override public boolean navegar(boolean tiempo) {
		if (enBarco == true) {
			System.out.println("Está navegando");
		}
		return false;
	}

	@Override public void anclar() {
		if (enBarco == true) {
			System.out.println("El hidroavión está en tierra");
			enViaje = false;
		}
	}

	
	@Override public void transformar() {
		if (enBarco == true) {
			System.out.println("Me transformo en barco");
		} else {
			System.out.println("Me transformo en avion");
		}
		
	}
	
	public int anadirPasajero() {
		if (enViaje == false) {
			return pasajeros++;
		}
		else {
			return pasajeros;
		}
	}
	

}
