package test.java;

import org.junit.Assert;
import org.junit.Test;
import main.java.Camisa;
import main.java.Marca;
import main.java.Origen;
import main.java.Pantalon;
import main.java.Productos;
import main.java.Saco;
import main.java.Sombrero;

public class PrecioTest {
	
	
	Productos camisa = new Camisa(Origen.NACIONAL,Marca.ARMANI);
	Productos pantalon = new Pantalon(Origen.IMPORTADA,25,Marca.SINMARCA);
	Productos saco = new Saco(Origen.IMPORTADA,4,Marca.SARKANY);
	Productos sombrero = new Sombrero(Origen.NACIONAL,6,Marca.ARMANI);
	

	
	
	
	@Test
	 public void PrecioFinalCamisaNacionalArmani528(){ 
		//(120 ValorFijoNegocio + 200 PrecioBase)*1,65 Armani
		Assert.assertEquals(camisa.precioFinal(),528.0,0);
	}

	@Test
	 public void PrecioFinalPantalonImportadoSinMarca(){ 
		//(120 + 250 + 25) * 1,3
		Assert.assertEquals(pantalon.precioFinal(),513.5,0);
	}

	@Test
	 public void PrecioFinalSacoImportado4BotonesSarkany(){
		//(120+300+40)*1.3*1.35
		Assert.assertEquals(saco.precioFinal(),807.3,0.0001);
	}
	
	@Test
	 public void PrecioFinalSombreroNacional6MetrosexualidadArmani(){
		//(120+150*(1+6))*1,65
		Assert.assertEquals(sombrero.precioFinal(),1930.5,0);
	}
	
	
}
