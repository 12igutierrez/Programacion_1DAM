package gutierrezLopez_inigo_dispositivo;

import java.util.Random;

public class Telefono implements Dispositivo, Electronico{
	private Random r = new Random();
	protected int bateria;
	protected boolean ahorroEnergia;
	protected boolean estado;
	
	
	public int getBateria() {
		return bateria;
	}
	public void setBateria(int bateria) {
		this.bateria = bateria;
	}
	public boolean isAhorroEnergia() {
		return ahorroEnergia;
	}
	public void setAhorroEnergia(boolean ahorroEnergia) {
		this.ahorroEnergia = ahorroEnergia;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	
	public Telefono(int bateria, boolean ahorroEnergia, boolean estado) {
		this.bateria = bateria;
		this.ahorroEnergia = ahorroEnergia;
		this.estado = estado;
	}
	
	
	@Override public void cargarBateria() {
		int carga = r.nextInt(51);
		bateria += carga;
		if (bateria > 100) {
			bateria = 100;
		}
	}
	
	@Override public void reiniciar() {
		estado = false;
		System.out.println("Empezando a reiniciar. Estado: "+isEstado());
		ahorroEnergia = false;
		estado = true;
		System.out.println("Reinicio terminado. Estado: "+isEstado()+"\nAhorro de bateria: "+isAhorroEnergia());
		
	}
	
	@Override public int verificarBateria() {
		return getBateria();
	}
	
	@Override public void modoAhorroEnergia() {
		if (bateria < 20) {
			ahorroEnergia = true;
		}
	}
	
	@Override public void encender() {
		estado = true;
		
	}
	@Override public void apagar() {
		estado = false;
		
	}
	@Override public String mostrarInformacion() {
		return "Telefono [bateria=" + bateria + "%, ahorroEnergia=" + ahorroEnergia + ", estado=" + estado+"]";
	}
	
	public void utilizar(String cadena) {
		if (cadena.equalsIgnoreCase("Whatsapp")){
			bateria -= 5;
		} else if (cadena.equalsIgnoreCase("Instagram")) {
			bateria -= 10;
		} else if (cadena.equalsIgnoreCase("Titktok")) {
			bateria -= 20;
		} else {
			bateria -= 1;
		}
	}
	

}
