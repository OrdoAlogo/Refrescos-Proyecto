package com.curso.refrescos;

import java.util.ArrayList;

import com.curso.dominio.Dia;
import com.curso.dominio.DiarioVentas;
import com.curso.dominio.Refresco;
import com.curso.dominio.RefrescosException;
import com.curso.dominio.Venta;

public class Application
{
	public static void main( String[] args )
	{
		Refresco coca_cola,kas_naranja,kas_limon,sprite; 
		coca_cola =  new Refresco("Coca-Cola",1.5,14);
		kas_naranja =  new Refresco("Kas Naranja",0.55,32);
		kas_limon =  new Refresco("Kas Limón",0.65,40);
		sprite =  new Refresco("Sprite",1.2,31);
		
		try {
			sprite.reponer(1);
		} catch (RefrescosException e) {
			// TODO Auto-generated catch block
			System.out.println("Inserte cantidad valida");
		}
		
		Dia lunes = new Dia("Lunes");
		lunes.addVentas(sprite, 0);
		lunes.addVentas(kas_limon, 0);
		lunes.addVentas(coca_cola, 0);
		
		Dia martes = new Dia("Martes");
		martes.addVentas(coca_cola, 0);
		martes.addVentas(kas_naranja, 0);
		martes.addVentas(kas_limon, 0);
		
		DiarioVentas diario = new DiarioVentas();
		diario.generarInforme(lunes);
		diario.generarInforme(martes);
		
		
	}
}