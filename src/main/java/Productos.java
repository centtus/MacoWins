package main.java;

public abstract class Productos {
	
	protected float valorFijoNegocio;
	
	abstract int getPrecioBase();
	abstract boolean esImportada();
	
	private float impuestoImportacion(){
		int base = this.getPrecioBase();
		float impuesto = base * 30/100;
		return base + impuesto;
	}
	
	public float precioFinal(){
		float precioFin;
		if (this.esImportada()){
			precioFin = (float) this.valorFijoNegocio + this.impuestoImportacion(); 
		} else {
			precioFin = (float) this.valorFijoNegocio + this.getPrecioBase();
		}
		return precioFin;
	}
	
}
