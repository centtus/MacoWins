package test.java;
import java.util.*;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import junit.framework.*;
import main.java.Camisa;
import main.java.Pantalon;
import main.java.Productos;
import main.java.Saco;

import main.java.Camisa;
import main.java.Productos;
import main.java.Venta;
import main.java.Ganancias;
import main.java.Pantalon;


public class GananciaTest {

	
	@Test
	public void test() {

		List<Venta> ventas = new ArrayList<>();
		
		Productos camisa = new Camisa(true);
		Productos pantalon = new Pantalon(true);
		
		Venta venta1 = new Venta(camisa,5);
		Venta venta2 = new Venta(pantalon,2);
	
		Date date = new GregorianCalendar(1999, 8, 8).getTime();System.out.println(date);venta1.setFechaDeVenta(date);

		
		
		ventas.add(venta1);
		ventas.add(venta2);
		
		Ganancias ganancia = new Ganancias(ventas, new Date());
		Assert.assertEquals(ganancia.valorTotal(),650);
		

	
}
}
