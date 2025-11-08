package gutierrezLopez_inigo_aleatorio;

import java.io.*;
import java.util.Scanner;

public class leerRegistros3_1 {
    static final int tamanio = 32;

    public static void main(String[] args) throws IOException {
        RandomAccessFile file = new RandomAccessFile("C:\\Users\\iguti\\OneDrive\\1º DAM\\PROGRAMACIÓN\\Tema10y11\\accesoAleatorio.dat", "r");
        Scanner sc = new Scanner(System.in);

        System.out.println("=========== MENÚ ===========");
        System.out.println("1. Leer todos los registros");
        System.out.println("2. Leer un registro concreto");
        System.out.print("Opcion: ");

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1 -> {
                int i = 0;
                System.out.println();
                while (i * tamanio < file.length()) {
                    try {
                        leerRegistro(file, i);
                    } catch (EOFException e) {
                        System.out.println("\nFIN DEL ARCHIVO.");
                        break;
                    }
                    i++;
                }
            }
            case 2 -> {
                System.out.print("Introduce el indice que quieres leer: ");
                int indice = sc.nextInt();
                System.out.println();
                if (indice * tamanio < file.length()) {
                    leerRegistro(file, indice);
                } else {
                    System.out.println("Indice invalido.");
                }
            }
            default -> System.out.println("Opcion no valida.");
        }

        file.close();
    }

    static void leerRegistro(RandomAccessFile file, int index) throws IOException {
        file.seek(index * tamanio);
        int id = file.readInt();
        char[] nombre = new char[10];
        for (int i = 0; i < 10; i++) nombre[i] = file.readChar();
        double altura = file.readDouble();
        System.out.println("ID: " + id + ", Nombre: " + new String(nombre).trim() + ", Altura: " + altura);
    }
}
