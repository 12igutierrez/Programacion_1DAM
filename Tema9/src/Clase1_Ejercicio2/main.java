package Clase1_Ejercicio2;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        Random r = new Random();
        Pato pato = new Pato(20);

        for (int i = 0; i < 5; i++) {
            double valorAleatorio = 1 + (9 * r.nextDouble()); // Número entre 1 y 10
            int metodoAleatorio = r.nextInt(5) + 1; // Número entre 1 y 5

            System.out.print("\nTurno " + (i + 1) + ": ");
            double energiaActual = 0;

            switch (metodoAleatorio) {
                case 1:
                    energiaActual = pato.dormir();
                    System.out.println("El pato ha dormido.");
                    break;
                case 2:
                    energiaActual = pato.avanzar(valorAleatorio);
                    System.out.println("El pato ha avanzado " + valorAleatorio + " metros.");
                    break;
                case 3:
                    energiaActual = pato.nadar(valorAleatorio);
                    System.out.println("El pato ha nadado " + valorAleatorio + " metros.");
                    break;
                case 4:
                    energiaActual = pato.volar(valorAleatorio);
                    System.out.println("El pato ha volado " + valorAleatorio + " metros.");
                    break;
                case 5:
                	energiaActual = pato.alimentarse(valorAleatorio);
                	System.out.println("El pato se ha alimentado con " + valorAleatorio + " de energía.");
                    break;
            }

            System.out.println("Energía actual: " + energiaActual);
        }

        System.out.println("\nEnergía final del pato: " + pato.getEnergia());
    }
}
