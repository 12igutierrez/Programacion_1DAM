package gutierrezLopez_inigo_alimentaria;

public class P_refrigerados extends Productos{
	private int c_o_s_a;
	private String fecha_envasado;
	private double temperatura_recomendada;
	private String pais_origen;

	
	public int getC_o_s_a() {
		return c_o_s_a;
	}
	public void setC_o_s_a(int c_o_s_a) {
		this.c_o_s_a = c_o_s_a;
	}
	public String getFecha_envasado() {
		return fecha_envasado;
	}
	public void setFecha_envasado(String fecha_envasado) {
		this.fecha_envasado = fecha_envasado;
	}
	public double getTemperatura_recomendada() {
		return temperatura_recomendada;
	}
	public void setTemperatura_recomendada(int temperatura_recomendada) {
		this.temperatura_recomendada = temperatura_recomendada;
	}
	public String getPais_origen() {
		return pais_origen;
	}
	public void setPais_origen(String pais_origen) {
		this.pais_origen = pais_origen;
	}
	
	
	public P_refrigerados(String nombre, String fecha_caducidad, int n_lote, int c_o_s_a, String fecha_envasado,
			double temperatura_recomendada, String pais_origen) {
		super(nombre, fecha_caducidad, n_lote);
		this.c_o_s_a = c_o_s_a;
		this.fecha_envasado = fecha_envasado;
		this.temperatura_recomendada = temperatura_recomendada;
		this.pais_origen = pais_origen;
	}
	
	@Override public String toString() {
		return "Nombre: "+getNombre()+"\nFecha caducidad "+getFecha_caducidad()+"\nNumero de lote: "+getN_lote()
		+"\nCodigo organismo supervision alimentaria: "+getC_o_s_a()+"\nFecha de envasado: "+getFecha_envasado()+
		"\nTemperatura recomendada: "+getTemperatura_recomendada()+"\nPais de origen: "+getPais_origen();
	}
	
}
