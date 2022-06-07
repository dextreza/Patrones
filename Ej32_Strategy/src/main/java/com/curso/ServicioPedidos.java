package com.curso;

import java.util.stream.Collectors;

import com.curso.modelo.entidad.Pedido;

public class ServicioPedidos {

	public void aceptarPedido(Pedido pedido, EstrategiaOferta estrategiaOferta) {
		//Comprobar datos bancarios del cliente
		//Comprobar las existencias
		//Reservar un cami�n para el env�o

		pedido.calcularTotal();
		estrategiaOferta.calcularOferta(pedido);
		pedido.calcularTotal();
		
		System.out.println(pedido.formatear());
	}
	
	
	
}
