package gutierrezLopez_inigo_aleatorio;

import java.io.*;
import java.util.Scanner;

public class modificarRegistros3_2 {

    static final int tamanio = 32;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try (RandomAccessFile file = new RandomAccessFile("C:\\Users\\iguti\\OneDrive\\1º DAM\\PROGRAMACIÓN\\Tema10y11\\accesoAleatorio.dat", "rw")) {

            System.out.print("Introduce el indice que quieres modificar: ");
            int indice = sc.nextInt();
            sc.nextLine();
            
            if (indice * tamanio >= file.length()) {
                System.out.println("Índice fuera de rango. No se puede modificar.");
                return;
            }

            System.out.print("Nuevo ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Nuevo nombre: "); //Maximo de 10 caracteres, que son 20 bytes
            String nombre = sc.nextLine();
            System.out.print("Nueva altura: ");
            double altura = sc.nextDouble();

            file.seek(indice * tamanio);
            escribirRegistro(file, id, nombre, altura);

            System.out.println("Registro modificado correctamente.");

        } catch (FileNotFoundException e) {
            System.out.println("ERROR: No se encontró el archivo.");
        } catch (EOFException e) {
            System.out.println("ERROR: Fin del archivo alcanzado inesperadamente.");
        } catch (IOException e) {
            System.out.println("ERROR: Error de entrada/salida: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }
    }

    static void escribirRegistro(RandomAccessFile file, int id, String nombre, double altura) throws IOException {
        file.writeInt(id);
        StringBuffer buffer = new StringBuffer(nombre);
        buffer.setLength(10);
        file.writeChars(buffer.toString());
        file.writeDouble(altura);
    }
}
