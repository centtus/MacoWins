
public class Camisa extends Productos {
	int precioBase = 200;
	Boolean importada;
	
	int getPrecioBase(){
		return this.precioBase;
	}
	
	boolean esImportada(){
		return this.importada;
	}
}
