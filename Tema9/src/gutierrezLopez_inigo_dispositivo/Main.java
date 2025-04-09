package gutierrezLopez_inigo_dispositivo;

public class Main {
    public static void main(String[] args) {
        Telefono telefono = new Telefono(50, false, false);
        Ordenador ordenador = new Ordenador(30, false, false);
        Lavadora lavadora = new Lavadora("Corta duracion", 500, false, 50);

        System.out.println("\n--- TELÉFONO ---");
        telefono.encender();
        telefono.utilizar("Whatsapp");
        telefono.utilizar("Instagram");
        telefono.utilizar("Tiktok");
        telefono.utilizar("Juego");
        telefono.apagar();
        telefono.reiniciar();
        telefono.cargarBateria();
        System.out.println(telefono.mostrarInformacion());

        System.out.println("\n--- ORDENADOR ---");
        ordenador.encender();
        ordenador.utilizar(3);
        ordenador.apagar();
        ordenador.encender();
        ordenador.reiniciar();
        System.out.println("Batería actual: " + ordenador.verificarBateria()+"%");
        ordenador.cargarBateria();
        System.out.println(ordenador.mostrarInformacion());

        System.out.println("\n--- LAVADORA ---");
        lavadora.encender();
        lavadora.aumentarCapacidad(20);
        lavadora.restarCapacidad(10);
        lavadora.seleccionarModo("Sostenible");
        lavadora.seleccionarPotencia(700);
        lavadora.apagar();
        System.out.println(lavadora.mostrarInformacion());
    }
    
    
}

