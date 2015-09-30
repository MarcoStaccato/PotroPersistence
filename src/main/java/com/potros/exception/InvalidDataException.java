package com.potros.exception;

public class InvalidDataException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public InvalidDataException(){
		try{
	         Exception e = new Exception("Error de datos");
	         throw e;
        }
        catch(Exception excepcion){
	         excepcion.printStackTrace();
        }
	}

}
