package com.curso.dominio;

public class PagosException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private double importe;

	public PagosException(String msjError,double importe) {
		super(msjError);
		this.importe = importe;
	}

	public double getImporte() {
		return importe;
	}
	
	
	
}
