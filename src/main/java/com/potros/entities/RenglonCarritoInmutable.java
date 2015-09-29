package com.potros.entities;

public class RenglonCarritoInmutable {
	protected Articulo articulo;
	protected Integer cantidad;
	
	RenglonCarritoInmutable(Articulo art, Integer cant){
		this.articulo=art;
		this.cantidad=cant;
	}
	
	public Articulo getArticulo(){
		return this.articulo;
	}
	
	public Integer getCantidad(){
		return cantidad;
	}
	
	public boolean equals(Object o){
		return o.getClass().equals(this.getClass());
	}
}
