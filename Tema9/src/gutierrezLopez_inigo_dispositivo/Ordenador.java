package gutierrezLopez_inigo_dispositivo;

import java.util.Random;

public class Ordenador implements Dispositivo, Electronico{
	Random r = new Random();
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
	
	
	public Ordenador(int bateria, boolean ahorroEnergia, boolean estado) {
		this.bateria = bateria;
		this.ahorroEnergia = ahorroEnergia;
		this.estado = estado;
	}
	
	
	@Override public void cargarBateria() {
		int numeroR = r.nextInt(51) + 50;
		System.out.println("EMPEZANDO A CARGAR: ");
		
		for (int i = 0; i < numeroR && bateria < 100; i++) {
			bateria++;
			System.out.println("Bateria: "+getBateria()+"%");
		}
		
		if (bateria > 100) {
			bateria = 100;
		}
		System.out.println("Bateria cargada hasta el "+getBateria()+"%");
	}
	
	@Override public void reiniciar() {
		estado = false;
		System.out.println("Empezando a reiniciar. Estado: "+isEstado());
		ahorroEnergia = false;
		estado = true;
		System.out.println("Reinicio terminado. Estado: "+isEstado()+"\nAhorro de bateria: "+isAhorroEnergia());
	}
	
	@Override public int verificarBateria() {
		return bateria;
	}
	
	@Override public void modoAhorroEnergia() {
		if (isAhorroEnergia() == true) {
			ahorroEnergia = false;
			System.out.println("Ahorro bateria: "+isAhorroEnergia());
		} else {
			ahorroEnergia = true;
			System.out.println("Ahorro bateria: "+isAhorroEnergia());
		}
	}
	
	@Override public void encender() {
		estado = true;
	}
	
	@Override public void apagar() {
		estado = false;
	}
	
	@Override public String mostrarInformacion() {
		return "Ordenador [bateria=" + bateria + "%, ahorroEnergia=" + ahorroEnergia + ", estado=" + estado + "]";
	}
	
	public void utilizar(int pestanias) {
		if (isAhorroEnergia() == true) {
			bateria -= pestanias;
		} else {
			bateria -= (pestanias * 2);
		}
	}
	

}
