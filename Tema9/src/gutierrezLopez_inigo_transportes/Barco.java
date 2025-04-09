package gutierrezLopez_inigo_transportes;

public class Barco implements Navegante{
	private double gastoEnViaje;
	
	
	public double getGastoEnViaje() {
		return gastoEnViaje;
	}
	public void setGastoEnViaje(double gastoEnViaje) {
		this.gastoEnViaje = gastoEnViaje;
	}
	
	
	public Barco(double gastoEnViaje) {
		this.gastoEnViaje = 0;
	}
	
	
	@Override public void zarpar() {
		System.out.println("Comenzamos el viaje con "+gastoEnViaje+" gasto de combustible");
		
	}

	@Override public boolean navegar(boolean tiempo) {
		if (tiempo) {
			gastoEnViaje++;
		} else {
			gastoEnViaje += 2;
		}
		return false;
	}

	@Override public void anclar() {
		System.out.println("Hemos llegado, hemos gastado "+gastoEnViaje+" combustible");
		
	}
	
	public double ReiniciaCombustible() {
		return gastoEnViaje = 0;
	}
}
