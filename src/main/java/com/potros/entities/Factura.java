package com.potros.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


public class Factura implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private int idcompra;
    private int idusuario;
    private Date fecha;

    public Factura() {
    }

    public Factura(Integer id) {
        this.id = id;
    }

    public Factura(Integer id, int idcompra, int idusuario, Date fecha) {
        this.id = id;
        this.idcompra = idcompra;
        this.idusuario = idusuario;
        this.fecha = fecha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdcompra() {
        return idcompra;
    }

    public void setIdcompra(int idcompra) {
        this.idcompra = idcompra;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    @Override
    public String toString() {
        return "Factura[ id=" + id + " ]";
    }
    
}