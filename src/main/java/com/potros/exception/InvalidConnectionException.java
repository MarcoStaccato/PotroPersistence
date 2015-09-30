package com.potros.exception;

public class InvalidConnectionException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public InvalidConnectionException() {
		try{
	         Exception e = new Exception("Error al encontrar el medio de almacenamiento");
	         throw e;
        }
        catch(Exception excepcion){
	         excepcion.printStackTrace();
        }
	}

}
