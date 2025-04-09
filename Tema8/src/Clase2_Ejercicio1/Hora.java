package Clase2_Ejercicio1;

public class Hora {
	private int hora;
	private int minutos;
	
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		if (hora >= 0 && hora < 24) {
			this.hora = hora;
		}
	}

	public int getMinutos() {
		return minutos;
	}
	public void setMinutos(int minutos) {
		if (minutos >= 0 && minutos < 59) {
			this.minutos = minutos;
		}
	}
	
	
	public Hora(int hora, int minutos) {
		if (hora >= 0 && hora < 24) {
			this.hora = hora;
		} else {
			this.hora = 0;
		}
		
		if (minutos >= 0 && minutos < 59) {
			this.minutos = minutos;
		} else {
			this.minutos = 0;
		}
	}
	
	public void inc() {
		if (minutos >= 0 && minutos < 59) {
			minutos++;
		} else if (minutos > 59 & hora != 23){
			minutos = 0;
			hora++;
		} else if (minutos > 59 & hora > 23) {
			minutos = 0;
			hora = 0;
		}
	}
	
	@Override public String toString() {
		return((hora <= 9) ? "0" : "") +hora+":"+
		((minutos <= 9) ? "0" : "" +minutos);
	}
	
	
	
	
}
