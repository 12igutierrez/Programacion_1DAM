package Clase2_Ejercicio1;

public class GestorNotificaciones {
	
    public void procesarNotificacion(Notificador notificador, String destinatario, String mensaje) {
        System.out.println("Procesando mensaje...");
        boolean enviado = notificador.enviarMensaje(destinatario, mensaje);
        
        if (enviado) {
            System.out.println("Notificación enviada con exito.");
        } else {
            System.out.println("Error al enviar el mensaje.");
        }
    }
}

