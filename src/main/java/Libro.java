package main.java;

import java.util.Date;
import java.util.*;
import java.util.stream.*;
import java.text.SimpleDateFormat;





import main.java.Venta;


public class Libro {
	float valor=0;
	
	List<Venta> ventas = new ArrayList<>();
	

	

	public Libro(List <Venta> listaVentas){
		
		this.ventas = listaVentas;


	}
	
	public float gananciaDelDia(){
		
		 SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMdd");

		//this.ventas=this.ventas.stream().filter(item -> fmt.format(item.getDate()).equals(fmt.format(new Date()))).collect(Collectors.toList());
		
		Stream<Venta> ventasDia = this.ventas.stream().filter(item -> fmt.format(item.getDate()).equals(fmt.format(new Date())));
		
		//this.ventas.forEach(item->this.valor = (float) (this.valor + item.gananciaDeLaVenta()));
		ventasDia.forEach(item->this.valor = (float) (this.valor + item.gananciaDeLaVenta()));
		return this.valor;
		/* ver como usar map
		this.ventas.map(new Function<Venta>() {
          this.valor=1;
        });
	
	*/
		
		//return this.precioBase;
	}
	
}

