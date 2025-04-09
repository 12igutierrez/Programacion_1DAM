package gutierrezLopez_inigo_llamadas;

import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Llamada[] llamadas = {
	            new Llamada(999999999, 600654321, false, "01/03/2025 - 10:00", "01/03/2025 - 10:05", Llamada.Distancia.A),
	            new Llamada(999911111, 701765432, true, "02/03/2025 - 11:15", "02/03/2025 - 11:25", Llamada.Distancia.B),
	            new Llamada(123456789, 902876543, false, "03/03/2025 - 12:30", "03/03/2025 - 12:45", Llamada.Distancia.C),
	            new Llamada(555555555, 103987654, true, "04/03/2025 - 14:00", "04/03/2025 - 14:20", Llamada.Distancia.D),
	            new Llamada(666666666, 204098765, false, "05/03/2025 - 15:30", "05/03/2025 - 15:50", Llamada.Distancia.A),
	            new Llamada(987654321, 405109876, true, "06/03/2025 - 16:45", "06/03/2025 - 17:00", Llamada.Distancia.B),
	            new Llamada(100000000, 306210987, false, "07/03/2025 - 18:00", "07/03/2025 - 18:30", Llamada.Distancia.C),
	            new Llamada(010101010, 507321098, true, "08/03/2025 - 19:15", "08/03/2025 - 19:35", Llamada.Distancia.D),
	            new Llamada(234234234, 808432109, false, "09/03/2025 - 20:30", "09/03/2025 - 20:50", Llamada.Distancia.A),
	            new Llamada(456456456, 609543210, true, "10/03/2025 - 21:45", "10/03/2025 - 22:05", Llamada.Distancia.B)
	        };
		
		int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Mostrar la lista de llamadas tal y como están en el array");
            System.out.println("2. Mostrar la lista de llamadas ordenadas por orden natural");
            System.out.println("3. Mostrar la lista de llamadas ordenadas en orden inverso");
            System.out.println("4. Mostrar la lista de llamadas ordenadas por coste");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            
            switch (opcion) {
            case 1:
                System.out.println("\nLista de llamadas:");
                for (Llamada llamada : llamadas) {
                    System.out.println(llamada);
                }
                break;
            case 2:
            	Arrays.sort(llamadas);
            	for (Llamada llamada : llamadas) {
                    System.out.println(llamada);
                }
            	break;
            case 3:
            	Arrays.sort(llamadas);
            	for(int i = llamadas.length - 1; i>0; i--) {
            		System.out.println(llamadas[i].toString());
            	}
            	break;
            case 4:
            	ComparadorLlamadas cl = new ComparadorLlamadas();
            	Arrays.sort(llamadas,cl);
            	for(int i = 0; i < llamadas.length; i++) {
            		System.out.println(llamadas[i].toString());
            	}
            	break;
            case 5:
            	System.out.println("Saliendo...");
            }
            
        } while(opcion != 5);
        
	}

}
