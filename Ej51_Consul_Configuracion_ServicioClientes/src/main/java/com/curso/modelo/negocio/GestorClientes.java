package com.curso.modelo.negocio;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

import com.curso.modelo.entidad.Cliente;
import com.curso.modelo.persistencia.ClienteRepositorio;

@Service
@Transactional
@RefreshScope
public class GestorClientes {

	private String valor;

	@Autowired
	private ClienteRepositorio clienteRepo;

	public GestorClientes(@Value("${bbdd.url}") String valor) {
		super();
		this.valor = valor;
		System.out.println("Instanciando GestorClientes: "+this.valor);
	}

	public Cliente insertar(Cliente cliente) {
		//Lógica de negocio...
		//...
		return clienteRepo.save(cliente);
	}

	public void modificar(Cliente cliente) {
		//Lógica de negocio...
		//...
		clienteRepo.save(cliente);		
	}
	
	public void borrar(String login) {
		//Lógica de negocio...
		//...
		clienteRepo.deleteByLogin(login);		
	}
	
}
