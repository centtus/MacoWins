package main.java;


public class Camisa extends Productos {
	int precioBase = 200;
	Boolean importada;
	
	public Camisa(Boolean imp){ //constructor
		this.importada = imp;
	}
	
	public int getPrecioBase(){
		return this.precioBase;
	}
	
	boolean esImportada(){
		return this.importada;
	}
}
