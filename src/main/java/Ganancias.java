package main.java;

import java.util.Date;
import java.util.*;
import java.util.stream.*;
import java.text.SimpleDateFormat;





import main.java.Venta;


public class Ganancias {
	int valor=0;
	Date fecha;
	List<Venta> ventas = new ArrayList<>();
	

	

	public Ganancias(List <Venta> listaVentas, Date fechaAnalisis){
		this.fecha = fechaAnalisis;
		this.ventas = listaVentas;

		 SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMdd");

		this.ventas=this.ventas.stream().filter(item -> fmt.format(item.getDate()).equals(fmt.format(fechaAnalisis))).collect(Collectors.toList());

	}
	
	public int valorTotal(){
		
		this.ventas.forEach(item->this.valor+=item.gananciaDeLaVenta());
		return this.valor;
		/* ver como usar map
		this.ventas.map(new Function<Venta>() {
          this.valor=1;
        });
	
	*/
		
		//return this.precioBase;
	}
	
}

