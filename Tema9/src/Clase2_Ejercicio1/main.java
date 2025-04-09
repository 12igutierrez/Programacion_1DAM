package Clase2_Ejercicio1;

public class main {
	
	public static void main(String[] args) {
		
		Notificador Correo = new Notificador() {
			public boolean enviarMensaje(String destinatario, String mensaje) {
		        
		        if (destinatario == "") {
		            return false;
		        } else {
		        	System.out.println("Destinatario: "+destinatario+"\n"+mensaje);
		            return true;
		        }
			}
		};
		
		
		Notificador SMS = new Notificador() {
			public boolean enviarMensaje(String destinatario, String mensaje) {
		        
		        if (mensaje.length() < 140) {
		        	System.out.println("¡Tienes una notificacion!"+"\n"+destinatario+" : "+mensaje);
		            return true;
		        } else {
		        	return false;
		        }
			}
		};
		
		GestorNotificaciones g = new GestorNotificaciones();
		
		 g.procesarNotificacion(SMS, "usuario1@example.com", "Hola, este es un mensaje de prueba.");
		 System.out.println();
	     g.procesarNotificacion(SMS, "usuario2@example.com", "Notificación importante.");
	     System.out.println();

	     // Notificaciones incorrectas
	     g.procesarNotificacion(Correo, "", "Mensaje sin destinatario.");
	     System.out.println();
	     
	     g.procesarNotificacion(Correo, "usuario3@example.com", "Hola");
		

	}

}
