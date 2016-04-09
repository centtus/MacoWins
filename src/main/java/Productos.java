package main.java;
import main.java.Origen;

public abstract class Productos {

	protected float valorFijoNegocio;
	Marca marca;

	double precioBase;

	Origen origen;

	public double precioFinal() {
		return (this.valorFijoNegocio +this.precioBase) * this.origen.coeficiente();
	}

	public double getPrecioBase() {
		return this.precioBase;
	}



}
