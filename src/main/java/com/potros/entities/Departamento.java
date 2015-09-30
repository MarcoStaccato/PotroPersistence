package com.potros.entities;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

public class Departamento extends ElementoConId implements Serializable {
    
    private ArrayList <Articulo> articulos ;
    
	private static final long serialVersionUID = 1L;
    private Integer id_depto;
    private String nombre;
    
    public Departamento(String descripcion, Integer id) {
		super(descripcion, id);
		this.id_depto=id;
		this.nombre=descripcion;
	}
 
    public void agregarArticulo(Articulo a){
    	articulos.add(a);
    }
    
    public void eliminaArticulo(Articulo a){
    	articulos.remove(a);
    }

    public int getId() {
        return id_depto;
    }

    public void setId(Integer id) {
        this.id_depto = id;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void eliminaArticulo(Articulo a){
    	articulos.remove(a);
    }
}
