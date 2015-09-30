package com.potros.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

public class Articulo extends ElementoConId implements Serializable{
	
    private static final long serialVersionUID = 1L;
    private Integer id_Articulo;
    private String nombre;
	private String descripcion;
    private double precio;
    private int iddepartamento;
 
    public Articulo(String descripcion, Integer id,String nombre,double precio, int iddepartamento) {
		super(descripcion, id);
		this.id_Articulo=id;
		this.nombre=nombre;
		this.iddepartamento=iddepartamento;
		this.precio=precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getIddepartamento() {
		return iddepartamento;
	}

	public void setIddepartamento(int iddepartamento) {
		this.iddepartamento = iddepartamento;
	}
	public Integer getId_Articulo() {
		return id_Articulo;
	}

	public void setId_Articulo(Integer id_Articulo) {
		this.id_Articulo = id_Articulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}   

  
    
}