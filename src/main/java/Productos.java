package main.java;


public abstract class Productos {
	 public int valorFijoNegocio;
	
	
	 abstract int getPrecioBase();
	 abstract boolean esImportada();
	
	
	public int precioFinal(){
		if (this.esImportada()){
			int precioFinal = (this.getValorFijoNegocio() + this.getPrecioBase()) * 30/100;
			return precioFinal;
		} else{
			int precioFinal = (this.getValorFijoNegocio() + this.getPrecioBase());
			return precioFinal;
		}
	}
	
	public int getValorFijoNegocio() {
		return valorFijoNegocio;
	}
	
	public void setValorFijoNegocio(int valorFijoNegocio) {
		this.valorFijoNegocio = valorFijoNegocio;
	}

	
}
