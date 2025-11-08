package gutierrezLopez_inigo_asignaturas;

public class NotasAlumno {
	protected Asignatura asignatura;
	protected int nota;
	
	
	public Asignatura getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}
	
	
	public NotasAlumno(Asignatura asignatura, int nota) {
		super();
		this.asignatura = asignatura;
		this.nota = nota;
	}

}