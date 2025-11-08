package gutierrezLopez_inigo_asignaturas;

import java.util.ArrayList;

public class Alumno {
	protected int idalumno;
	protected String nombre;
	protected ArrayList<NotasAlumno> notas;
	
	
	public int getIdalumno() {
		return idalumno;
	}
	public void setIdalumno(int idalumno) {
		this.idalumno = idalumno;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<NotasAlumno> getNotas() {
		return notas;
	}
	public void setNotas(ArrayList<NotasAlumno> notas) {
		this.notas = notas;
	}
	
	
	public Alumno(int idalumno, String nombre, ArrayList<NotasAlumno> notas) {
		super();
		this.idalumno = idalumno;
		this.nombre = nombre;
		this.notas = notas;
	}
	
	
	public int notaAsignatura(int as) {
		for (NotasAlumno nota : notas) {
			if (nota.getAsignatura().getIdasignatura() == as) {
				return nota.getNota();
			}
		}
		return -1;
	}
	
	public void insertarNota(NotasAlumno n) {
		notas.add(n);
	}
	
	public double notaMedia() {
		if (notas.isEmpty()) {
			return 0.0;
		}
		int suma = 0;
		for (NotasAlumno nota : notas) {
			suma += nota.getNota();
		}
		return (double) suma / notas.size();
	}
	
	public String asignaturaMasNota() {
		if (notas.isEmpty()) {
			return "";
		}
		
		NotasAlumno max = notas.get(0);
		for (NotasAlumno n : notas) {
			if (n.getNota() > max.getNota()) {
				max = n;
			}
		}
		return max.getAsignatura().getNombreasig();
	}
	
	public String asignaturaMenosNota() {
		if (notas.isEmpty()) {
			return "";
		}
		NotasAlumno min = notas.get(0);
		for (NotasAlumno n : notas) {
			if (n.getNota() < min.getNota()) {
				min = n;
			}
		}
		return min.getAsignatura().getNombreasig();
	}
	
	public int numeroSuspensos() {
		int c = 0;
		for (NotasAlumno n : notas) {
			if (n.getNota() < 5) {
				c++;
			}
		}
		return c;
	}
	
	public int numeroAprobados() {
		int c = 0;
		for (NotasAlumno n : notas) {
			if (n.getNota() > 5) {
				c++;
			}
		}
		return c;
	}
	
	@Override public String toString() {
		String resultado = "id:"+getIdalumno()+" / Nombre: "+getNombre()+"\n";
		for (NotasAlumno n : notas) {
			resultado += n.getAsignatura().getNombreasig() + ", Nota: "+n.getNota()+"\n";
		}
		return resultado + "\n";
	}
	
}
