package com.potros.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USUARIO")
public class Usuario extends ElementoConId implements Serializable {
    
	private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID")
    private Integer id;
    
    @Column(name = "NOMBRE")
    private String nombre;
    
    @Column(name = "PASS")
    private String pass;

   
    public Usuario(String descripcion, Integer id,String nombre, String pass) {
		super(descripcion, id);
		this.id = id;
        this.nombre = nombre;
        this.pass = pass;
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

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Usuario[ id=" + id + " ]";
    }
    
}
