package gutierrezLopez_inigo_pedidos;

public class LineaPedido implements Comparable<LineaPedido>{
	private String producto;
	private double cantidad;
	private double precio;
	private int id;
	
	
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public LineaPedido(String producto, double cantidad, double precio, int id) {
		super();
		this.producto = producto;
		this.cantidad = cantidad;
		this.precio = precio;
		this.id = id;
	}

	public double obtenerPVPLinea() {
		return cantidad * precio;
	}
	
	@Override public String toString() {
		return "Linea "+getId()+"\n"+"\t "+getProducto()+" "+getCantidad()+" "+getPrecio()+" = "+obtenerPVPLinea();
	}
	
	@Override public int compareTo(LineaPedido otra) {
        return Integer.compare(this.id, otra.id);
    }
	
}
