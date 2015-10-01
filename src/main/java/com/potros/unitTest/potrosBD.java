package com.potros.unitTest;

import com.potros.entities.*;
import java.util.ArrayList;
import java.util.List;

public class potrosBD {

	private static List<Articulo> listArticulo = new ArrayList<Articulo>();
	private static List<Carrito> listCarrito = new ArrayList<Carrito>();
	private static List<Compra> listCompra = new ArrayList<Compra>();
	private static List<Departamento> listDepartamento = new ArrayList<Departamento>();
	private static List<Factura> listFactura = new ArrayList<Factura>();
	private static List<RenglonCarritoInmutable> listRenglon = new ArrayList<RenglonCarritoInmutable>();
	private static List<Usuario> listUsuario = new ArrayList<Usuario>();
	
	
	public static List<Articulo> getListArticulo() {
		return listArticulo;
	}
	public static void setListArticulo(List<Articulo> listArticulo) {
		potrosBD.listArticulo = listArticulo;
	}
	public static List<Carrito> getListCarrito() {
		return listCarrito;
	}
	public static void setListCarrito(List<Carrito> listCarrito) {
		potrosBD.listCarrito = listCarrito;
	}
	public static List<Compra> getListCompra() {
		return listCompra;
	}
	public static void setListCompra(List<Compra> listCompra) {
		potrosBD.listCompra = listCompra;
	}
	public static List<Departamento> getListDepartamento() {
		return listDepartamento;
	}
	public static void setListDepartamento(List<Departamento> listDepartamento) {
		potrosBD.listDepartamento = listDepartamento;
	}
	public static List<Factura> getListFactura() {
		return listFactura;
	}
	public static void setListFactura(List<Factura> listFactura) {
		potrosBD.listFactura = listFactura;
	}
	public static List<RenglonCarritoInmutable> getListRenglon() {
		return listRenglon;
	}
	public static void setListRenglon(List<RenglonCarritoInmutable> listRenglon) {
		potrosBD.listRenglon = listRenglon;
	}
	public static List<Usuario> getListUsuario() {
		return listUsuario;
	}
	public static void setListUsuario(List<Usuario> listUsuario) {
		potrosBD.listUsuario = listUsuario;
	}
}
