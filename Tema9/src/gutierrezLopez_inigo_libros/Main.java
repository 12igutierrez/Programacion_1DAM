package gutierrezLopez_inigo_libros;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Libro[] libros = new Libro[6];
        libros[0] = new LibroFisico("Libro fisico 1", 417, new String[]{}, 50, new double[]{15.2, 20.2, 3.1}, 0.5);
        libros[1] = new LibroFisico("Libro fisico 2", 863, new String[]{}, 120, new double[]{18.0, 24.0, 4.0}, 0.8);
        libros[2] = new LibroFisico("Libro fisico 3", 96, new String[]{}, 30, new double[]{12.0, 18.0, 2.0}, 0.3);
        libros[3] = new Ebook("Libro Ebook 1", 328, 1.5, 42.3, Formato.PDF);
        libros[4] = new Ebook("Libro Ebook 2", 288, 2.0, 61.7, Formato.EPUB);
        libros[5] = new Ebook("Libro Ebook 3", 249, 1.2, 13.4, Formato.MOBI);
        
        int opcion = 0;
        while (opcion != 3) {
            System.out.println("=========== MENU ===========");
            System.out.println("1. Ver información de un libro");
            System.out.println("2. Modificar un libro");
            System.out.println("3. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();
            
            if (opcion == 3) {
            	System.out.println("Saliendo...");
                break;
            }
            System.out.print("\nSeleccione un libro (0-5):");
            for (int i = 0; i < libros.length; i++) {
            }
            int seleccion = sc.nextInt();
            sc.nextLine();
            
            if (seleccion < 0 || seleccion >= libros.length) {
                System.out.println("Selección inválida.");
                continue;
            }
            
            if (opcion == 1) {
                libros[seleccion].getInformacion();
                System.out.println();
            } else if (opcion == 2) {
                if (libros[seleccion] instanceof LibroFisico) {
                    System.out.print("Ingrese nueva página del marcapáginas:");
                    int nuevaPagina = sc.nextInt();
                    sc.nextLine();
                    ((LibroFisico) libros[seleccion]).setMarcapaginas(nuevaPagina);
                    System.out.println("\nPágina del marcapáginas actualizada.");
                } else if (libros[seleccion] instanceof Ebook) {
                    System.out.println("Ingrese nuevo porcentaje leído:");
                    double nuevoPorcentaje = sc.nextDouble();
                    sc.nextLine();
                    ((Ebook) libros[seleccion]).setPorcentajeLeido((int) nuevoPorcentaje);
                    System.out.println("Porcentaje de lectura actualizado.");
                }
            }
        }
        sc.close();
    }
}
