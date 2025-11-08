package gutierrezLopez_inigo_aleatorio;

import java.io.*;
import java.util.Scanner;

public class insertarRegistros3_4 {
    static final int tamanio = 32;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try (RandomAccessFile file = new RandomAccessFile("C:\\Users\\iguti\\OneDrive\\1º DAM\\PROGRAMACIÓN\\Tema10y11\\accesoAleatorio.dat", "rw")) {

            while (true) {
                System.out.print("Índice donde insertar: ");
                int index = sc.nextInt();

                if (index < 0) {
                    System.out.println("Indice incorrecto (Tiene que ser >= 0 y <=ultimoIndice).\n");
                    continue;
                }

                file.seek(index * tamanio);
                int id = file.readInt();

                if (id == -1 || index * tamanio >= file.length()) {
                    sc.nextLine();
                    System.out.print("Nuevo ID: ");
                    int nuevoId = sc.nextInt();
                    sc.nextLine();
                    
                    System.out.print("Nombre (máx 10): ");
                    String nombre = sc.nextLine();

                    System.out.print("Altura: ");
                    double altura = sc.nextDouble();

                    file.seek(index * tamanio);
                    escribirRegistro(file, nuevoId, nombre, altura);
                    System.out.println("Registro insertado correctamente.");
                    break;

                } else {
                    System.out.println("La posición ya está ocupada.\n");
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("ERROR: Archivo no encontrado.");
        } catch (EOFException e) {
            System.out.println("ERROR: Indice fuera de rango.");
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
