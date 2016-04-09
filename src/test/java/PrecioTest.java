package test.java;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import main.java.Camisa;
import main.java.Pantalon;
import main.java.Productos;
import main.java.Saco;

public class PrecioTest {

	Saco saco;
	Camisa camisa;
	Pantalon pantalon1;
	Pantalon  pantalon2;
	Productos maco;
	
	@Before
	  public void setup() {
	  
	   
	  

	  }
	
	@Test
	 public void PrecioBaseSaco300(){
	//	Saco saco = new Saco(true);
	//	Assert.assertEquals(saco.getPrecioBase(),300);
	}

	@Test
	 public void PrecioBasePantalon250(){
	//	Pantalon pantalon1 = new Pantalon(true);
	//	Assert.assertEquals(pantalon1.getPrecioBase(),250);
	}

	@Test
	 public void PrecioBaseCamisa200(){
	//	Camisa camisa = new Camisa(false);
		//Assert.assertEquals(camisa.getPrecioBase(),200);
	}
	
}
