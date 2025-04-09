package gutierrezLopez_inigo_alimentaria;

public class P_frescos extends Productos{
	private String fecha_envasado;
	private String pais_origen;
	
	
	public String getFecha_envasado() {
		return fecha_envasado;
	}
	public void setFecha_envasado(String fecha_envasado) {
		this.fecha_envasado = fecha_envasado;
	}
	public String getPais_origen() {
		return pais_origen;
	}
	public void setPais_origen(String pais_origen) {
		this.pais_origen = pais_origen;
	}

	
	public P_frescos(String nombre, String fecha_caducidad, int n_lote, String fecha_envasado, String pais_origen) {
		super(nombre, fecha_caducidad, n_lote);
		this.fecha_envasado = fecha_envasado;
		this.pais_origen = pais_origen;
	}
	
	@Override public String toString() {
		return "Nombre: "+getNombre()+"\nFecha caducidad "+getFecha_caducidad()+"\nNumero de lote: "+getN_lote()
		+"\nFecha de envasado: "+getFecha_envasado()+"\nPais de origen: "+getPais_origen();
	}
}
