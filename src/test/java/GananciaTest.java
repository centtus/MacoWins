package test.java;
import java.util.*;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

import main.java.Camisa;
import main.java.Pantalon;
import main.java.Productos;
import main.java.Saco;
import main.java.Venta;
import main.java.Libro;
import main.java.Marca;
import main.java.Origen;



public class GananciaTest {


		List<Venta> ventas = new ArrayList<>();
		
		Productos camisa = new Camisa(Origen.NACIONAL,Marca.ARMANI);
		Productos pantalon = new Pantalon(Origen.IMPORTADA,1,Marca.SINMARCA);
		Productos saco = new Saco(Origen.IMPORTADA,4,Marca.SARKANY);
		
		
		Venta venta1 = new Venta(camisa,5);
		Venta venta2 = new Venta(pantalon,2);
		Venta venta3 = new Venta(saco,3);
		
		Date date = new GregorianCalendar(1999, 8, 8).getTime();
		Libro libro = new Libro(ventas);
		
		@Before
		public void setup(){
			venta1.setFechaDeVenta(date);
			ventas.add(venta1);
			ventas.add(venta2);
			ventas.add(venta3);
			
		}

		
		
		@Test
		 public void GananciasDelDia(){
			float ganancia = libro.gananciaDelDia();
			//venta2 y venta3
			Assert.assertEquals(ganancia,3386.5,0.001);
		}
		
		
	}
