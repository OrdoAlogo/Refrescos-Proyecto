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
	//Metodo para verificar el pago (Osea si el efectivo es mayor al importe o igual)
	public boolean verificarElPago(Venta venta) {
		boolean resultado = false;
		double importeV = venta.getRefresco().getPrecio()*venta.getCantidad();
		double efectivo = venta.getEfectivo();
		
		if(efectivo < importeV) {
			System.out.println();
			resultado = false;
		}else {
			resultado = true;
		}
		return resultado;
	}
	//Metodo para comprobar el stock
	public boolean comprobarStock(Venta venta) {
		
		boolean resultado = false;
		
		if(venta.getRefresco().getStock() < venta.getCantidad()) {
			resultado = false;
			System.out.println(venta.getRefresco().getNombre()+" agotado, lo sentimos");
		}else {
			
			resultado = true;
			int stockAnterior = venta.getRefresco().getStock();
			int cantidad = venta.getCantidad();
			int stockActual = stockAnterior - cantidad;
			venta.getRefresco().setStock(stockActual);
			
		}
		return resultado;
		
	}
	
	//Metodo para devolver el cambio
	 


		
}
