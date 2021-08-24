package com.curso.refrescos;

import com.curso.dominio.Refresco;
import com.curso.dominio.Venta;

public class Application
{
	public static void main( String[] args )
	{
		Refresco r1 = new Refresco(1.3,1.0,"Naranja",false,15);
		
		r1.reponer(4);
		System.out.println(r1);
		
		//Venta(refresco,unidades,efectivo)
		Venta v1 = new Venta(r1, 5, 10.0);
		v1.facturar(r1.getPrecio(), v1.getUnidades());
		v1.pago(v1.getEfectivo(), (v1.getUnidades()*r1.getPrecio()) );
		
		
		Venta v2 = new Venta(r1, 10, 100.0);
		v2.facturar(r1.getPrecio(), v2.getUnidades());
		v2.pago(v2.getEfectivo(), (v2.getUnidades()*r1.getPrecio()) );
		
		
		
	}
}