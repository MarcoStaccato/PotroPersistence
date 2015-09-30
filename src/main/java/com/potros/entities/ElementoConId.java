package com.potros.entities;


public class ElementoConId {
	protected Integer id;
	protected String descripcion;
	
	public ElementoConId(Integer id, String descripcion){
		this.id=id;
		this.descripcion=descripcion;
	}
	
	public Integer getId(){
		return this.id;
	}

	public String getDescripcion(){
		return this.descripcion;
	}
}
