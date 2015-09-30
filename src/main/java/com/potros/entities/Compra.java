package com.potros.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

public class Compra implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private Integer idcompra;
	private ArrayList <RenglonCarritoInmutable> datos;
	private Date fecha;
	private Usuario usuario;

	public Compra(Integer idcompra, Date fec, Carrito car, Usuario usu) {
		this.idcompra = idcompra;
		this.fecha = fec;
		this.datos=new ArrayList<RenglonCarritoInmutable>();
		ArrayList <RenglonCarrito> dat = car.getCompra();
		for(int d=0;d<dat.size();d++){
			this.datos.add(dat.get(d));
		}
		this.usuario = usu;
	}

	public Integer getIdcompra() {
		return idcompra;
	}

	public void setIdcompra(Integer idcompra) {
		this.idcompra = idcompra;
	}

	

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Compra[ idcompra=" + idcompra + " ]"+datos.get(0).getArticulo().getDescripcion();
	}

}
