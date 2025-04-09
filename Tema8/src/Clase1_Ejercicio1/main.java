package Clase1_Ejercicio1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mueble[] muebles = new Mueble[5];
        
        boolean entradavalida=false;
		int dato=0;
		
		do{
            try {
            	for (int i = 0; i < 5; i++) {
                    System.out.print("\n========= MENÚ DE CREACIÓN =========\n"
                            + "¿Qué tipo de mueble quieres crear?\n"
                            + "1. Mueble sencillo\n2. Sofá\n3. Silla\n"
                            + "Opción " + (i + 1) + "/5: ");
                    int opcion = sc.nextInt();
                    sc.nextLine();
                    
                    if (opcion >= 1 && opcion <= 3) {
                    	// Datos comunes
                        System.out.print("Introduce el nombre del mueble: ");
                        String nombre = sc.nextLine();
                        System.out.print("Introduce la cantidad disponible: ");
                        int cantidad = sc.nextInt();
                        System.out.print("Introduce el precio del mueble: ");
                        double precio = sc.nextDouble();
                        System.out.print("Introduce el estado del mueble (0 para sin_stock, 1 para con_stock): ");
                        int stockInput = sc.nextInt();
                        Mueble.Stock stock = (stockInput == 1) ? Mueble.Stock.con_stock : Mueble.Stock.sin_stock;

                        // Crear el mueble según la opción elegida
                        switch (opcion) {
                            case 1:
                                muebles[i] = new Mueble(i + 1, nombre, cantidad, precio, stock);
                                break;
                            case 2:
                                System.out.print("Introduce el número de plazas del sofá: ");
                                int plazas = sc.nextInt();
                                muebles[i] = new Sofa(i + 1, nombre, cantidad, precio, stock, plazas);
                                break;
                            case 3:
                                System.out.print("¿Es un conjunto de sillas? (true/false): ");
                                boolean esConjunto = sc.nextBoolean();
                                
                                System.out.print("Si es conjunto, ¿cuántas sillas tiene? ");
                                int cantConjunto = sc.nextInt();
                                
                                muebles[i] = new Silla(i + 1, nombre, cantidad, precio, stock, esConjunto, cantConjunto);
                                break;
                            default:
                                System.out.println("Opción no válida, creando Mueble sencillo por defecto.");
                                muebles[i] = new Mueble(i + 1, nombre, cantidad, precio, stock);
                        }
                    }else {
                    	System.out.println("El numero introducido no es valido. (1-3)");
                    }
                    
                }
                
                }catch (java.util.InputMismatchException ex) {
                	System.out.println("Error: Entrada no válida. Por favor, ingrese un número.");
                	sc.nextLine();
            }
        }while (entradavalida!=true);

        

        // ======= MENÚ SECUNDARIO =======
        int opcion;
        do {
            System.out.print("\n========= MENÚ PRINCIPAL =========\n"
                    + "1. Listar muebles\n"
                    + "2. Comprar silla\n"
                    + "3. Comprar sofá\n"
                    + "4. Salir\n"
                    + "Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("\nLista de Muebles:");
                    for (Mueble mueble : muebles) {
                        System.out.println(mueble.mostrarInfo());
                    }
                    break;
                case 2:
                    System.out.print("Introduce el nombre de la silla que deseas comprar: ");
                    String nombreSilla = sc.nextLine();
                    System.out.print("Introduce la cantidad a comprar: ");
                    int cantidadSilla = sc.nextInt();
                    comprarMueble(muebles, nombreSilla, cantidadSilla, "Silla");
                    break;
                case 3:
                    System.out.print("Introduce el nombre del sofá que deseas comprar: ");
                    String nombreSofa = sc.nextLine();
                    System.out.print("Introduce la cantidad a comprar: ");
                    int cantidadSofa = sc.nextInt();
                    comprarMueble(muebles, nombreSofa, cantidadSofa, "Sofá");
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 4);
    }

    // MÉTODO PARA COMPRAR SILLAS Y SOFÁS
    public static void comprarMueble(Mueble[] muebles, String nombre, int cantidad, String tipo) {
        for (Mueble mueble : muebles) {
            if (mueble instanceof Silla && tipo.equals("Silla") && mueble.getNombre().equalsIgnoreCase(nombre)) {
                if (mueble.getCantidad_disponible() >= cantidad) {
                    mueble.setCantidad_disponible(mueble.getCantidad_disponible() - cantidad);
                    System.out.println("Compra realizada. Quedan " + mueble.getCantidad_disponible() + " sillas de " + nombre + " en stock.");
                } else {
                    System.out.println("No hay suficiente stock disponible.");
                }
                return;
            } else if (mueble instanceof Sofa && tipo.equals("Sofá") && mueble.getNombre().equalsIgnoreCase(nombre)) {
                if (mueble.getCantidad_disponible() >= cantidad) {
                    mueble.setCantidad_disponible(mueble.getCantidad_disponible() - cantidad);
                    System.out.println("Compra realizada. Quedan " + mueble.getCantidad_disponible() + " sofás de " + nombre + " en stock.");
                } else {
                    System.out.println("No hay suficiente stock disponible.");
                }
                return;
            }
        }
        System.out.println("No se encontró un " + tipo + " con ese nombre.");
    }
}
