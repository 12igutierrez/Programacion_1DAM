package gutierrezLopez_inigo_informatica;

import java.util.Scanner;
public class Empleados {
	static Scanner sc = new Scanner (System.in);
	public enum Casado {SI_CASADO, NO_CASADO};
	public enum Clasificacion {JUNIOR, MID, SENIOR};
	
	private String nombre;
	private String apellidos;
	private String domicilio;
	private int edad;
	private double salario_base;
	private Casado casado;
	private Clasificacion clasificacion;
	
	
	public Casado getCasado() {
		return casado;
	}
	public void setCasado(Casado casado) {
		this.casado = casado;
	}
	public Clasificacion getClasificacion() {
		return clasificacion;
	}
	public void setClasificacion(Clasificacion clasificacion) {
		this.clasificacion = clasificacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getSalario_base() {
		return salario_base;
	}
	public void setSalario_base(double salario_base) {
		this.salario_base = salario_base;
	}
	
	
	public Empleados(String nombre, String apellidos, String domicilio, int edad, double salario_base, Casado casado,
			Clasificacion clasificacion) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.domicilio = domicilio;
		this.edad = edad;
		this.salario_base = salario_base;
		this.casado = casado;
		this.clasificacion = clasificacion;
	}
	
	
	public Clasificacion establecerClasificacion() {
		if (edad <= 25) {
			return Clasificacion.JUNIOR;
		} else if (edad >= 26 && edad <= 35) {
			return Clasificacion.MID;
		} else {
			return Clasificacion.SENIOR;
		}
	}
	
	public String infoEmpleado() {
		return getNombre()+" "+getApellidos()+"\nDomicilio: "+getDomicilio()+"\nEdad: "+getEdad()+"\nSalario base: "+getSalario_base()
		+"\n¿Casado?: "+getCasado()+"\nClasificacion: "+getClasificacion();
	}
	
	public double modificarSalario() {
		System.out.println("¿Que modificacion quieres hacer al salario? (Responde con A o D): ");
		System.out.println("(A -> Aumentar D -> Disminuir)");
		String respuesta = sc.nextLine().toUpperCase();
		if (respuesta.equals("A")) {
			System.out.println("¿Que porcentaje quieres aumentar el salario?: ");
			double porcentaje = sc.nextDouble();
			sc.nextLine();
			salario_base += (porcentaje / 100) * salario_base;
			return salario_base;
		} else if (respuesta.equals("D")) {
			System.out.println("¿Que porcentaje quieres disminuir el salario?: ");
			double porcentaje = sc.nextDouble();
			sc.nextLine();
			double descuento = (porcentaje / 100) * salario_base;
			salario_base -= descuento;
			return salario_base;
		} else {
			return 0;
		}
	}
	
	public double salarioFinal() {
		if (getClasificacion() == clasificacion.JUNIOR) {
			return salario_base + 150;
		} else if (getClasificacion() == clasificacion.MID) {
			return salario_base + 300;
		} else if (getClasificacion() == clasificacion.SENIOR) {
			return salario_base + 600;
		} else {
			return 0;
		}
	
	}
	
	@Override public String toString() {
		return infoEmpleado();
	}

}
