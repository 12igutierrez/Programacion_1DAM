package gutierrezLopez_inigo_profesores;

public class main {

	public static void main(String[] args) {
		
		//Profesor Interino
	    Fecha fechaInicio = new Fecha(6, 9, 2025);
	    Fecha fechaFin = new Fecha(15, 6, 2024);
	    ProfesorInterino profesorInterino1 = new ProfesorInterino("Pedro", "Sistemas Informaticos", "Brianda de Mendoza", 5, fechaInicio, fechaFin);
	    
	    //Profesor Titular
	    fechaInicio = new Fecha(21, 2, 2025);
	    fechaFin = new Fecha(1, 11, 2022);
	    ProfesorTitular profesorTitular1 = new ProfesorTitular("Juan", "Bases de datos", "Brianda de Mendoza", 10, new Fecha(1, 9, 2015), 5);
	    
	    // Mostrar información
	    System.out.println(profesorInterino1);
	    System.out.println();
	    System.out.println(profesorTitular1);
	}


}
