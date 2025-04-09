package Clase1_Ejercicio1;

import java.util.Scanner;
public class Mueble {
	Scanner sc = new Scanner (System.in);
	
	int id;
	String nombre;
	int cantidad_disponible;
	double precio;
	enum Stock {sin_stock,con_stock}
	Stock stock;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getCantidad_disponible() {
		return cantidad_disponible;
	}
	public void setCantidad_disponible(int cantidad_disponible) {
		this.cantidad_disponible = cantidad_disponible;
	}
	
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public Stock getStock() {
		return stock;
	}
	public void setStock(Stock stock) {
		this.stock = stock;
	}
	
	
	public Mueble(int id, String nombre, int cantidad_disponible, double precio, Stock stock) {
		this.id = id;
		this.nombre = nombre;
		this.cantidad_disponible = cantidad_disponible;
		this.precio = precio;
		this.stock = stock;
	}

	public void aumentaCantidad() {
		System.out.print("Introduce cuanto quieres aumentar: ");
		int aumento = sc.nextInt();
		sc.nextLine();
		cantidad_disponible += aumento;
	}
	
	public void disminuyeCantidad() {
		System.out.print("Introduce cuanto quieres disminuir: ");
		int disminuir = sc.nextInt();
		sc.nextLine();
		cantidad_disponible -= disminuir;
	}
	
	public String mostrarInfo() {
		String cad = "";
		cad += "El mueble "+nombre+" que está "+stock+" y vale "+precio;
		return cad;
	}
	
}
