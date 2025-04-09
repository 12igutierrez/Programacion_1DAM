package gutierrezLopez_inigo_llamadas;

public class Llamada implements Comparable{
	enum Distancia {A,B,C,D};
	
	private int tfno_cliente;
	private int tfno_destino;
	private boolean esEntrante;
	private String FyH;
	private String FyH_finLlamada;
	Distancia distancia;
	double tarifas [] = {0.03, 0.10, 0.25, 0.50};
	
	
	public int getTfno_cliente() {
		return tfno_cliente;
	}
	public void setTfno_cliente(int tfno_cliente) {
		this.tfno_cliente = tfno_cliente;
	}

	public int getTfno_destino() {
		return tfno_destino;
	}
	public void setTfno_destino(int tfno_destino) {
		this.tfno_destino = tfno_destino;
	}

	public boolean isEsEntrante() {
		return esEntrante;
	}
	public void setEsEntrante(boolean esEntrante) {
		this.esEntrante = esEntrante;
	}

	public String getFyH() {
		return FyH;
	}
	public void setFyH(String fyH) {
		FyH = fyH;
	}

	public String getFyH_finLlamada() {
		return FyH_finLlamada;
	}
	public void setFyH_finLlamada(String fyH_finLlamada) {
		FyH_finLlamada = fyH_finLlamada;
	}

	public Distancia getDistancia() {
		return distancia;
	}
	public void setDistancia(Distancia distancia) {
		this.distancia = distancia;
	}
	
	
	public Llamada(int tfno_cliente, int tfno_destino, boolean esEntrante, String fyH, String fyH_finLlamada,
			Distancia distancia) {
		this.tfno_cliente = tfno_cliente;
		this.tfno_destino = tfno_destino;
		this.esEntrante = esEntrante;
		this.FyH = fyH;
		this.FyH_finLlamada = fyH_finLlamada;
		this.distancia = distancia;
	}
	
	
	@Override public String toString() {
	    return "El teléfono de la compañía " + getTfno_cliente() + " ha " +
	           (isEsEntrante() ? "recibido" : "realizado") + " una llamada del telefono "+getTfno_destino()+ " en la fecha "+getFyH()
	           +" hasta la hora " + getFyH_finLlamada() +" y ha supuesto un coste de "+calcularCoste()+"€.";
	}
	
	//Este metodo lo he hecho con ChatGPT, no sabía hacerlo.
	public long calcularDuracion() {
	    try {
	        // Dividimos la fecha y hora en partes utilizando un split adecuado.
	        String[] inicio = FyH.split(" - |/|:");
	        String[] fin = FyH_finLlamada.split(" - |/|:");

	        // Verificamos que las cadenas se dividen correctamente.
	        if (inicio.length < 5 || fin.length < 5) {
	            throw new IllegalArgumentException("El formato de la fecha y hora es incorrecto.");
	        }

	        // Extraemos los componentes de la fecha y hora.
	        int diaInicio = Integer.parseInt(inicio[0]);
	        int mesInicio = Integer.parseInt(inicio[1]);
	        int anioInicio = Integer.parseInt(inicio[2]);
	        int horaInicio = Integer.parseInt(inicio[3]);
	        int minutoInicio = Integer.parseInt(inicio[4]);

	        int diaFin = Integer.parseInt(fin[0]);
	        int mesFin = Integer.parseInt(fin[1]);
	        int anioFin = Integer.parseInt(fin[2]);
	        int horaFin = Integer.parseInt(fin[3]);
	        int minutoFin = Integer.parseInt(fin[4]);

	        // Calculamos el total de minutos desde el 01/01/0000 hasta la fecha de inicio y fin.
	        int totalMinutosInicio = (anioInicio * 525600) + (mesInicio * 43800) + (diaInicio * 1440) + (horaInicio * 60) + minutoInicio;
	        int totalMinutosFin = (anioFin * 525600) + (mesFin * 43800) + (diaFin * 1440) + (horaFin * 60) + minutoFin;

	        return totalMinutosFin - totalMinutosInicio;
	    } catch (Exception e) {
	        throw new IllegalArgumentException("El formato de la fecha y hora es incorrecto.", e);
	    }
	}


	public double calcularCoste() {
	    if (esEntrante) {
	        return 2;
	    }

	    double tarifa = 0;
	    switch (distancia) {
	        case A: tarifa = tarifas[0]; break;
	        case B: tarifa = tarifas[1]; break;
	        case C: tarifa = tarifas[2]; break;
	        case D: tarifa = tarifas[3]; break;
	    }

	    return calcularDuracion() * tarifa;
	}
    
    
	@Override public int compareTo(Object o) {
		Llamada llamada = (Llamada) o;
		
		if(this.tfno_cliente == llamada.tfno_cliente) {// Es int no utiliza equals
			if(llamada.equals(FyH)) {
			} 
			else if (llamada.compareTo(FyH)<0) { 
				return 1;
			} else if (llamada.compareTo(FyH)<0) {
				return -1;
			}
		} 
		else if (tfno_cliente > llamada.tfno_cliente) { 
			return 1;
		} else if (tfno_cliente < llamada.tfno_cliente) {
			return -1;
		}
		return 0;
	}
	
}
