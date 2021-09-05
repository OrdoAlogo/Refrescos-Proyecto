package com.curso.dominio;

public class Dia {
	private String nombre;
	private Venta[] ventas;
	private int numVentas;
	private double totalVentas;
	private double totalRefrescos;
	
	public Dia(String nombre) {
		super();
		this.ventas = new Venta[7];
		this.numVentas = 0;
		this.nombre = nombre;
		this.totalVentas = totalVentas;
		this.totalRefrescos = totalRefrescos;
		
	}
	
	public String getNombre() {
		return nombre;
	}
	
	
	public int getNumVentas() {
		return numVentas;
	}

	public void addVentas(Venta venta) /*throws StockException, PagosException*/{
		
		//Primero Verificamos el Stock
		if(venta.getRefresco().getStock() < venta.getCantidad()) {
			
			/*throw new StockException("Producto agotado",venta.getCantidad()-venta.getRefresco().getStock());*/
			System.out.println("Stock de "+venta.getRefresco().getNombre()+" agotado");
		}
		else {
			
			double importeV = venta.getRefresco().getPrecio()*venta.getCantidad();
			double efectivo = venta.getEfectivo();
			//Ahora Verificamos el Pago
			if(efectivo < importeV) {
				
				/*throw new PagosException("Dinero insuficiente",importeV-efectivo);*/
				System.out.println("Dinero insuficiente, entregado: "+efectivo+"€ "+", Importe compra: "+importeV+" Compra CANCELADA");
			
			}else {
				
				int stockAnterior = venta.getRefresco().getStock();
				int cantidad = venta.getCantidad();
				int stockActual = stockAnterior - cantidad;
				venta.getRefresco().setStock(stockActual);
				
				int posicion = numVentas++;
				ventas[posicion] = new Venta(venta.getRefresco(), venta.getCantidad(), venta.getEfectivo());
	
			}
		}
		
		
	}
	
	public Venta getVenta(int posicion) {
		return this.ventas[posicion];
		
	}

	public double totalVentas() {
		double total = 0;
		for(int i = 0; i<this.ventas.length; i++) {
			if(this.ventas[i] != null) {
				
				total += this.ventas[i].getRefresco().getPrecio()*this.ventas[i].getCantidad(); 
				this.totalVentas = total;
			}
			
		}
		return this.totalVentas;
	}
	
	public double refrescosVendidos() {
		double refrescos = 0;
		for(int i=0; i<ventas.length; i++) {
			if(this.ventas[i] != null) {
				refrescos += this.ventas[i].getCantidad();
				this.totalRefrescos = refrescos;
			}
		}
		return this.totalRefrescos;
	}

}
