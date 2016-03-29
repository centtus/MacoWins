package main.java;


public class Pantalon extends Productos {
	int precioBase = 250;
	Boolean importada;
	
	public Pantalon(Boolean imp){ //constructor
		this.importada = imp;
	}
	
	public int getPrecioBase(){
		return this.precioBase;
	}
	
	boolean esImportada(){
		return this.importada;
	}
}
