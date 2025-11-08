package gutierrezLopez_inigo_agenda;

import java.util.*;

public class Agenda {

    protected static TreeMap<String, Set<String>> contactos = new TreeMap<>();
     static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1 -> anadirContacto();
                case 2 -> buscarTelefonos();
                case 3 -> mostrarContactos();
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }

    private static void mostrarMenu() {
        System.out.println("\n--- Menú de Agenda ---");
        System.out.println("1. Añadir contacto");
        System.out.println("2. Buscar teléfonos de un contacto");
        System.out.println("3. Mostrar todos los contactos");
        System.out.println("0. Salir");
        System.out.print("Elige una opción: ");
    }

    private static void anadirContacto() {
        System.out.print("Introduce el nombre del contacto: ");
        String nombre = sc.nextLine().trim();

        System.out.print("Introduce los teléfonos separados por comas: ");
        String[] telefonos = sc.nextLine().split(",");

        Set<String> listaTelefonos = contactos.getOrDefault(nombre, new HashSet<>());

        for (String t : telefonos) {
            listaTelefonos.add(t.trim());
        }

        contactos.put(nombre, listaTelefonos);
        System.out.println("Contacto añadido/actualizado correctamente.");
    }

    private static void buscarTelefonos() {
        System.out.print("Introduce el nombre del contacto: ");
        String nombre = sc.nextLine().trim();

        Set<String> telefonos = contactos.get(nombre);

        if (telefonos == null) {
            System.out.println("Contacto no encontrado.");
        } else {
            System.out.println("Teléfonos de " + nombre + ": " + telefonos);
        }
    }

    private static void mostrarContactos() {
        if (contactos.isEmpty()) {
            System.out.println("No hay contactos guardados.");
        } else {
            System.out.println("\n--- Lista de contactos ---");
            for (Map.Entry<String, Set<String>> entrada : contactos.entrySet()) {
                System.out.println(entrada.getKey() + ": " + entrada.getValue());
            }
        }
    }
}
