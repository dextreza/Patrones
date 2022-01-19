package com.curso.modelo.persistencia.util;

import com.curso.modelo.persistencia.ClienteRepositorio;
import com.curso.modelo.persistencia.ClienteRepositorioMysql;

public class FactoriaRepositorios {

	//Esto se ha le�do de la configuracion
	private static String tipo = "Mysql";
	
	public static ClienteRepositorio getClienteRepositorio() {
		switch(tipo) {
			case "Mysql"   : return ClienteRepositorioMysql.getInstancia();
			default : throw new RuntimeException("Error de configuraci�n");
		}
	}
	
	private FactoriaRepositorios() {
	}
	
}
