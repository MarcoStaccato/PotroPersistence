package com.potros.main;

import java.util.List;

import com.potros.entities.Usuario;
import com.potros.persistence.UsuarioDAO;

public class PotrosMain {

	public static void main(String[] args){
		
		UsuarioDAO userDAO = new UsuarioDAO();
		
		Usuario us1 = new Usuario(1, "Marco", "pass");
		Usuario us2 = new Usuario(2, "Marco", "pass");
		Usuario us3 = new Usuario(3, "Marco", "pass");
		
		System.out.println("***persistence starts***");
		userDAO.persist(us1);
		userDAO.persist(us2);
		userDAO.persist(us3);
		System.out.println("***persisted users***");
		List<Usuario> lista = userDAO.findAll();
		for (Usuario usuario : lista) {
			System.out.println(usuario.toString());
		}
	}
}
