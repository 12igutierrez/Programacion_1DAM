package gutierrezLopez_inigo_transportes;

public class Avion implements Volador{
	private double gasolina;
	
	
	public double getGasolina() {
		return gasolina;
	}
	public void setGasolina(int gasolina) {
		this.gasolina = gasolina;
	}
	
	
	public Avion(double gasolina) {
		this.gasolina = 10;
	}
	

	@Override public void despegar() {
		System.out.println("El avion está despegando");
		
	}

	@Override public double volar() {
        if (gasolina > 0) {
            gasolina--; 
        } else {
            System.out.println("No hay suficiente gasolina para volar.");
        }
        return gasolina;
    }

	@Override public void aterrizar() {
		System.out.println("El avion está aterrizando");
		
	}
	
	public double recargarGasolina(double valor) {
		return gasolina += valor;
	}

}
