package com.curso.modelo.entidad;

import com.curso.modelo.entidad.Producto;

public class Producto {

	private String codigo;
	private String nombre;
	private Double precio;

	public Producto() {
		super();
	}

	public Producto(String codigo, String nombre, Double precio) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
	}

	public Producto(Producto producto) {
		codigo = producto.getCodigo();
		nombre = producto.getNombre();
		precio = producto.getPrecio();
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + "]";
	}

}
