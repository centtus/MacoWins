package main.java;

public enum Origen {
	
	IMPORTADA {
	    public double coeficiente(){
	    	return 1.3;    	
	    }		
	},
	
	NACIONAL {
	    public double coeficiente(){
	    	return 1.3;    	
	    }		
	};
	
	abstract public double coeficiente();
	
};  