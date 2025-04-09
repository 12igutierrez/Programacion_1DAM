package Clase2_Ejercicio1;

public class HoraExacta extends Hora {
	private int segundos;

	public int getSegundos() {
		return segundos;
	}
	public void setSegundos(int segundos) {
		if (segundos >= 0 && segundos < 59) {
			this.segundos = segundos;
		}
	}

	public HoraExacta(int hora, int minutos, int segundos) {
		super(hora, minutos);
		if (segundos >= 0 && segundos < 59) {
			this.segundos = segundos;
		} else {
			this.segundos = 0;
		}
	}
	
	@Override public void inc() {
		if (segundos >= 0 && segundos < 59) {
			segundos++;
		} else {
			segundos = 0;
			super.inc();
		}
	}
	
	@Override public String toString() {
		return((getHora() <= 9) ? "0" : "") +getHora()+":"+
			  ((getMinutos() <= 9) ? "0" : "" +getMinutos())+":"+
			  ((segundos <= 9) ? "0" : "") +segundos;
	}
	
	
	@Override public boolean equals(Object otro) {
		HoraExacta h = (HoraExacta) otro;
		if (getHora() == h.getHora() && getMinutos() == h.getMinutos() &&
			segundos == h.segundos) {
			return true;
		} else {
			return false;
		}
	}
	
	public HoraExacta clone() {
		HoraExacta he = new HoraExacta(getHora(),getMinutos(),segundos);
		return he;
	}
	
	
	
	
	
}
