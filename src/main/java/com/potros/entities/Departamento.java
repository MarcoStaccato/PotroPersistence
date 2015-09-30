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
   
    
    public Departamento(String descripcion, Integer id) {
		super(id, descripcion);
		articulos = new ArrayList<Articulo>();
	}
 
    public void agregarArticulo(Articulo a){
    	articulos.add(a);
    }
    
        
    public void eliminaArticulo(Articulo a){
    	articulos.remove(a);
    }
}
