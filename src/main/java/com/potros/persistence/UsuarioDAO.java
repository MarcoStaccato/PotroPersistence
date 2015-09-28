package com.potros.persistence;

import com.potros.entities.Usuario;

public class UsuarioDAO extends GenericDAO<Usuario> {

	@Override
	public Class getClazz() {
		return Usuario.class;
	}
}


