package gutierrezLopez_inigo_productos;

import java.util.Random;

public class Ropa implements Producto{
	private String nombre;
	private double precio;
	private String descripcion;
	private String tipoMaterial;
	private String [] color;
	private String [] talla;
	private int [][] Disponibilidad;
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getTipoMaterial() {
		return tipoMaterial;
	}
	public void setTipoMaterial(String tipoMaterial) {
		this.tipoMaterial = tipoMaterial;
	}
	public String[] getColor() {
		return color;
	}
	public void setColor(String[] color) {
		this.color = color;
	}
	public String[] getTalla() {
		return talla;
	}
	public void setTalla(String[] talla) {
		this.talla = talla;
	}
	public int[][] getDisponibilidad() {
		return Disponibilidad;
	}
	public void setDisponibilidad(int[][] disponibilidad) {
		Disponibilidad = disponibilidad;
	}

	
	
	
	public Ropa(String nombre, double precio, String descripcion, String tipoMaterial, String[] color, String[] talla,
			String[][] disponibilidad) {
		this.nombre = nombre;
		this.precio = precio;
		this.descripcion = descripcion;
		this.tipoMaterial = tipoMaterial;
		this.color = color;
		this.talla = talla;
		this.Disponibilidad = new int[color.length][talla.length];
	}
	
	
	
	
	@Override public void aplicarDescuento(double descuento) {
		precio -= (precio * (descuento / 100));
	}
	@Override public void reponer(int cantidad) {
		for (int i = 0; i < Disponibilidad.length; i++) {
            for (int j = 0; j < Disponibilidad[i].length; j++) {
                Disponibilidad[i][j] += cantidad;
            }
        }
	}
	@Override public boolean comprobarDisponibilidad() {
		boolean disponible = false;
        for (int i = 0; i < Disponibilidad.length; i++) {
            for (int j = 0; j < Disponibilidad[i].length; j++) {
                if (Disponibilidad[i][j] > 0) {
                    System.out.println("Disponible: Color " + color[i] + ", Talla " + talla[j]);
                    disponible = true;
                }
            }
        }
        return disponible;
	}
	@Override public void mostrarInformacion() {
		System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Material: " + tipoMaterial);
	}
	@Override public double getPrecio() {
		return precio;
	}
	@Override public String getNombre() {
		return nombre;
	}
	@Override public String getDescripcion() {
		return descripcion;
	}
	
	public void comprar(String talla, String color) {
		int c = -1;
		int t = -1;
		for (int i = 0; i < this.color.length; i++) {
			if (this.color[i].equals(color)) {
				c = i;
				break;
			}
		}
		for (int j = 0; j < this.talla.length; j++) {
            if (this.talla[j].equals(talla)) {
                t = j;
                break;
            }
        }
		if(c != -1 && t != -1 && Disponibilidad[c][t] > 0) {
			Disponibilidad[c][t]--;
		}
	}
	
	public boolean probar() {
		return new Random().nextBoolean();
	}
	
	
	
	
	
	
	
	
}
