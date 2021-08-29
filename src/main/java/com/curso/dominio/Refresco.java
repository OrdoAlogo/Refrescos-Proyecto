package com.curso.dominio;

public class Refresco {
	private String nombre;
	private double precio;
	private int stock;
	
	
	public Refresco(String nombre, double precio, int stock) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
		
	}

	public double getPrecio() {
		return precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getNombre() {
		return nombre;
	}

	public void reponer(int cantidad) throws RefrescosException {
		
		if(cantidad < 0) {
			throw new RefrescosException("Insete cantidad valida",(-0));
		}
		if(cantidad > 0) {
			System.out.println("El Stock de "+this.nombre+" actualizado");
			System.out.println("Stock Anterior: "+this.stock);
			this.stock = this.stock + cantidad;
			System.out.println("Stock Actual: "+this.stock);
		}
	}
	
}
