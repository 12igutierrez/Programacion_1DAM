package gutierrezLopez_inigo_coches;

public class main {
    public static void main(String[] args) {
        Coches truck1 = new Truck(120, 7600, "Verde", 3000);  //10% de descuento
        Coches truck2 = new Truck(120, 3000, "Rojo", 1900);   //20% de descuento
        System.out.println();
        
        Coches ford1 = new Ford(120, 9000, "Amarillo", 2019, 2);  //Sin descuento
        Coches ford2 = new Ford(140, 23000, "Blanco", 2015, 4);   //15% de descuento
        System.out.println();

        Coches sedan1 = new Sedan(120, 3000, "Rojo", 3);  //10% de descuento
        Coches sedan2 = new Sedan(120, 3000, "Negro", 9); //5% de descuento

        // Mostrar precios calculados
        Coches[] coches = {truck1, truck2, ford1, ford2, sedan1, sedan2};

        for (Coches coche : coches) {
            System.out.println("El coche " + coche.getClass().getSimpleName() +
                               " tiene un precio calculado de " + coche.calcularPrecio());
        }
    }
}
