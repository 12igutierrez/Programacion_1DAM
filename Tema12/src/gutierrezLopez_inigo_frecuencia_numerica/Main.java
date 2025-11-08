package gutierrezLopez_inigo_frecuencia_numerica;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una lista de numeros enteros separados por espacios:");
        String[] entrada = sc.nextLine().split(" ");
        List<Integer> numeros = new ArrayList<>();
        for (String s : entrada) {
            numeros.add(Integer.parseInt(s));
        }

        
        //Detectar numeros duplicados
        Set<Integer> unicos = new HashSet<>();
        Set<Integer> duplicados = new HashSet<>();
        for (int num : numeros) {
            if (!unicos.add(num)) {
                duplicados.add(num);
            }
        }
        System.out.println("\nNumeros duplicados: " + duplicados);

        
        //Contar la frecuencia de cada numero
        Map<Integer, Integer> frecuencia = new HashMap<>();
        for (int num : numeros) {
        	frecuencia.put(num, frecuencia.getOrDefault(num, 0) + 1);
        }
        System.out.println("\nFrecuencia de cada numero:");
        for (Map.Entry<Integer, Integer> entry : frecuencia.entrySet()) {
            System.out.println(entry.getKey() + " --> " + entry.getValue() + (entry.getValue() == 1 ? " vez" : " veces"));
        }
        
        
        //Ordenar por frecuencia de mayor a menor
        List<Map.Entry<Integer, Integer>> frecDesc = new ArrayList<>(frecuencia.entrySet());
        frecDesc.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        
        System.out.println("\nNúmeros ordenados por frecuencia (mayor a menor):");
        for (Map.Entry<Integer, Integer> entry : frecDesc) {
            System.out.println(entry.getKey() + " → " + entry.getValue() + " veces");
        }

        
        //Ordenar por frecuencia de menor a mayor 
        List<Map.Entry<Integer, Integer>> frecAsc = new ArrayList<>(frecuencia.entrySet());
        frecAsc.sort((a, b) -> Integer.compare(a.getValue(), b.getValue()));

        System.out.println("\nNúmeros ordenados por frecuencia (menor a mayor):");
        for (Map.Entry<Integer, Integer> entry : frecAsc) {
            System.out.println(entry.getKey() + " → " + entry.getValue() + " veces");
        }
        
        
        //Eliminar duplicados y mantener orden
        List<Integer> sinDuplicados = eliminarDuplicadosConOrden(numeros);
        System.out.println("\nLista sin duplicados: " + sinDuplicados);
	}
	
	
	//Para eliminar los duplicados
	public static List<Integer> eliminarDuplicadosConOrden(List<Integer> lista) {
        Set<Integer> vistos = new HashSet<>();
        List<Integer> resultado = new ArrayList<>();
        for (int num : lista) {
            if (!vistos.contains(num)) {
                vistos.add(num);
                resultado.add(num);
            }
        }
        return resultado;
    }

}
