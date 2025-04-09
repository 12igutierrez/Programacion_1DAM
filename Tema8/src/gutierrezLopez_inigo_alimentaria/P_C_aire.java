package gutierrezLopez_inigo_alimentaria;

public class P_C_aire extends P_congelados{
	private double nitrogeno;
	private double oxigeno;
	private double dc;
	private double va;
	
	public double getNitrogeno() {
		return nitrogeno;
	}
	public void setNitrogeno(double nitrogeno) {
		this.nitrogeno = nitrogeno;
	}
	public double getOxigeno() {
		return oxigeno;
	}
	public void setOxigeno(double oxigeno) {
		this.oxigeno = oxigeno;
	}
	public double getDc() {
		return dc;
	}
	public void setDc(double dc) {
		this.dc = dc;
	}
	public double getVa() {
		return va;
	}
	public void setVa(double va) {
		this.va = va;
	}
	
	
	public P_C_aire(String nombre, String fecha_caducidad, int n_lote, String fecha_envasado, String pais_origen,
			double temperatura_recomendada, double nitrogeno, double oxigeno, double dc, double va) {
		super(nombre, fecha_caducidad, n_lote, fecha_envasado, pais_origen, temperatura_recomendada);
		this.nitrogeno = nitrogeno;
		this.oxigeno = oxigeno;
		this.dc = dc;
		this.va = va;
	}
	
	@Override public String toString() {
		return "% de nitrogeno: "+getNitrogeno()+"\n% de oxigeno: "+getOxigeno()+"\n% de dioxido de carbono: "+getDc()+
				"\n% de vapor de agua: "+getVa();
	}
	
}
