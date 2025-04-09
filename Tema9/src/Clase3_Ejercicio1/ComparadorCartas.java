package Clase3_Ejercicio1;

import java.util.Comparator;

	public class ComparadorCartas implements Comparator{
	    @Override public int compare(Object o1, Object o2) {
	    	Carta c1 = (Carta)o1;
	    	Carta c2 = (Carta)o2;
	    	
	    	if (c1.getNumero() == c2.getNumero()) {
	    		return 0;
	    		
	    	} else if (c1.getNumero() > c2.getNumero()) {
	    		return 1;
	    	} else {
	    		return -1;
	    	}
	    }
}
