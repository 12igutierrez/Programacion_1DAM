package gutierrezLopez_inigo_llamadas;

import java.util.Comparator;

public class ComparadorLlamadas implements Comparator{

	@Override public int compare(Object o1, Object o2) {
    	Llamada l1 = (Llamada)o1;
    	Llamada l2 = (Llamada)o2;
    	
    	if (l1.calcularCoste() == l2.calcularCoste()) {
    		return 0;
    	} else if (l1.calcularCoste() < l2.calcularCoste()) {
    		return 1;
    	} else {
    		return -1;
    	}
    }

}
