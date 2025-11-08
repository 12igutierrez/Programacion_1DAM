package gutierrezLopez_inigo_historial_navegacion;

import java.util.*;

public class HistorialNavegacion {
    private static ArrayList<String> historial = new ArrayList<>();
    private static int posicionActual = -1; //Porque no se ha visitado ninguna pagina
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = Integer.parseInt(sc.nextLine());
            switch (opcion) {
                case 1 -> visitarNuevaPagina();
                case 2 -> retroceder();
                case 3 -> avanzar();
                case 4 -> mostrarHistorial();
                case 5 -> mostrarPaginaActual();
                case 6 -> eliminarURL();
                case 7 -> buscarURL();
                case 8 -> limpiarHistorial();
                case 0 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }

    private static void mostrarMenu() {
        System.out.println("\n--- Menú ---");
        System.out.println("1. Visitar nueva página");
        System.out.println("2. Retroceder");
        System.out.println("3. Avanzar");
        System.out.println("4. Mostrar historial");
        System.out.println("5. Mostrar página actual");
        System.out.println("6. Eliminar una URL del historial");
        System.out.println("7. Buscar una URL en el historial");
        System.out.println("8. Limpiar historial");
        System.out.println("0. Salir");
        System.out.print("Selecciona una opción: ");
    }

    private static void visitarNuevaPagina() {
        System.out.print("Introduce la URL (Ejemplo: www.hola.com/.es): ");
        String url = sc.nextLine();
        if ((url.startsWith("www.") && (url.endsWith(".com") || url.endsWith(".es")))) {
            historial.add(url);
            posicionActual++;
            System.out.println("Página visitada: " + url);
        } else {
            System.out.println("URL inválida.");
        }
    }

    private static void retroceder() {
        if (posicionActual > 0) {
            posicionActual--;
            System.out.println("Has retrocedido a: " + historial.get(posicionActual));
        } else {
            System.out.println("No puedes retroceder más.");
        }
    }

    private static void avanzar() {
        if (posicionActual < historial.size() - 1) {
            posicionActual++;
            System.out.println("Has avanzado a: " + historial.get(posicionActual));
        } else {
            System.out.println("No puedes avanzar más.");
        }
    }

    private static void mostrarHistorial() {
        if (historial.isEmpty()) {
            System.out.println("Historial vacío.");
        } else {
            System.out.println("--- Historial de Navegación ---");
            for (String url : historial) {
                System.out.println(url);
            }
        }
    }

    private static void mostrarPaginaActual() {
        if (posicionActual >= 0) {
            System.out.println("Página actual: " + historial.get(posicionActual));
        } else {
            System.out.println("No estás en ninguna página.");
        }
    }

    private static void eliminarURL() {
        System.out.print("Introduce la URL que quieres eliminar: ");
        String url = sc.nextLine();
        int i = historial.indexOf(url);
        if (i != -1) {
            historial.remove(i);
            if (i <= posicionActual) {
                posicionActual--;
            }
            System.out.println("URL eliminada.");
        } else {
            System.out.println("La URL no existe en el historial.");
        }
    }

    private static void buscarURL() {
        System.out.print("Introduce la URL que quieres buscar: ");
        String url = sc.nextLine();
        if (historial.contains(url)) {
            System.out.println("La URL si ha sido visitada.");
        } else {
            System.out.println("La URL no ha sido visitada.");
        }
    }

    private static void limpiarHistorial() {
        historial.clear();
        posicionActual = -1;
        System.out.println("Historial borrado.");
    }
}
