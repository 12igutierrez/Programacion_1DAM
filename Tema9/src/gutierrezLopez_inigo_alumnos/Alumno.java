package gutierrezLopez_inigo_alumnos;

import Clase3_Ejercicio1.Carta;

public class Alumno implements Comparable{
	private String nombre;
	private String apellido;
	private String fecna;
	private int edad;
	private double notaMedia;
	private int asignaturasMatriculado;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getFecna() {
		return fecna;
	}
	public void setFecna(String fecna) {
		this.fecna = fecna;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getNotaMedia() {
		return notaMedia;
	}
	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}
	public int getAsignaturasMatriculado() {
		return asignaturasMatriculado;
	}
	public void setAsignaturasMatriculado(int asignaturasMatriculado) {
		this.asignaturasMatriculado = asignaturasMatriculado;
	}
	
	
	public Alumno(String nombre, String apellido, String fecna, int edad, double notaMedia,
			int asignaturasMatriculado) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fecna = fecna;
		this.edad = edad;
		this.notaMedia = notaMedia;
		this.asignaturasMatriculado = asignaturasMatriculado;
	}
	
	
	@Override public String toString() {
		return getNombre()+" "+getApellido()+" nacido en la fecha "+getFecna()
		+" con edad "+getEdad()+", tiene una nota media de "+getNotaMedia()
		+" y actualmente está matriculado en "+getAsignaturasMatriculado()+" asignaturas";
	}
	
	
	@Override public int compareTo(Object o) {
		Alumno alumno = (Alumno) o;
		
		if(this.edad == alumno.edad) { //No se utiliza .equals porque es un tipo primitivo
			if (alumno.equals(edad)) {
				if (alumno.equals(fecna)) {
					if (alumno.equals(apellido)) {
						if (alumno.equals(nombre)) {
							return 0;
						} else if (alumno.compareTo(nombre)<0) {
							return -1;
						} else if (alumno.compareTo(nombre)>0) {
							return 1;
						}
					} else if (alumno.compareTo(apellido)<0) {
						return -1;
					} else if (alumno.compareTo(apellido)>0) {
						return 1;
					}
				} else if (alumno.compareTo(fecna)<0) {
					return -1;
				} else if (alumno.compareTo(fecna)>0) {
					return 1;
				}
			} else if (alumno.compareTo(edad)<0) {
				return -1;
			} else if (alumno.compareTo(edad)>0) {
				return 1;
			}
		} else if (edad > alumno.edad) { //No se utiliza equals (es int)
			return 1;
		} else if (edad < alumno.edad) { //Lo mismo
			return -1;
		}
		return 0;
	}
	
}
