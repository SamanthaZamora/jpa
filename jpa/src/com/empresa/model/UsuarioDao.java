package com.empresa.model;

import com.empresa.entitis.Usuario;
import com.empresa.util.Conexion;

public class UsuarioDao extends Conexion<Usuario> implements GenericDao<Usuario> {

	public UsuarioDao() {
		super(Usuario.class);
	}
}
