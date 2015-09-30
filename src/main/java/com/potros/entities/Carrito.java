package com.potros.entities;

import java.util.ArrayList;

public class Carrito {
	private Usuario usuario;
	private ArrayList<RenglonCarrito> datos = new ArrayList<RenglonCarrito>();

	
	public Carrito() {
	}

	public Carrito(Usuario u) {
		this.usuario = u;
	}

	public void agregarArticulo(RenglonCarrito rc) {
		if (datos.contains(rc))
			System.out
					.println("Ya contiene un elemento en el carrito con los mismos datos");
		else
			datos.add(rc);
	}

	public void borrarArticulo(RenglonCarrito rc) {
		datos.remove(rc);
	}

	public void modificarArticulo(RenglonCarrito rc) {
		int indice = datos.indexOf(rc);
		if (indice > 0)
			datos.remove(indice);
		datos.add(indice, rc);
	}

	public ArrayList<RenglonCarrito> getCompra() {
		return datos;
	}
}
