package gutierrezLopez_inigo_asignaturas;

import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Alumno> alumnos = new ArrayList<>();

        Asignatura mate = new Asignatura(1, "MATEMÁTICAS");
        Asignatura lengua = new Asignatura(2, "LENGUA");
        Asignatura ingles = new Asignatura(3, "INGLÉS");
        Asignatura historia = new Asignatura(4, "HISTORIA");
        Asignatura fisica = new Asignatura(5, "FÍSICA");

        alumnos.add(new Alumno(1, "María", new ArrayList<>(Arrays.asList(new NotasAlumno(mate, 5), new NotasAlumno(lengua, 8)))));
        alumnos.add(new Alumno(2, "Pedro", new ArrayList<>(Arrays.asList(new NotasAlumno(ingles, 4), new NotasAlumno(fisica, 6) ))));
        alumnos.add(new Alumno(3, "Lucía", new ArrayList<>(Arrays.asList(new NotasAlumno(historia, 9), new NotasAlumno(mate, 7)))));
        alumnos.add(new Alumno(4, "Carlos", new ArrayList<>(Arrays.asList(new NotasAlumno(lengua, 3), new NotasAlumno(ingles, 5)))));
        alumnos.add(new Alumno(5, "Elena", new ArrayList<>(Arrays.asList(new NotasAlumno(mate, 8), new NotasAlumno(historia, 8)))));

        int opcion;
        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Añadir un nuevo alumno sin notas");
            System.out.println("2. Añadir notas a un alumno");
            System.out.println("3. Listar a todos los alumnos");
            System.out.println("4. Reorganizar la lista de alumnos");
            System.out.println("5. Obtener la nota media más repetida");
            System.out.println("6. Listar cantidad de aprobados y suspensos por alumno");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del nuevo alumno: ");
                    String nombre = sc.nextLine();
                    System.out.print("ID del alumno: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    alumnos.add(new Alumno(id, nombre, new ArrayList<>()));
                    System.out.println("Alumno añadido.");
                    break;
                case 2:
                    System.out.print("ID del alumno: ");
                    int idAlumno = sc.nextInt();
                    sc.nextLine();
                    Alumno encontrado = buscarAlumno(alumnos, idAlumno);
                    if (encontrado != null) {
                        System.out.print("Nombre de asignatura: ");
                        String nomAsig = sc.nextLine().toUpperCase();
                        System.out.print("ID de asignatura: ");
                        int idAsig = sc.nextInt();
                        System.out.print("Nota: ");
                        int nota = sc.nextInt();
                        sc.nextLine();
                        encontrado.insertarNota(new NotasAlumno(new Asignatura(idAsig, nomAsig), nota));
                        System.out.println("Nota añadida.");
                    } else {
                        System.out.println("Alumno no encontrado.");
                    }
                    break;
                case 3:
                    for (Alumno a : alumnos) {
                        System.out.print(a);
                    }
                    break;
                /*El case 4 lo he copiado de ChatGPT (No se me ocurria como hacerlo). Según he entendido no hace falta implementar Comparator porque ya 
                  provee una implementacion usando metodos estaticos y tampoco Comparable si solo lo queremos ordenar de forma puntual (como ahora)*/
                case 4:
                    alumnos.sort(Comparator.comparingDouble(Alumno::notaMedia).reversed());
                    System.out.println("Lista reorganizada por nota media descendente.");
                    break;
                case 5:
                    HashMap<Double, Integer> frecuencia = new HashMap<>();
                    for (Alumno a : alumnos) {
                        double media = Math.round(a.notaMedia() * 100.0) / 100.0;
                        frecuencia.put(media, frecuencia.getOrDefault(media, 0) + 1);
                    }
                    double masRepetida = 0;
                    int max = 0;
                    for (Map.Entry<Double, Integer> entry : frecuencia.entrySet()) {
                        if (entry.getValue() > max) {
                            masRepetida = entry.getKey();
                            max = entry.getValue();
                        }
                    }
                    System.out.println("La nota media más repetida es: " + masRepetida);
                    break;
                case 6:
                    for (Alumno a : alumnos) {
                        System.out.println("Alumno: " + a.toString());
                        System.out.println("Aprobados: " + a.numeroAprobados());
                        System.out.println("Suspensos: " + a.numeroSuspensos());
                        System.out.println();
                    }
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }

    public static Alumno buscarAlumno(ArrayList<Alumno> alumnos, int id) {
        for (Alumno a : alumnos) {
            if (a.toString().contains("id: " + id)) {
                return a;
            }
        }
        return null;
    }

}