package gutierrezLopez_inigo_productos;

class Medicamento implements Producto {
    private String nombre, descripcion;
    private double precio;
    private int cantidad;
    private String fechaCad;
    private boolean requiereReceta;
    private String[] componentes;

    public Medicamento(String nombre, double precio, String descripcion, int cantidad, String fechaCad, boolean requiereReceta, String[] componentes) {
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.fechaCad = fechaCad;
        this.requiereReceta = requiereReceta;
        this.componentes = componentes;
    }

    public String getNombre() { 
    	return nombre; 
    }
    public double getPrecio() { 
    	return precio; 
    }
    public String getDescripcion() { 
    	return descripcion; 
    }
    
    @Override public void reponer(int cantidad) {
        this.cantidad += cantidad;
    }
    
    @Override public boolean comprobarDisponibilidad() {
        return cantidad > 0;
    }

    @Override public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Fecha de caducidad: " + fechaCad);
        System.out.println("Requiere receta: " + requiereReceta);
    }

    
    public boolean contiene(String componente) {
        for (String c : componentes) {
            if (c.equals(componente)) 
            	return true;
        }
        return false;
    }
    
    public boolean comprobarReceta() {
        return requiereReceta;
    }

	@Override public void aplicarDescuento(double descuento ) {
		char grupo = (char)descuento;
		
		switch (grupo) {
    		case 'a': precio *= 0.2; break;
    		case 'b': precio *= 0.5; break;
    		case 'c': precio *= 0.7; break;
		}
	}
}
