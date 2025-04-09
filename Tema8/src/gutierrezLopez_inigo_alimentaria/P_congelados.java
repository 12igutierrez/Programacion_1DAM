package gutierrezLopez_inigo_alimentaria;

public class P_congelados extends Productos{
	private String fecha_envasado;
	private String pais_origen;
	private double temperatura_recomendada;

	
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
	public double getTemperatura_recomendada() {
		return temperatura_recomendada;
	}
	public void setTemperatura_recomendada(int temperatura_recomendada) {
		this.temperatura_recomendada = temperatura_recomendada;
	}
	
	
	public P_congelados(String nombre, String fecha_caducidad, int n_lote, String fecha_envasado, String pais_origen,
			double temperatura_recomendada) {
		super(nombre, fecha_caducidad, n_lote);
		this.fecha_envasado = fecha_envasado;
		this.pais_origen = pais_origen;
		this.temperatura_recomendada = temperatura_recomendada;
	}
	
	@Override public String toString() {
		return "Nombre: "+getNombre()+"\nFecha caducidad "+getFecha_caducidad()+"\nNumero de lote: "+getN_lote()
		+"\nFecha de envasado: "+getFecha_envasado()+"\nPais de origen: "+getPais_origen()+
		"\nTemperatura recomendada: "+getTemperatura_recomendada();
	}
	
}
