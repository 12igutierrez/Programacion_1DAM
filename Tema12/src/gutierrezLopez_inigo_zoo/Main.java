package gutierrezLopez_inigo_zoo;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Habitat> zoo = new TreeMap<>();

        zoo.put(1, new Habitat("Ártico", Arrays.asList("Oso polar", "Morsa", "Pingüino"), "Clima extremadamente frío", 2.5, true));
        zoo.put(2, new Habitat("Selva", Arrays.asList("Jaguar", "Mono", "Tucán"), "Vegetación densa y húmeda", 4.2, false));
        zoo.put(3, new Habitat("Sabana", Arrays.asList("León", "Elefante", "Cebra"), "Praderas abiertas con pocos árboles", 3.8, false));
        zoo.put(4, new Habitat("Océano", Arrays.asList("Delfín", "Tiburón", "Pulpo"), "Ambiente marino simulado", 5.0, true));
        zoo.put(5, new Habitat("Bosque", Arrays.asList("Oso pardo", "Lobo", "Ciervo"), "Clima templado con mucha vegetación", 3.0, false));

        for (Map.Entry<Integer, Habitat> entry : zoo.entrySet()) {
            System.out.println("Hábitat " + entry.getKey());
            System.out.println(entry.getValue());
        }
        
    }
    
}