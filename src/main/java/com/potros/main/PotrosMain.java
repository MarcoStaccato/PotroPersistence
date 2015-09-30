package com.potros.main;

import java.util.Date;
import java.util.List;

import com.potros.entities.*;
import com.potros.persistence.GenericDAO;

public class PotrosMain {

	public static void main(String[] args){
		
		GenericDAO<Usuario> userDAO = new GenericDAO<Usuario>();
		GenericDAO<Compra> compraDAO = new GenericDAO<Compra>();
		GenericDAO<Articulo> articuloDAO = new GenericDAO<Articulo>();
		GenericDAO<Departamento> departamentoDAO = new GenericDAO<Departamento>();
		GenericDAO<Carrito> carritoDAO = new GenericDAO<Carrito>();
		
		Usuario us1 = new Usuario("us1",1, "Marco1", "pass",21);
		Usuario us2 = new Usuario("us2",2, "Marco2", "pass",22);
		Usuario us3 = new Usuario("us3",3, "Marco3", "pass",23);
		
		System.out.println("***persistence starts***");
		userDAO.persist(us1);
		userDAO.persist(us2);
		userDAO.persist(us3);
		System.out.println("***persisted users*** "+us1.getNombre()+"*"+us2.getNombre()+"*"+us3.getNombre()+"*");
		
		
		
		Departamento armas,armaduras,accesorios;
		armas = new Departamento("armas",1);
		armaduras = new Departamento("armaduras",2);
		accesorios = new Departamento("accesorios",3);
		
		//persist depto
		departamentoDAO.persist(armas);
		departamentoDAO.persist(armaduras);
		departamentoDAO.persist(accesorios);
		
		Articulo art1,art2,art3;
		art1 = new Articulo("art1",1,"espada",20000,1);
		art2 = new Articulo("art2",2,"toga",30000,2);
		art3 = new Articulo("art3",3,"brazalete",25000,3);
		
		armas.agregarArticulo(art1);
		armaduras.agregarArticulo(art2);
		accesorios.agregarArticulo(art3);
		//persist articulos
		articuloDAO.persist(art1);
		articuloDAO.persist(art2);
		articuloDAO.persist(art3);
		
		
		RenglonCarrito r1,r2,r3;
		r1 = new RenglonCarrito(art1,1);
		r2 = new RenglonCarrito(art2,2);
		r3 = new RenglonCarrito(art3,3);
		
		Carrito c;
		c=new Carrito(us1);
		c.agregarArticulo(r1);
		c.agregarArticulo(r2);
		c.agregarArticulo(r3);
		
		//persist carrito
		carritoDAO.persist(c);
		
		Compra comp;
		comp = new Compra(1, new Date(System.currentTimeMillis()),c,c.getUsuario());
		
		//persist compra
		compraDAO.persist(comp);
		
		System.out.print("Compra: "+comp.toString());
	    
		System.out.println("\n Usuarios:");
		
		List usuarios= userDAO.findAll();
		for(int i=0;i < usuarios.size(); i++){
			System.out.print(((Usuario)usuarios.get(i)).getNombre()+" ");
		}

		System.out.println("\n Articulos:");
		
		List articulos= articuloDAO.findAll();
		for(int i=0;i < articulos.size(); i++){
			System.out.print(((Articulo)articulos.get(i)).getDescripcion()+" ");
		}
		
		System.out.println("\n Departamentos:");
		
		List departamentos= departamentoDAO.findAll();
		for(int i=0;i < departamentos.size(); i++){
			System.out.print(((Departamento)departamentos.get(i)).getDescripcion()+" ");
		}
		
		System.out.println();
		
		
	}
}
