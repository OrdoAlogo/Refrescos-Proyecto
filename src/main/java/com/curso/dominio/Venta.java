package com.curso.dominio;

public class Venta {
	private Refresco refresco;
	private int unidades;
	private double efectivo;
	
	private double ventasTotales;
	private int unidadesVendidas;
	
	//Constructor
	public Venta(Refresco refresco, int unidades, double efectivo) {
		super();
		this.refresco = refresco;
		this.unidades = unidades;
		this.efectivo = efectivo;
		
	}
	
	//Getters and Setters
	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	public double getEfectivo() {
		return efectivo;
	}

	public void setEfectivo(double efectivo) {
		this.efectivo = efectivo;
	}

	public Refresco getRefresco() {
		return refresco;
	}
	
	//Metodo para facturar
	public void facturar(double precio,int unidades) {
		
		if(comprobarStock(this.unidades) && this.refresco.isAgotado()==false) {
			
			double brutoF = precio*unidades;
			this.ventasTotales += brutoF;
			System.out.println("Precio: "+this.refresco.getPrecio()+", Cantidad: "+unidades+", Importe bruto: "+brutoF);
		}
		else {
			System.out.println("Producto Agotado");
		}
		
	}
	
	//Metodo para los pagos y devolucion de cambios
	public void pago(double efectivo, double importe) {
		
		if(comprobarStock(this.unidades)) {
			
			if(efectivoMayor(efectivo,importe)){
				double cambio = efectivo - importe;
				System.out.println("Entregado: "+efectivo+", Importe bruto: "+importe+", Cambio: "+cambio+" GRACIAS POR SU COMPRA" );
			}
			if(efectivoJusto(efectivo,importe)){
				
				System.out.println("Entregado: "+efectivo+", Importe bruto: "+importe+" GRACIAS POR SU COMPRA");
			}
			if(efectivoMenor(efectivo,importe)) {
				System.out.println("Lo sentimos, dinero insuficiente");
			}
		}
		else {
			System.out.println("Producto Agotado,Pago cancelado");
		}
		
	}
	
	//Metodo para comprobar el stock
	public  boolean comprobarStock(int unidades) {
		
		if(this.refresco.getStock() > unidades) {
			return true;
		}
		return false;
	}
	//Metodos para comprobar el dinero entregado para pagar
	public boolean efectivoMayor(double efectivo, double importe) {
		
		if(efectivo>importe) {
			return true;
		}
		return false;
	}
	public boolean efectivoJusto(double efectivo, double importe) {
		
		if(efectivo==importe) {
			return true;
		}
		return false;
	}
	public boolean efectivoMenor(double efectivo, double importe) {
		
		if(efectivo==importe) {
			return true;
		}
		return false;
	}
	

	@Override
	public String toString() {
		return  refresco + ", Cantidad" + unidades + ", Evectivo" + efectivo + "Euros";
	}
		
}
