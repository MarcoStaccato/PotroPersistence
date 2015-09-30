package com.potros.exception;

public class UserNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 783602861213674185L;

	public UserNotFoundException(){
		try{
	         Exception e = new Exception("Usuario no encontrado");
	         throw e;
        }
        catch(Exception excepcion){
	         excepcion.printStackTrace();
        }
	}

}
