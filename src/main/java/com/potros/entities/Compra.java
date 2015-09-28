package com.potros.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COMPRA")
public class Compra implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "IDCOMPRA")
    private Integer idcompra;
    
    @Column(name = "IDARTICULO")
    private int idarticulo;

    @Column(name = "CANTIDAD")
    private int cantidad;

    @Column(name = "FECHA")
    private Date fecha;

    public Compra() {
    }

    public Compra(Integer idcompra) {
        this.idcompra = idcompra;
    }

    public Compra(Integer idcompra, int idarticulo, int cantidad, Date fecha) {
        this.idcompra = idcompra;
        this.idarticulo = idarticulo;
        this.cantidad = cantidad;
        this.fecha = fecha;
    }

    public Integer getIdcompra() {
        return idcompra;
    }

    public void setIdcompra(Integer idcompra) {
        this.idcompra = idcompra;
    }

    public int getIdarticulo() {
        return idarticulo;
    }

    public void setIdarticulo(int idarticulo) {
        this.idarticulo = idarticulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Compra[ idcompra=" + idcompra + " ]";
    }
    
}
