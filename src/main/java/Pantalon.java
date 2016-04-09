package main.java;


public class Pantalon extends Productos {

	
	public Pantalon(Origen origen,int cm,Marca marca){ //constructor
		this.origen = origen;
		this.marca=marca;
		this.precioBase = 250+cm;
	}
	

}
