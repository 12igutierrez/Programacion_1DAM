package gutierrezLopez_inigo_centro_recuperacion;

public class Main {
    public static void main(String[] args) {
        AnimalBase[] animales = new AnimalBase[6];

        animales[0] = new Ave("Loro", 3, AnimalBase.EstadoSalud.Bien, "Frutas", 13, true, "selva");
        animales[1] = new Ave("Pingüino", 5, AnimalBase.EstadoSalud.Recuperandose, "Pescado", 23, false, "polo");
        
        animales[2] = new Mamifero("León", 7, AnimalBase.EstadoSalud.Herido, "Carne", 20, 5);
        animales[3] = new Mamifero("Oso", 18, AnimalBase.EstadoSalud.Grave, "Omnívoro", 650, 600);
        
        animales[4] = new Reptil("Iguana", 4, AnimalBase.EstadoSalud.Bien, "Vegetales", 12, 28.0);
        animales[5] = new Reptil("Serpiente", 2, AnimalBase.EstadoSalud.Riesgoso, "Ratones", 45, 31.5);

        System.out.println("INFORMACION INICIAL: ");
        for (AnimalBase animal : animales) {
            System.out.println(animal.mostrarInformacion());
            System.out.println("-----------------------------");
        }
        System.out.println("\nAPLICANDO METODOS: ");

        for (AnimalBase animal : animales) {
            if (animal instanceof Ave) {
                Ave ave = (Ave) animal;
                ave.volar();
                ave.migrar();
            } else if (animal instanceof Mamifero) {
                Mamifero mamifero = (Mamifero) animal;
                mamifero.correr();
            } else if (animal instanceof Reptil) {
                Reptil reptil = (Reptil) animal;
                reptil.tomarSol();
                reptil.estarALaSombra();
            }
            animal.revisarSalud();
        }

        System.out.println("\n¿NECESITAN DESCANSO?: ");
        for (AnimalBase animal : animales) {
            System.out.println(animal.getNombre() + " necesita descanso: " + animal.necesitaDescanso());
        }

        System.out.println("\nINFORMACION FINAL: ");
        for (AnimalBase animal : animales) {
            System.out.println(animal.mostrarInformacion());
            System.out.println("-----------------------------");
        }
    }
}

