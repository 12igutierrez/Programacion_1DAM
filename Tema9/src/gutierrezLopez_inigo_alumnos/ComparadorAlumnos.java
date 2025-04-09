package gutierrezLopez_inigo_alumnos;

import java.util.Comparator;

public class ComparadorAlumnos implements Comparator{
    @Override public int compare(Object o1, Object o2) {
    	Alumno a1 = (Alumno)o1;
    	Alumno a2 = (Alumno)o2;
    	
    	if (a1.getEdad() == a2.getEdad()) {
    		return 0;
    	} else if (a1.getEdad() < a2.getEdad()) {
    		return 1;
    	} else {
    		return -1;
    	}
    }
}
