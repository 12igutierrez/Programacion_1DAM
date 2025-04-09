package gutierrezLopez_inigo_cajas;

public class main {

	public static void main(String[] args) {
		
		//Creacion
        Etiqueta etiqueta = new Etiqueta("Juan Pérez", "Calle Falsa 123", "Avenida Siempre Viva 742", "Transporte SA", 2.5, "Electrodoméstico");
        Caja caja = new Caja("Juan Pérez", "Calle Falsa 123", "Avenida Siempre Viva 742", "Transporte SA", 2.5, "Electrodoméstico", 30, 20, 15, 2.5);
        CajaDeCarton cajaCarton = new CajaDeCarton("María López", "Calle Gran Vía 456", "Avenida Libertad 900", "Envios Express", 3.0, "Ropa", 25, 18, 12, 3.0);
        
        // Pruebas de métodos
        System.out.println("--- Información de la Caja ---");
        System.out.println(caja.infoCaja());
        
        System.out.println("\n--- Información de la Caja de Cartón ---");
        System.out.println("Volumen ajustado de la caja de cartón: " + cajaCarton.volumenCaja());
        System.out.println("Cantidad de cartón necesario: " + cajaCarton.cantidadCarton());
	}

}
