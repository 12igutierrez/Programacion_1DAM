package gutierrezLopez_inigo_libros;
enum Formato {PDF,EPUB,MOBI,AZW};

public class Ebook implements Libro{
	private String nombre;
	private int numPaginas;
	private double tamanio;
	private double porcentajeLeido;
	Formato formato;

	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getTamanio() {
		return tamanio;
	}
	public void setTamanio(double tamanio) {
		this.tamanio = tamanio;
	}
	
	public double getPorcentajeLeido() {
		return porcentajeLeido;
	}
	public double setPorcentajeLeido(int pagina) {
		return getNumPaginas() / pagina;
	}
	
	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	
	public Formato getFormato() {
		return formato;
	}
	public void setFormato(Formato formato) {
		this.formato = formato;
	}
	

	public Ebook(String nombre, int numPaginas, double tamanio, double porcentajeLeido, Formato formato) {
		super();
		this.nombre = nombre;
		this.numPaginas = numPaginas;
		this.tamanio = tamanio;
		this.porcentajeLeido = porcentajeLeido;
		this.formato = formato;
	}
	
	
	@Override public int getNumPaginas() {
		return this.numPaginas;
	}

	@Override public void getInformacion() {
		System.out.println(getNombre() + " de " + getNumPaginas() + " de formato " +getFormato() 
		+ " y tamaño: " + getTamanio() + "\nUsted ha leido un porcentaje de " + getPorcentajeLeido() + " del total");
	}

	@Override public void getEstatusLeido() {
		System.out.println("Actualmente has leido un " + getPorcentajeLeido() + " del total del libro ");
	}

	
	public void transformar(Formato nuevoFormato) {
        if (this.formato == nuevoFormato) {
            System.out.println("El libro ya está en el formato " + nuevoFormato);
            return;
        }
        switch (nuevoFormato) {
            case EPUB:
                this.tamanio *= 1.2;
                break;
            case MOBI:
                this.tamanio *= 0.5;
                break;
            case AZW:
                this.tamanio *= 2.0;
                break;
            default:
                System.out.println("ERROR: el formato no es correcto");
                return;
        }
        this.formato = nuevoFormato;
        System.out.println("El libro ha sido convertido a " + nuevoFormato + " con nuevo tamaño de " + this.tamanio + " MB");
    }

	
}
