package com.curso.dominio;

public class Venta {
	private Refresco refresco;
	private int cantidad;

	
	//Constructor
	public Venta(Refresco refresco, int cantidad) {
		super();
		this.refresco = refresco;
		this.cantidad = 1;
		
		
	}
	
	//Getters and Setters
	public Refresco getRefresco() {
		return refresco;
	}

	public int getCantidad() {
		return cantidad;
	}
	
	//Metodo para comprobar el stock
	/*public boolean comprobarStock(int cantidad) {
		
		if(this.refresco.getStock()>cantidad) {
			return true;
		}else {
			return false;
		}
			
	}
	
	public void vender(Refresco r, int cantidad) {
		if(comprobarStock(cantidad)) {
			
		}
	}*/


		
}
