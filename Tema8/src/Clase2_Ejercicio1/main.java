package Clase2_Ejercicio1;

public class main {

	public static void main(String[] args) {
		Hora hora = new Hora(22,43);
		HoraExacta he = new HoraExacta(23,45,2);
		HoraExacta hec = he.clone();
		
		
		for(int i = 0; i < 60; i++) {
			hora.inc();
		}
		
		for(int i = 0; i < 60; i++) {
			he.inc();
		}
		
		
		System.out.println(hec.equals(he));
		
		System.out.println(hora.toString());
		System.out.println(he.toString());
		System.out.println(hec.toString());
		
		
	}

}
