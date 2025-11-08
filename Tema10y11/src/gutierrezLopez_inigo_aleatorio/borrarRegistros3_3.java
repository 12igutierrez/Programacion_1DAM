package gutierrezLopez_inigo_aleatorio;

import java.io.*;
import java.util.Scanner;

public class borrarRegistros3_3 {
    static final int tamanio = 32;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try (RandomAccessFile file = new RandomAccessFile("C:\\Users\\iguti\\OneDrive\\1º DAM\\PROGRAMACIÓN\\Tema10y11\\accesoAleatorio.dat", "rw")) {

            System.out.print("Itroduce el indice que quieres borrar: ");
            int indice = sc.nextInt();

            if (indice * tamanio >= file.length()) {
                System.out.println("ERROR: Índice fuera de rango. No se puede borrar.");
                return;
            }

            file.seek(indice * tamanio);
            escribirRegistro(file, -1, "", 0.0);
            System.out.println("Registro borrado correctamente.");

        } catch (FileNotFoundException e) {
            System.out.println("ERROR: Archivo no encontrado.");
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
