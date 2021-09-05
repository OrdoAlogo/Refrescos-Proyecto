package com.curso.dominio;

public class Venta {
	private Refresco refresco;
	private int cantidad;
	private double efectivo;

	
	//Constructor
	public Venta(Refresco refresco, int cantidad, double efectivo) {
		super();
		this.refresco = refresco;
		this.cantidad = 1;
		this.efectivo = efectivo;
		
		
	}
	
	//Getters and Setters
	public Refresco getRefresco() {
		return refresco;
	}

	public int getCantidad() {
		return cantidad;
	}

	public double getEfectivo() {
		return efectivo;
	}
		
}
