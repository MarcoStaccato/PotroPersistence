package com.potros.exception;

public class DepartmentNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public DepartmentNotFoundException(){
		try{
	         Exception e = new Exception("Departamento no encontrado");
	         throw e;
        }
        catch(Exception excepcion){
	         excepcion.printStackTrace();
        }
	}
}
