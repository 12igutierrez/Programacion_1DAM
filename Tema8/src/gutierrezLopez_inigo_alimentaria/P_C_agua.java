package gutierrezLopez_inigo_alimentaria;

public class P_C_agua extends P_congelados{
	private double g_sal;
	private double l_agua;
	
	
	public double getG_sal() {
		return g_sal;
	}
	public void setG_sal(double g_sal) {
		this.g_sal = g_sal;
	}
	public double getL_agua() {
		return l_agua;
	}
	public void setL_agua(double l_agua) {
		this.l_agua = l_agua;
	}

	
	public P_C_agua(String nombre, String fecha_caducidad, int n_lote, String fecha_envasado, String pais_origen,
			double temperatura_recomendada, double g_sal, double l_agua) {
		super(nombre, fecha_caducidad, n_lote, fecha_envasado, pais_origen, temperatura_recomendada);
		this.g_sal = g_sal;
		this.l_agua = l_agua;
	}
	
	@Override public String toString() {
		return "Salinidad del agua: "+getG_sal() * getL_agua();
	}
	
}
