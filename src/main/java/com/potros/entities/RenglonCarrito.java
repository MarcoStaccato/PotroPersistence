package com.potros.entities;

public class RenglonCarrito extends RenglonCarritoInmutable {

	public RenglonCarrito(Articulo art, int cant) {
		super(art, cant);
	}

	
	public void setArticulo(Articulo art) {
		this.articulo = art;
	}

	public void setCantidad(int can) {
		this.cantidad = can;
	}

	public void modificarArticulo(int usuario, Articulo a, int cantidad) {
		this.articulo = a;
		this.cantidad = cantidad;
	}
}
