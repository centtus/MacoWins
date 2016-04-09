package main.java;

public enum Marca {
	
	ARMANI {
	    public double politicaDePrecios(double precio){
	    	return precio*1.65;    	
	    }		
	},
	SINMARCA {
	    public double politicaDePrecios(double precio){
	    	return precio;    	
	    }		
	},
	
	SARKANY {
	    public double politicaDePrecios(double precio){
	    	if(precio>500) return precio*1.35; return precio*1.1; 	
	    }		
	};
	
	abstract public double politicaDePrecios(double precios);
	
};  
