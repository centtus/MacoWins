
public abstract class Productos {
	int valorFijoNegocio;
	
	
	abstract int getPrecioBase();
	abstract boolean esImportada();
	
	int precioFinal(){
		if (this.esImportada()){
			int precioFinal = (this.valorFijoNegocio + this.getPrecioBase()) * 30/100;
			return precioFinal;
		} else{
			int precioFinal = (this.valorFijoNegocio + this.getPrecioBase());
			return precioFinal;
		}
	}

	
}
