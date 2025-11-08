package gutierrezLopez_inigo_asignaturas;

public class Asignatura {
	protected int idasignatura;
	protected String nombreasig;
	
	
	public int getIdasignatura() {
		return idasignatura;
	}
	public void setIdasignatura(int idasignatura) {
		this.idasignatura = idasignatura;
	}
	public String getNombreasig() {
		return nombreasig;
	}
	public void setNombreasig(String nombreasig) {
		this.nombreasig = nombreasig;
	}
	
	
	public Asignatura(int idasignatura, String nombreasig) {
		super();
		this.idasignatura = idasignatura;
		this.nombreasig = nombreasig;
	}

}
