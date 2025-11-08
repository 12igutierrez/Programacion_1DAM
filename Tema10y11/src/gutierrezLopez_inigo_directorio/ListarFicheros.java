package gutierrezLopez_inigo_directorio;

import java.io.File;
import java.util.Scanner;

public class ListarFicheros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la ruta de una carpeta: ");
        String ruta = sc.nextLine();

        File carpeta = new File(ruta);

        if (!carpeta.exists() || !carpeta.isDirectory()) {
            System.out.println("La ruta no es válida o no es una carpeta.");
            return;
        }

        File[] archivos = carpeta.listFiles();
        if (archivos == null || archivos.length == 0) {
            System.out.println("La carpeta está vacía.");
            return;
        }

        System.out.println("Contenido de la carpeta:");
        for (int i = 0; i < archivos.length; i++) {
            System.out.println((i + 1) + ". " + archivos[i].getName());
        }

        System.out.print("Elige el número del documento del que quieres ver la información: ");
        int eleccion = sc.nextInt();
        sc.nextLine();

        if (eleccion < 1 || eleccion > archivos.length) {
            System.out.println("Selección no válida.");
            return;
        }

        File seleccionado = archivos[eleccion - 1];

        System.out.println("\nInformación del fichero:");
        System.out.println("Nombre: " + seleccionado.getName());
        System.out.println("Ruta: " + seleccionado.getAbsolutePath());
        System.out.println("¿Es un directorio?: " + seleccionado.isDirectory());
        System.out.println("¿Es un fichero?: " + seleccionado.isFile());
        System.out.println("¿Es editable?: " + seleccionado.canWrite());
        System.out.println("¿Es legible?: " + seleccionado.canRead());
        System.out.println("¿Existe?: " + seleccionado.exists());
    }
}
