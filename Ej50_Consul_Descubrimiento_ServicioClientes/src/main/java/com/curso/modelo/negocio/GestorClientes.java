package com.curso.modelo.negocio;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.curso.modelo.entidad.Cliente;
import com.curso.modelo.persistencia.ClienteRepositorio;

@Service
//@Scope("singleton")
@Transactional
public class GestorClientes {
	
	@Autowired
	private ClienteRepositorio clienteRepo;

	public Cliente insertar(Cliente cliente) {
		//Lógica de negocio...
		//...
		return clienteRepo.save(cliente);
	}

	public void borrar(String login) {
		//LN...
		//...
		clienteRepo.deleteByLogin(login);		
	}
	
}
