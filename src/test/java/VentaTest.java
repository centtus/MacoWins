package test.java;

import java.util.Date;
import main.java.Camisa;
import main.java.Productos;
import main.java.Venta;

import org.junit.Test;

public class VentaTest {

	@Test
	public void test() {
//		Ganancias ganancia = new Ganancias();
		Productos camisa = new Camisa(true);
		Venta venta = new Venta(camisa,5);
		Camisa camisa2 = (Camisa) venta.getProducto();
		System.out.println("precio final camisa:" +camisa2.precioFinal());
		
		
		
	}

}
