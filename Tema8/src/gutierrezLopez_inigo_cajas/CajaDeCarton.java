package gutierrezLopez_inigo_cajas;

public class CajaDeCarton extends Caja{

	public CajaDeCarton(String nombre, String direccion, String direccion_rem, String empresa, double peso,
			String descripcion, double largo, double alto, double ancho, double peso2) {
		super(nombre, direccion, direccion_rem, empresa, peso, descripcion, largo, alto, ancho, peso2);
	}
	
	public double cantidadCarton() {
		return ((2 * getLargo()) + (2 * getAncho())) + ((2 * getLargo()) 
				+ (2 * getAlto())) + (((2 * getAlto()) + (2 * getAncho())));
	}
	
	@Override public double volumenCaja() {
		return (getLargo() * getAlto() * getAncho()) * 0.7;
	}

}
