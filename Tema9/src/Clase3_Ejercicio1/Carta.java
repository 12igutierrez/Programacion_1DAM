package Clase3_Ejercicio1;

import java.util.Comparator;
import java.util.Random;

public class Carta implements Comparable{
	
	enum Palo{Oros,Bastos,Espadas,Copas};
	private Palo palo;
	private int Numero;
	
	public Palo getPalo() {
		return palo;
	}
	public void setPalo(Palo palo) {
		this.palo = palo;
	}
	public int getNumero() {
		return Numero;
	}
	public void setNumero(int numero) {
		if (numero >= 1 && numero <= 13) {
			this.Numero = numero;
		} else { 
			System.out.println("ERROR: Numero fuera del rango (1-13)");
			this.Numero = 0;
		}
	}
	
	
	public Carta(Palo palo, int numero) {
		this.palo = palo;
		Numero = numero;
	}
	
	
	@Override public String toString() {
		return "Carta "+Numero+" del palo "+palo;
	}
	
	
	@Override public int compareTo(Object o) {
		Carta carta = (Carta)o;
		
		if(Numero == carta.Numero) {
			if (palo.equals(carta.palo)) {
				return 0;
			} else if (palo.compareTo(carta.palo)<0) {
				return -1;
			} else if (palo.compareTo(carta.palo)>0) {
				return 1;
			}
		} else if (Numero > carta.Numero) {
			return 1;
		} else if (Numero < carta.Numero) {
			return -1;
		}
		return 0;
	}
	
	
	static public Carta devolverCarta() {
		Random r = new Random();
		int n1 = r.nextInt(13) + 1;
		
		Palo [] posiblesPalos = Palo.values();
		int n2 = r.nextInt(posiblesPalos.length);
		
		return new Carta(posiblesPalos[n2],n1);
	}
	
}
