package main.java;
import main.java.Origen;

public abstract class Productos {

	protected float valorFijoNegocio;
	protected Marca marca;

	protected double precioBase;

	protected Origen origen;

	public double precioFinal() {
		return (this.valorFijoNegocio +this.precioBase) * this.origen.coeficiente();
	}

	public double getPrecioBase() {
		return this.precioBase;
	}



}
