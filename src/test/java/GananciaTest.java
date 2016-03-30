package test.java;
import java.util.*;
import org.junit.Test;

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
		
		ventas.add(venta1);
		ventas.add(venta2);
		
		Ganancias ganancia = new Ganancias(ventas, new Date());
		System.out.println("ganancia del dia:" + ganancia.valorTotal());
		

	
}
}
