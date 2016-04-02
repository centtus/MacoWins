package test.java;
import main.java.Camisa;
import main.java.Productos;
import org.junit.Assert;

import main.java.Venta;


import org.junit.Test;

public class VentaTest {


	@Test
	public void test() {
//		Ganancias ganancia = new Ganancias();
		Productos camisa = new Camisa(true);
		Venta venta = new Venta(camisa,5);
		Camisa camisa2 = (Camisa) venta.getProducto();
		
		Assert.assertEquals(camisa2.precioFinal(),260,0);
		
	
		
		
		
	}

}
