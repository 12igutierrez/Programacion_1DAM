package gutierrezLopez_inigo_informatica;

public class Programadores extends Empleados{
	private int lineasCodigoHora;
	private String lenguaje;
	
	public int getLineasCodigoHora() {
		return lineasCodigoHora;
	}
	public void setLineasCodigoHora(int lineasCodigoHora) {
		this.lineasCodigoHora = lineasCodigoHora;
	}
	public String getLenguaje() {
		return lenguaje;
	}
	public void setLenguaje(String lenguaje) {
		this.lenguaje = lenguaje;
	}
	
	
	public Programadores(String nombre, String apellidos, String domicilio, int edad, double salario_base,
			Casado casado, Clasificacion clasificacion, int lineasCodigoHora, String lenguaje) {
		super(nombre, apellidos, domicilio, edad, salario_base, casado, clasificacion);
		this.lineasCodigoHora = lineasCodigoHora;
		this.lenguaje = lenguaje;
	}
	
	
	@Override public double salarioFinal() {
	    double salarioBaseConBeneficios = super.salarioFinal();
	    if (lineasCodigoHora < 3000) {
	        return salarioBaseConBeneficios + 100;
	    } else if (lineasCodigoHora <= 6000) {
	        return salarioBaseConBeneficios + 120;
	    } else {
	        return salarioBaseConBeneficios + 150;
	    }
	}

	
	@Override public String toString() {
		return infoEmpleado();
	}
}
