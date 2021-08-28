package com.curso.dominio;

public class DiarioVentas {
	
	private Dia dia;
	public DiarioVentas() {
		
	}

	public Dia getDia() {
		return dia;
	}
	
	public void generarInforme(Dia dia) {
		System.out.println("---------------------");
		System.out.println("Informe del "+ dia.getNombre());
		
		for(int i_venta = 0; i_venta<dia.getNumVentas(); i_venta++) {
			Venta venta = dia.getVenta(i_venta);
			
			System.out.println(venta.getRefresco().getNombre() +" Precio: "+venta.getRefresco().getPrecio() +
					" Unidades: "+venta.getCantidad() + " Bruto: "+(venta.getRefresco().getPrecio()*venta.getCantidad()) );
			//Devolucion del cambio
			if(venta.verificarElPago(venta) && venta.comprobarStock(venta)) {
				double cambio = 0;
				double importe = venta.getCantidad()*venta.getRefresco().getPrecio();
				cambio = venta.getEfectivo() - importe;
				System.out.println("Entregado: "+venta.getEfectivo()+" €"+", Cambio: "+cambio+" €");
			}
			System.out.println();
		}
	}
	

	
	
	
	

}
