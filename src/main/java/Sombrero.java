package main.java;


public class Sombrero extends Productos {
//	int 

	
	public Sombrero(Origen origen,int coeficienteDeMetrosexualidad, Marca marca){ //constructor
		this.origen = origen;
		this.precioBase = 150*(1+coeficienteDeMetrosexualidad);
		this.marca = marca;
	}

	
}
