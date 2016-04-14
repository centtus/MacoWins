package test.java;
import main.java.Camisa;
import main.java.Marca;
import main.java.Origen;
import main.java.Pantalon;
import main.java.Productos;


import org.junit.Assert;

import main.java.Venta;


import org.junit.Test;

public class VentaTest {
	
	Productos camisa = new Camisa(Origen.NACIONAL,Marca.ARMANI);
	Productos pantalon = new Pantalon(Origen.IMPORTADA,1,Marca.SINMARCA);
	
	
	Venta venta1 = new Venta(camisa,5);
	Venta venta2 = new Venta(pantalon,2);
	
	
	
	@Test
	public void Venta5CamisasNacionalArmani2640() {
		Assert.assertEquals(venta1.gananciaDeLaVenta(),2640.0,0);
	}

	@Test
	public void Venta2PantalonesImportadosSinMarca() {
		Assert.assertEquals(venta2.gananciaDeLaVenta(),964.6,0);
	}
	
}
