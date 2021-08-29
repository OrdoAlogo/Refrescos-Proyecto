package com.curso.dominio;

public class RefrescosException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int cantidad;
	public RefrescosException(String msjError, int cantidad) {
		super(msjError);
		this.cantidad = cantidad;
	}
	public int getCantidad() {
		return cantidad;
	}
	
	
	
}
