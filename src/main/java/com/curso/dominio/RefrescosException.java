package com.curso.dominio;

public class RefrescosException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double cantidad;
	public RefrescosException(String msjError, double cantidad) {
		super(msjError);
		this.cantidad = cantidad;
	}
	public double getCantidad() {
		return cantidad;
	}
	
	
	
}
