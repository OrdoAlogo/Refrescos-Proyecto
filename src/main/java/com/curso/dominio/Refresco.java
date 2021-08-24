package com.curso.dominio;

public class Refresco {
	private double precio;
	private double cl;
	private String sabor;
	private boolean agotado;
	private int stock;
	
	public Refresco(double precio, double cl, String sabor, boolean agotado, int stock) {
		super();
		this.precio = precio;
		this.cl = cl;
		this.sabor = sabor;
		this.agotado = agotado;
		this.stock = stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	

	public boolean isAgotado() {
		return agotado;
	}

	public void setAgotado(boolean agotado) {
		this.agotado = agotado;
	}

	public double getCl() {
		return cl;
	}


	public int getStock() {
		return stock;
	}

	public String getSabor() {
		return sabor;
	}
	
	public void reponer(int cantidad) {
		
		if(cantidad < 0) {
			System.out.println("Introduzca un valor positivo");
		}
		if(cantidad > 0) {
			this.stock += this.stock + cantidad;
			System.out.println("Stock actualizado");
		}
	}

	@Override
	public String toString() {
		return "Refresco: " + precio + ", cl: " + cl + ", sabor: " + sabor + ", agotado: " + agotado + ", stock:"
				+ stock;
	}
	
	
	
}
