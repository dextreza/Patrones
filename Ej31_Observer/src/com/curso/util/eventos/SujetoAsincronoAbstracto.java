package com.curso.util.eventos;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class SujetoAsincronoAbstracto<T> implements Sujeto<T> {
	
	private List<Observador<T>> observadores = new ArrayList<Observador<T>>();
	
	@Override
	public void registro(Observador<T> observador) {
		observadores.add(observador);		
	}

	@Override
	public void baja(Observador<T> observador) {
		for(Observador<T> obs: observadores) {
			if(obs.equals(observador)) {
				observadores.remove(observador);
				break;
			}
		}
	}

	@Override
	public void emitir(T evento) {
		//Esto mejor como atributo de la clase, y adedm�s es muy cutre
		ExecutorService terminator = Executors.newFixedThreadPool(4);
		observadores.forEach( obs -> {			
			terminator.execute(() -> obs.procesarEvento(evento)); //Runnable
		});
		terminator.shutdown();
	}
	
}
