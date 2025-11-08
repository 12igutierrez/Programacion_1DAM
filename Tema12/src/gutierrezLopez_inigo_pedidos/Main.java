package gutierrezLopez_inigo_pedidos;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Pedido, Set<LineaPedido>> pedidos = new HashMap<>();

        Pedido p1 = new Pedido("Calle A, 123", "Pedido de oficina", 1);
        Pedido p2 = new Pedido("Avenida B, 456", "Pedido personal", 2);

        LineaPedido lp1 = new LineaPedido("Teclado", 2, 15.50, 2);
        LineaPedido lp2 = new LineaPedido("Ratón", 1, 10.00, 1);
        LineaPedido lp3 = new LineaPedido("Monitor", 1, 120.99, 3);
        LineaPedido lp4 = new LineaPedido("Libro", 3, 8.90, 1);
        LineaPedido lp5 = new LineaPedido("Auriculares", 1, 25.00, 2);

        pedidos.put(p1, new TreeSet<>(Arrays.asList(lp1, lp2, lp3)));
        pedidos.put(p2, new TreeSet<>(Arrays.asList(lp4, lp5)));

        Scanner sc = new Scanner(System.in);
        List<Pedido> listaPedidos = new ArrayList<>(pedidos.keySet());

        while (true) {
            System.out.println("\n--- MENÚ DE PEDIDOS ---");
            for (int i = 0; i < listaPedidos.size(); i++) {
                System.out.println((i + 1) + ". " + listaPedidos.get(i));
            }
            System.out.println("0. Salir");
            System.out.print("Selecciona un pedido: ");
            int opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 0) {
            	System.out.println("Saliendo del programa...");
            	break;
            }

            if (opcion >= 1 && opcion <= listaPedidos.size()) {
                Pedido seleccionado = listaPedidos.get(opcion - 1);
                System.out.println("\nLíneas del " + seleccionado + ":");
                for (LineaPedido lp : pedidos.get(seleccionado)) {
                    System.out.println(lp);
                }
            } else {
                System.out.println("Opción no válida.");
            }
        }
        sc.close();
    }
    
}
