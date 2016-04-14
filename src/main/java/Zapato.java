package main.java;

public class Zapato extends Productos{
		
		public Zapato(int talle){
			this.precioBase = 400 + (5 * talle);
		}
}
