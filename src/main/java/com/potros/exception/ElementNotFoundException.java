package com.potros.exception;

public class ElementNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public ElementNotFoundException(){
		try{
	         Exception e = new Exception("Elemento no encontrado");
	         throw e;
        }
        catch(Exception excepcion){
	         excepcion.printStackTrace();
        }
	}

}
