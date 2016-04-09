package main.java;


public class Saco extends Productos {
//	int 

	
	public Saco(Origen origen,int botones, Marca marca){ //constructor
		this.origen = origen;
		this.precioBase = 300+10*botones;
		this.marca = marca;
	}

	
}
