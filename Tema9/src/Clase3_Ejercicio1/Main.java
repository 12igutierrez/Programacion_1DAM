package Clase3_Ejercicio1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario cuántas cartas diferentes quiere generar
        System.out.print("Ingrese la cantidad de cartas diferentes a generar: ");
        int cantidad = scanner.nextInt();

        // Crear un array para almacenar las cartas
        Carta[] cartas = new Carta[cantidad];

        // Generar cartas sin repetir
        int contador = 0;
        while (contador < cantidad) {
            Carta nuevaCarta = Carta.devolverCarta();
            boolean repetida = false;

            // Verificar si la carta ya está en el array
            for (int j = 0; j < contador; j++) {
                if (cartas[j].getNumero() == nuevaCarta.getNumero() && cartas[j].getPalo() == nuevaCarta.getPalo()) {
                    repetida = true;
                    break;
                }
            }

            // Si no es repetida, se almacena en el array
            if (!repetida) {
                cartas[contador] = nuevaCarta;
                contador++;
            }
        }

        // Preguntar el método de ordenación
        System.out.println("Seleccione el método de ordenación:");
        System.out.println("1. Ordenar de menor a mayor por número y por palo alfabéticamente");
        System.out.println("2. Ordenar de mayor a menor solo por número");
        int opcion = scanner.nextInt();

        if (opcion == 1) {
            Arrays.sort(cartas); // Usa compareTo() de la clase Carta
        } else if (opcion == 2) {
            Arrays.sort(cartas, new ComparadorCartas());

            // Invertir manualmente el array (de mayor a menor)
            for (int i = 0; i < cartas.length / 2; i++) {
                Carta temp = cartas[i];
                cartas[i] = cartas[cartas.length - 1 - i];
                cartas[cartas.length - 1 - i] = temp;
            }
        } else {
            System.out.println("Opción no válida, se mostrará la lista sin ordenar.");
        }

        // Mostrar el array ordenado
        System.out.println("\nCartas ordenadas:");
        for (int i = 0; i < cartas.length; i++) {
            System.out.println(cartas[i]);
        }

        scanner.close();
    }
}

