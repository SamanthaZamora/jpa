package com.empresa.util;

import com.empresa.entitis.Usuario;
import com.empresa.model.UsuarioDao;

public class Prueba {
	public static void main(String[] args) {

		Usuario u = new Usuario();
		u.setEmail("crangarita@gmail.com");
		u.setNombre("Carlos");
		u.setPais("Colombia");

		UsuarioDao uDao = new UsuarioDao();
		uDao.insert(u);
	}
}
