package main.java;


public class Saco extends Productos {
	int precioBase = 300;
	Boolean importada;
	
	public Saco(Boolean imp){ //constructor
		this.importada = imp;
	}
	
	public int getPrecioBase(){
		return this.precioBase;
	}
	
	boolean esImportada(){
		return this.importada;
	}

	public int precioFinal(){
		
			int precioFinal = this.getValorFijoNegocio() + this.precioBase;
			return precioFinal;
		}
	
}
