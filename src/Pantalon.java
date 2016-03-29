
public class Pantalon extends Productos {
	int precioBase = 250;
	Boolean importada;
	
	int getPrecioBase(){
		return this.precioBase;
	}
	
	boolean esImportada(){
		return this.importada;
	}
}
