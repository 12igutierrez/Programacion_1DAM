package gutierrezLopez_inigo_transportes;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int opcion;
        Barco barco = new Barco(0);
        Avion avion = new Avion(10);
        Hidroavion hidroavion = new Hidroavion(0, false, true);
        
        System.out.println("Seleccione el medio de transporte:");
        System.out.println("1. Barco");
        System.out.println("2. Avión");
        System.out.println("3. Hidroavión");
        System.out.println("4. Salir");
        opcion = sc.nextInt();
        
        while (opcion != 4) {
            switch (opcion) {
                case 1:
                    int barcoOpcion;
                    do {
                        System.out.println("1. Zarpar");
                        System.out.println("2. Navegar");
                        System.out.println("3. Anclar");
                        System.out.println("4. Reiniciar Gasto");
                        System.out.println("0. Volver al menú principal");
                        barcoOpcion = sc.nextInt();
                        
                        switch (barcoOpcion) {
                            case 1: barco.zarpar(); 
                            		break;
                            case 2: barco.navegar(true); 
                            		break;
                            case 3: barco.anclar(); 
                            		break;
                            case 4: barco.ReiniciaCombustible(); 
                            		break;
                        }
                    } while (barcoOpcion != 0);
                    break;
                
                case 2:
                    int avionOpcion;
                    do {
                        System.out.println("1. Despegar");
                        System.out.println("2. Volar");
                        System.out.println("3. Aterrizar");
                        System.out.println("4. Recargar Gasolina");
                        System.out.println("0. Volver al menú principal");
                        avionOpcion = sc.nextInt();
                        
                        switch (avionOpcion) {
                            case 1: avion.despegar(); 
                            		break;
                            case 2: avion.volar(); 
                            		break;
                            case 3: avion.aterrizar(); 
                            		break;
                            case 4:
                                System.out.println("Ingrese la cantidad de gasolina a recargar:");
                                double gasolina = sc.nextDouble();
                                avion.recargarGasolina(gasolina);
                                break;
                        }
                    } while (avionOpcion != 0);
                    break;
                
                case 3:
                    int hidroavionOpcion;
                    do {
                        System.out.println("1. Despegar");
                        System.out.println("2. Volar");
                        System.out.println("3. Aterrizar");
                        System.out.println("4. Zarpar");
                        System.out.println("5. Navegar");
                        System.out.println("6. Anclar");
                        System.out.println("7. Transformar");
                        System.out.println("8. Subir al Hidroavión");
                        System.out.println("0. Volver al menú principal");
                        hidroavionOpcion = sc.nextInt();
                        
                        switch (hidroavionOpcion) {
                            case 1: hidroavion.despegar(); 
                            		break;
                            case 2: hidroavion.volar(); 
                            		break;
                            case 3: hidroavion.aterrizar(); 
                            		break;
                            case 4: hidroavion.zarpar(); 
                            		break;
                            case 5: hidroavion.navegar(true); 
                            		break;
                            case 6: hidroavion.anclar(); 
                            		break;
                            case 7: hidroavion.transformar(); 
                            		break;
                            case 8: hidroavion.anadirPasajero(); 
                            		break;
                        }
                    } while (hidroavionOpcion != 0);
                    break;
                
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
            System.out.println("Seleccione el medio de transporte:");
            System.out.println("1. Barco");
            System.out.println("2. Avión");
            System.out.println("3. Hidroavión");
            System.out.println("4. Salir");
            opcion = sc.nextInt();
        }
        System.out.println("Saliendo del programa");
    }
}
