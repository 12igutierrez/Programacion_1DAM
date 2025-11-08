package gutierrezLopez_inigo_texto;

import java.io.*;

public class Libros {

    public static void main(String[] args) {
        String archivoEntrada = "libros.txt";
        String archivoSalida = "libros_formateados.txt";

        try (
            BufferedReader lector = new BufferedReader(new FileReader(archivoEntrada));
            BufferedWriter escritor = new BufferedWriter(new FileWriter(archivoSalida));
        ) {
            String linea;

            while ((linea = lector.readLine()) != null) {
                String[] partes = linea.split(",", 5);

                if (partes.length == 5) {
                    String isbn = partes[0];
                    String titulo = partes[1];
                    String autor = partes[2];
                    String editorial = partes[3];
                    String anio = partes[4];

                    String archivoConFormato = "----------------------------\n" +
                    							isbn + "\n" +
                    							"\t" + titulo + " (" + autor + ")\n" +
                    							editorial + ", " + anio + "\n" +
                    							"----------------------------\n";
                    escritor.write(archivoConFormato);
                    System.out.print(archivoConFormato);
                }
            }
        } catch (IOException e) {
            System.err.println("Error al intentar cambiar el formato del archivo: " + e.getMessage());
        }
    }
}
