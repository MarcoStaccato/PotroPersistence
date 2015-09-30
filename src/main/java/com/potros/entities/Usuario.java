package com.potros.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

public class Usuario extends ElementoConId implements Serializable {

	private static final long serialVersionUID = 1L;
	private String nombre;
	private String password;
	private int edad;

	
	public Usuario(String descripcion, Integer id, String nombre, String pass, int edad) {
		super(id, descripcion);
		this.nombre = nombre;
		this.password = pass;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String pass) {
		this.password = pass;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int ed) {
		this.edad = ed;
	}
=======

public class Usuario extends ElementoConId implements Serializable {
    
	private static final long serialVersionUID = 1L;
    private Integer id_usuario;
    private String nombre;
    private String pass;

   
    public Usuario(String descripcion, Integer id,String nombre, String pass) {
		super(descripcion, id);
		this.id_usuario = id;
        this.nombre = nombre;
        this.pass = pass;
	}
    

    public int getId() {
        return id_usuario;
    }

    public void setId(Integer id) {
        this.id_usuario = id;
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
}
