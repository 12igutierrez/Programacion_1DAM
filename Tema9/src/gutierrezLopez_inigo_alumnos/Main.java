package gutierrezLopez_inigo_alumnos;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ComparadorAlumnos ca = new ComparadorAlumnos(); 
        
        Alumno[] alumnos = {
            new Alumno("Juan", "Perez", "2000-05-15", 24, 8.5, 5),
            new Alumno("Maria", "Lopez", "1999-08-21", 25, 7.8, 4),
            new Alumno("Carlos", "Fernandez", "2001-03-10", 23, 9.2, 6),
            new Alumno("Ana", "Gomez", "1998-12-05", 26, 6.9, 3),
            new Alumno("David", "Martinez", "2002-07-30", 22, 8.0, 5)
        };
       
        
        int opcion;
        do {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Mostrar la lista de alumnos sin ordenar");
            System.out.println("2. Ordenar por edad (mayor a más joven)");
            System.out.println("3. Ordenar por fecha de nacimiento (mayor a más joven)");
            System.out.println("4. Ordenar por apellido (A-Z)");
            System.out.println("5. Ordenar por nombre (A-Z)");
            System.out.println("6. Comparar dos alumnos por índice");
            System.out.println("7. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("Lista de alumnos sin ordenar:");
                    for (Alumno a : alumnos) {
                        System.out.println(a.toString());
                    }
                    break;
                case 2:
                	Arrays.sort(alumnos, ca);
                    System.out.println("Lista de alumnos ordenada por edad:");
                    for (Alumno a : alumnos) {
                        System.out.println(a.toString());
                    }
                    break;
                case 3:
                    Arrays.sort(alumnos);
                    System.out.println("Lista de alumnos ordenada por fecha de nacimiento:");
                    for (Alumno a : alumnos) {
                        System.out.println(a.toString());
                    }
                    break;
                case 4:
                	Comparator capellido = new Comparator() {
                		@Override public int compare(Object o1, Object o2) {
                			Alumno a1 = (Alumno)o1;
                	    	Alumno a2 = (Alumno)o2;
                	    	
                	    	if (a1.getApellido().equals(a2.getApellido())) {
                	    		return 0;
                	    	} else if (a1.getApellido().compareTo(a2.getApellido()) > 0) {
                	    			return 1;
                	    	} else {
                	    		return -1;
                	    	}
                		}
                	};
                	
                    Arrays.sort(alumnos, capellido);
                    System.out.println("Lista de alumnos ordenada por apellido:");
                    for (Alumno a : alumnos) {
                        System.out.println(a.toString());
                    }
                    break;
                case 5:
                	Comparator cnombre = new Comparator() {
                		@Override public int compare(Object o1, Object o2) {
                			Alumno a1 = (Alumno)o1;
                	    	Alumno a2 = (Alumno)o2;
                	    	
                	    	if (a1.getNombre().equals(a2.getNombre())) {
                	    		return 0;
                	    	} else if (a1.getNombre().compareTo(a2.getNombre()) > 0) {
                	    			return 1;
                	    	} else {
                	    		return -1;
                	    	}
                		}
                	};
                	
                    Arrays.sort(alumnos, cnombre);
                    System.out.println("Lista de alumnos ordenada por nombre:");
                    for (Alumno a : alumnos) {
                        System.out.println(a.toString());
                    }
                    break;
                case 6:
                    System.out.print("Introduce el índice del primer alumno: ");
                    int i1 = scanner.nextInt();
                    System.out.print("Introduce el índice del segundo alumno: ");
                    int i2 = scanner.nextInt();
                    if (i1 >= 0 && i1 < alumnos.length && i2 >= 0 && i2 < alumnos.length) {
                        int comparacion = alumnos[i1].compareTo(alumnos[i2]);
                        if (comparacion == 0) {
                            System.out.println("Los alumnos son iguales.");
                        } else if (comparacion > 0) {
                            System.out.println("El alumno en el índice " + i1 + " es mayor.");
                        } else {
                            System.out.println("El alumno en el índice " + i2 + " es mayor.");
                        }
                    } else {
                        System.out.println("Índices fuera de rango.");
                    }
                    break;
                case 7:
                    System.out.print("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 7);
        
        scanner.close();
    }
}
