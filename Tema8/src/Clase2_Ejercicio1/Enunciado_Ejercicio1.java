package Clase2_Ejercicio1;

public class Enunciado_Ejercicio1 {
	/*Ejercicio 1:
		Crea la clase Hora que tendrá:
		Los atributos hora (0 a 23) y minutos (0 a 59).
		Los métodos:
		- Hora(hora,minutos): Construye el objeto con los parámetros
			pasados siempre y cuando estén entre los valores máx y min de cada
			atributo. Sino, coloca Hora 0 y Minuto 0.
		- void inc( ): Incrementa la hora un minuto (ten en cuenta los límites)
			Métodos get/set para ambas variables (ten en cuenta los límites)
		- toString( ): Devuelve un String con la hora en formato: hora:minuto
		
		Crea la clase HoraExacta que será hija de la clase Hora, además de los
		métodos heredados de Hora:
		El atributo segundo (0 a 59).
		Los métodos:
		- HoraExacta(hora,minutos,segundos): Construye el objeto con los
			parámetros pasados siempre y cuando estén entre los valores máx
			y min de cada atributo. Sino, coloca Segundo a 0.
		- Sobreescribe void inc( ): Incrementa la hora un segundo (ten en
				cuenta los límites)
		- Métodos get/set para segundo (ten en cuenta los límites)
		- Sobreescribe toString( ): Devuelve un String con la hora en
			formato: hora:minuto:segundos
		- Sobreescribe equals ( ): Compara la hora pasada por parámetro
			con el objeto invocante. Devuelve un boolean.
			Después crea un objeto clase Hora e incrementa su tiempo una hora
			(mediante un bucle), crea un objeto clase HoraExacta y crea una copia de
			la misma. Al primer objeto aumenta la hora 1 minuto (mediante un bucle) y
			después compara los objetos Hora Exacta y muestra el resultado del
			equals por pantalla. Después muestra las 3 horas por pantalla.
	*/
}
