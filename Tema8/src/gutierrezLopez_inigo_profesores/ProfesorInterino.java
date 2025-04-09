package gutierrezLopez_inigo_profesores;

public class ProfesorInterino extends Profesor{
	private Fecha fecha_findecontrato;
	private Fecha fecha_iniciodecontrato;
	
	public ProfesorInterino() {
		fecha_findecontrato = new Fecha(1,1,2000);
		fecha_iniciodecontrato = new Fecha(1,1,2000);
	}
	
	public ProfesorInterino(String nombre, String especialidad, String n_centro, int anios_cons,
			Fecha fecha_findecontrato, Fecha fecha_iniciodecontrato) {
		super(nombre, especialidad, n_centro, anios_cons);
		this.fecha_findecontrato = fecha_findecontrato;
		this.fecha_iniciodecontrato = fecha_iniciodecontrato;
	}
	
	
	public Fecha getFecha_findecontrato() {
		return fecha_findecontrato;
	}
	public void setFecha_findecontrato(Fecha fecha_findecontrato) {
		this.fecha_findecontrato = fecha_findecontrato;
	}

	public Fecha getFecha_iniciodecontrato() {
		return fecha_iniciodecontrato;
	}
	public void setFecha_iniciodecontrato(Fecha fecha_iniciodecontrato) {
		this.fecha_iniciodecontrato = fecha_iniciodecontrato;
	}

	@Override public double obtenerSalarioBase() {
	    double salarioBase = 725;
	    int mesesTrabajados = 0;

	    if (fecha_findecontrato.getAnio() == fecha_iniciodecontrato.getAnio()) {
	        mesesTrabajados = fecha_findecontrato.getMes() - fecha_iniciodecontrato.getMes();
	    } else if (fecha_findecontrato.getAnio() > fecha_iniciodecontrato.getAnio()) {
	        mesesTrabajados = (12 - fecha_iniciodecontrato.getMes()) + 
	                          ((fecha_findecontrato.getAnio() - fecha_iniciodecontrato.getAnio() - 1) * 12) +
	                          fecha_findecontrato.getMes();
	    }

	    if (mesesTrabajados > 0) {
	        salarioBase += (mesesTrabajados * 33.25);
	    }

	    return salarioBase;
	}

	
	@Override public String toString() {
		return "El profesor "+ getNombre()+" con fecha de inicio "+fecha_iniciodecontrato+ " y fecha de fin de contrato "+ fecha_findecontrato
				+"\n en el centro "+getN_centro()+ " con especialidad "+getEspecialidad()+" y salario "+obtenerSalarioBase()+"€";
	}
	
}
