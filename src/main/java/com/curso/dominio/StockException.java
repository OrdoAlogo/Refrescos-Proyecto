package com.curso.dominio;

public class StockException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int cantidad;
	public StockException(String msjError, int cantidad) {
		super(msjError);
		this.cantidad = cantidad;
	}
	public int getCantidad() {
		return cantidad;
	}
	
	

}
