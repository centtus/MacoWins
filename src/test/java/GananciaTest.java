package test.java;
import java.util.*;

import org.junit.Test;
import org.junit.Assert;

import main.java.Camisa;
import main.java.Pantalon;
import main.java.Productos;
import main.java.Venta;
import main.java.Libro;
import main.java.Marca;
import main.java.Origen;



public class GananciaTest {

	
	@Test
	public void test() {

		List<Venta> ventas = new ArrayList<>();
		
		Productos camisa = new Camisa(Origen.NACIONAL,Marca.SINMARCA);
		Productos pantalon = new Pantalon(Origen.NACIONAL,1,Marca.SINMARCA);
		
		Venta venta1 = new Venta(camisa,5);
		Venta venta2 = new Venta(pantalon,2);
	
		Date date = new GregorianCalendar(1999, 8, 8).getTime();venta1.setFechaDeVenta(date);

		
		ventas.add(venta1);
		ventas.add(venta2);
		
		Libro libro = new Libro(ventas);
		// System.out.println(libro.gananciaDelDia());
	//	Assert.assertEquals(libro.gananciaDelDia(),651.0,0);
		
	}
}
