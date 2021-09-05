package com.curso.refrescos;

import java.util.ArrayList;

import com.curso.dominio.Dia;
import com.curso.dominio.DiarioVentas;
import com.curso.dominio.PagosException;
import com.curso.dominio.Refresco;
import com.curso.dominio.RefrescosException;
import com.curso.dominio.StockException;
import com.curso.dominio.Venta;

public class Application
{
	public static void main( String[] args )
	{
		Refresco coca_cola,kas_naranja,kas_limon,sprite; 
		coca_cola =  new Refresco("Coca-Cola",1.5,1);
		kas_naranja =  new Refresco("Kas Naranja",0.55,32);
		kas_limon =  new Refresco("Kas Limón",0.65,40);
		sprite =  new Refresco("Sprite",1.2,31);
		
		try {
			sprite.reponer(1);
		} catch (RefrescosException e) {
			// TODO Auto-generated catch block
			System.out.println("Inserte cantidad valida");
		}
		
		Venta v1,v2,v3,v4,v5,v6,v7,v8;
		v1 = new Venta(sprite, 0,1.25);
		v2 = new Venta(kas_limon, 0,2);
		v3 = new Venta(coca_cola, 0,3);
		v4 = new Venta(kas_naranja,0,1);
		v5 = new Venta(coca_cola, 0,1.0);
		v6 = new Venta(kas_naranja, 0,0.5);
		v7 = new Venta(sprite, 0,2);
		v8 = new Venta(kas_limon,0,3.0);
		
		
		Dia lunes = new Dia("Lunes");
		Dia martes = new Dia("Martes");
		
		//Si la verificacion del pago y el stcok de una venta resulta ser false, 
		//Esta venta no se realiza y por tanto no se añade en las ventas del dia
		lunes.addVentas(v1);
		lunes.addVentas(v2);
		lunes.addVentas(v3);
		lunes.addVentas(v4);
		
		martes.addVentas(v5);
		martes.addVentas(v6);
		martes.addVentas(v7);
		martes.addVentas(v8);
			
		DiarioVentas diario = new DiarioVentas();
		diario.generarInforme(lunes);
		System.out.println("Ventas totales del "+lunes.getNombre()+": "+lunes.totalVentas()+" €"+" Refrescos vendidos: "+lunes.refrescosVendidos());
		diario.generarInforme(martes);
		System.out.println("Ventas totales del "+martes.getNombre()+": "+martes.totalVentas()+" €"+" Refrescos vendidos: "+martes.refrescosVendidos());
		
		
		
	}
}