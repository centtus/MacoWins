package main.java;
import main.java.Origen;

public abstract class Productos {

	float valorFijoNegocio = (float) 120.0;
	protected Marca marca;

	protected double precioBase;

	protected Origen origen;

	public double precioFinal() {
		return this.marca.politicaDePrecios((this.getValorFijoNegocio() +this.precioBase) * this.origen.coeficiente());
	}

	public double getPrecioBase() {
		return this.precioBase;
	}

	public float getValorFijoNegocio() {
		return valorFijoNegocio;
	}

	



}
