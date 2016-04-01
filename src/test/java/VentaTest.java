package test.java;

import java.util.Date;
import main.java.Camisa;
import main.java.Productos;
import org.junit.Assert;

import main.java.Venta;

import org.junit.Assert;
import org.junit.Test;

public class VentaTest {

	@SuppressWarnings("deprecation")
	@Test
	public void test() {
//		Ganancias ganancia = new Ganancias();
		Productos camisa = new Camisa(true);
		Venta venta = new Venta(camisa,5);
		Camisa camisa2 = (Camisa) venta.getProducto();
		
		Assert.assertEquals(camisa2.precioFinal(),260,0);
		
	
		
		
		
	}

}
