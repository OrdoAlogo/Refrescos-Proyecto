package com.curso.dominio;

public class Dia {
	private String nombre;
	private Venta[] ventas;
	private int numVentas;
	public Dia(String nombre) {
		super();
		this.ventas = new Venta[7];
		this.numVentas = 0;
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	
	public int getNumVentas() {
		return numVentas;
	}

	public void addVentas(Refresco refresco, int cantidad) {
		
		int posicion = numVentas++;
		ventas[posicion] = new Venta(refresco,cantidad);
		
	}
	
	public Venta getVenta(int posicion) {
		return this.ventas[posicion];
		
	}
}
