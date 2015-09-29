package com.potros.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

public class Compra implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer idcompra;
	private RenglonCarritoInmutable[] datos;
	private Date fecha;
	private Usuario usuario;

	public Compra(Integer idcompra, Date fec, Carrito car, Usuario usu) {
		this.idcompra = idcompra;
		this.fecha = fec;
		// llenar los renglones del carrito
		this.usuario = usu;
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
