package gutierrezLopez_inigo_cajas;

public class Caja extends Etiqueta{
	private double largo;
	private double alto;
	private double ancho;
	private double peso;
	
	public double getLargo() {
		return largo;
	}
	public void setLargo(double largo) {
		if (largo >= 1 && largo <= 50) {
			this.largo = largo;
		} else {
			this.largo = 1;
		}
	}

	public double getAlto() {
		return alto;
	}
	public void setAlto(double alto) {
		if (alto >= 1 && alto <= 50) {
			this.alto = alto;
		} else {
			this.alto = 1;
		}
	}

	public double getAncho() {
		return ancho;
	}
	public void setAncho(double ancho) {
		if (ancho >= 1 && ancho <= 50) {
			this.ancho = ancho;
		} else {
			this.ancho = 1;
		}
	}

	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		if (peso >= 0.1 && peso <= 10) {
			this.peso = peso;
		}
	}


	public Caja(String nombre, String direccion, String direccion_rem, String empresa, double peso, String descripcion,
			double largo, double alto, double ancho, double peso2) {
		super(nombre, direccion, direccion_rem, empresa, peso, descripcion);
		if (largo >= 1 && largo <= 50) {
			this.largo = largo;
		}
		if (alto >= 1 && alto <= 50) {
			this.alto = alto;
		}
		if (ancho >= 1 && ancho <= 50) {
			this.ancho = ancho;
		}
		if (peso >= 0.1 && peso <= 10) {
			this.peso = peso2;
		}
	}
	
	public String getEtiqueta() {
		return getNombre()+" con  direccion: "+getDireccion()+" y direccion de remitente: "+getDireccion_rem()
		+"\nde la empresa: "+getEmpresa()+" y peso "+getPeso()+"kg. "
				+ "\nDescripcion del producto: "+getDescripcion();
	}
	
	public double volumenCaja() {
		return largo * alto * ancho;
	}
	
	public double costeEnvio() {
		return volumenCaja() * peso;
	}
	
	public String infoCaja() {
		return "La caja a nombre de "+getEtiqueta()+"\nVolumen de la caja: "+volumenCaja()+"\nCoste de envio: "+costeEnvio()+"€";
	}
	

}
