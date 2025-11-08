package gutierrezLopez_inigo_pedidos;

public class Pedido {
	private String dir_envio;
	private String descripcion;
	private int id;
	
	
	public String getDir_envio() {
		return dir_envio;
	}
	public void setDir_envio(String dir_envio) {
		this.dir_envio = dir_envio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public Pedido(String dir_envio, String descripcion, int id) {
		super();
		this.dir_envio = dir_envio;
		this.descripcion = descripcion;
		this.id = id;
	}
	
	@Override public String toString() {
		return "Pedido " +getId()+ ": " +getDescripcion()+ " (Envío: " +getDir_envio()+ ")";
	}

}
