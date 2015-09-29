package com.potros.entities;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "DEPARTAMENTO")
public class Departamento extends ElementoConId implements Serializable {
    
    private ArrayList <Articulo> articulos ;
    
	private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "NOMBRE")
    private String nombre;
    
    public Departamento(String descripcion, Integer id) {
		super(descripcion, id);
		// TODO Auto-generated constructor stub
	}
 
    public void agregarArticulo(Articulo a){
    	articulos.add(a);
    }
    
    public void eliminaArticulo(Articulo a){
    	articulos.remove(a);
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Departamento[ id=" + id + " ]";
    }
    
}
