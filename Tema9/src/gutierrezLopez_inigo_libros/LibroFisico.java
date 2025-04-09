package gutierrezLopez_inigo_libros;

import java.util.Arrays;

public class LibroFisico implements Libro {
	private String nombre;
	private int numPaginas;
	private String [] frasesDestacadas;
	private int marcapaginas;
	private double [] dimensiones = new double [3];
	private double peso;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getNumPaginas() {
		return numPaginas;
	}
	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	public String[] getFrasesDestacadas() {
		return frasesDestacadas;
	}
	public void setFrasesDestacadas(String[] frasesDestacadas) {
		this.frasesDestacadas = frasesDestacadas;
	}

	public int getMarcapaginas() {
		return marcapaginas;
	}
	public void setMarcapaginas(int marcapaginas) {
		if (marcapaginas > this.marcapaginas && marcapaginas <= this.marcapaginas) {
			this.marcapaginas = marcapaginas;
		}
	}

	public double[] getDimensiones() {
		return dimensiones;
	}
	public void setDimensiones(double[] dimensiones) {
		this.dimensiones = dimensiones;
	}

	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}


	public LibroFisico(String nombre, int numPaginas, String[] frasesDestacadas, int marcapaginas, double[] dimensiones,
			double peso) {
		this.nombre = nombre;
		this.numPaginas = numPaginas;
		this.frasesDestacadas = new String[0];
		this.marcapaginas = marcapaginas;
		if (dimensiones.length == 3) {
			this.dimensiones = dimensiones;
		}
		this.peso = peso;
	}
	
	
	@Override public void getInformacion() {
		System.out.println(getNombre() + " de " + getNumPaginas() + " paginas y de dimensiones " +Arrays.toString(getDimensiones()) 
		+ " con peso: " + getPeso() + "\nUsted ha leido hasta la pagina " + getMarcapaginas() 
		+ " listando las frases destacada: \n- Pagina " + getNumPaginas() + " : " + Arrays.toString(getFrasesDestacadas()));
	}
	
	
	@Override public void getEstatusLeido() {
		System.out.println("Actualmente leyendo la pagina " + getMarcapaginas() + " de " + getNumPaginas());
	}
	
	public void destacarFrase(int pagina, String frase) {
        if (pagina > 0 && pagina <= numPaginas) {
            frasesDestacadas = Arrays.copyOf(frasesDestacadas, frasesDestacadas.length + 1);
            frasesDestacadas[frasesDestacadas.length - 1] = pagina + ": " + frase;
        }
    }
	
	
	public void eliminarFrases(int pagina) {
        int nuevaLongitud = 0;
        for (int i = 0; i < frasesDestacadas.length; i++) {
            String[] partes = frasesDestacadas[i].split(": ", 2);
            if (Integer.parseInt(partes[0]) != pagina) {
                nuevaLongitud++;
            }
        }
        
        String[] nuevasFrases = new String[nuevaLongitud];
        int index = 0;
        for (int i = 0; i < frasesDestacadas.length; i++) {
            String[] partes = frasesDestacadas[i].split(": ", 2);
            if (Integer.parseInt(partes[0]) != pagina) {
                nuevasFrases[index] = frasesDestacadas[i];
                index++;
            }
        }
        
        frasesDestacadas = nuevasFrases;
    }
	
	
	public double calcularPrecio() {
		return (dimensiones[1] * dimensiones[2] * dimensiones[3]) + getPeso();
	}
	

}
