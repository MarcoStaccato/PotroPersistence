package com.potros.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

public class Articulo extends ElementoConId implements Serializable{
	
    private static final long serialVersionUID = 1L;
    
    
    
    private double precio;
    private int iddepartamento;
 
    public Articulo(String descripcion, Integer id,double precio, int iddepartamento) {
		super(id,descripcion);
		this.iddepartamento=iddepartamento;
		this.precio=precio;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getDepartamento() {
		return iddepartamento;
	}

	public void setDepartamento(int iddepartamento) {
		this.iddepartamento = iddepartamento;
	}
	
}