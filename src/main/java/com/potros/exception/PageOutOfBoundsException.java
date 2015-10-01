package com.potros.exception;

public class PageOutOfBoundsException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public PageOutOfBoundsException(){
		try{
	         Exception e = new Exception("Pagina fuera de rango");
	         throw e;
        }
        catch(Exception excepcion){
	         excepcion.printStackTrace();
        }

	}

}
