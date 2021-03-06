package main.java;
import java.util.Date;

public class Venta {

	private Date fechaDeVenta = new Date();
	private Productos producto;
	private int cantidad;
	
	public Venta(Productos nuevoProducto, int cant){
		this.producto = nuevoProducto;
		this.cantidad = cant;
	}
	
	public double gananciaDeLaVenta(){
		return producto.precioFinal() * cantidad;
	}

	public Date getFechaDeVenta() {
		return fechaDeVenta;
	}

	public void setFechaDeVenta(Date fechaDeVenta) {
		this.fechaDeVenta = fechaDeVenta;
	}

	public Productos getProducto() {
		return producto;
	}
	public Date getDate(){
		return this.fechaDeVenta;
		
	}
	public void setProducto(Productos producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
}
