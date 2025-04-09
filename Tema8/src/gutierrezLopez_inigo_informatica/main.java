package gutierrezLopez_inigo_informatica;

public class main {
    public static void main(String[] args) {
        
        Empleados emp1 = new Empleados("Juan", "Pérez", "Calle A, 123", 22, 1500, Empleados.Casado.NO_CASADO, Empleados.Clasificacion.JUNIOR);
        Empleados emp2 = new Empleados("María", "López", "Calle B, 456", 30, 1800, Empleados.Casado.SI_CASADO, Empleados.Clasificacion.MID);
        Empleados emp3 = new Empleados("Carlos", "Martínez", "Calle C, 789", 40, 2200, Empleados.Casado.NO_CASADO, Empleados.Clasificacion.SENIOR);
        Programadores prog1 = new Programadores("Ana", "Gómez", "Avenida X, 101", 25, 2000, Empleados.Casado.NO_CASADO, Empleados.Clasificacion.JUNIOR, 2800, "Java");
        Programadores prog2 = new Programadores("Pedro", "Fernández", "Avenida Y, 202", 35, 2500, Empleados.Casado.SI_CASADO, Empleados.Clasificacion.MID, 3200, "Python");

        // Array de empleados para recorrerlos fácilmente
        Empleados[] empleados = {emp1, emp2, emp3, prog1, prog2};

        // Mostrar información de cada empleado
        for (Empleados emp : empleados) {
            System.out.println(emp.toString());
            System.out.println("Salario total: " + emp.salarioFinal());
            System.out.println("-------------------------------");
        }
    }
}
