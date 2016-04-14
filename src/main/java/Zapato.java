package main.java;

public class Zapato extends Productos{
		
		public Zapato(Origen origen, int talle,Marca marca){
			this.precioBase = 400 + (5 * talle);
			this.marca = marca;
			this.origen = origen;
		}
}
