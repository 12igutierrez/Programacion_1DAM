package gutierrezLopez_inigo_alimentaria;

public class P_C_nitrogeno extends P_congelados{
	private String metodo_congelacion;
	private int tiempo_exposicion; //En segundos
	
	
	public String getMetodo_congelacion() {
		return metodo_congelacion;
	}
	public void setMetodo_congelacion(String metodo_congelacion) {
		this.metodo_congelacion = metodo_congelacion;
	}

	public int getTiempo_exposicion() {
		return tiempo_exposicion;
	}
	public void setTiempo_exposicion(int tiempo_exposicion) {
		this.tiempo_exposicion = tiempo_exposicion;
	}
	
	
	public P_C_nitrogeno(String nombre, String fecha_caducidad, int n_lote, String fecha_envasado, String pais_origen,
			double temperatura_recomendada, String metodo_congelacion, int tiempo_exposicion) {
		super(nombre, fecha_caducidad, n_lote, fecha_envasado, pais_origen, temperatura_recomendada);
		this.metodo_congelacion = metodo_congelacion;
		this.tiempo_exposicion = tiempo_exposicion;
	}
	
	
	@Override public String toString() {
		return "Metodo de congelacion: "+getMetodo_congelacion()+"\nTiempo de exposicion al nitrogeno: "+getTiempo_exposicion();
	}

}
