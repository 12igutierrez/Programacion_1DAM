package Clase2_Ejercicio1;

public class Enunciado {
	/*Ejercicio 1:
		Crea la interfaz Notificador que tendrá el método
		enviarMensaje( ) que recibirá un destinatario y un
		mensaje y devolverá un booleano.
		
		Después crea la clase GestorNotificaciones que tendrá
		el método procesarNotificacion( ) que recibirá un
		Notificador, el destinatario y el mensaje. El método
		mostrará el mensaje “Procesando mensaje...”, llamará al
		método enviarMensaje del Notificador y si no se han
		producido errores mostrará “Notificación enviada con
		éxito”.
		
		En una clase main crearemos un objeto de la clase Gestor y dos clases
		anónimas que implementen Notificador:
		- Correo implementará enviarMensaje mostrando la información que le
			llega (siempre que el destinatario no esté vacío, si lo está, devolverá
			false) como:
			“Destinatario: destinatario
						Mensaje”
						
		- SMS implementará enviarMensaje mostrando la información que le
			llega (si el mensaje es menor a 140 caracteres) como:
				“¡Tienes una notificación!
				  Destinatario : Mensaje”
			Después envía cuatro notificaciones, dos correctas y dos incorrectas.
	*/
}
