package com.ipartek.formacion.ws.pelicula;

import java.io.Serializable;

import com.ipartek.formacion.pojo.Pelicula;

public class PeliculaMensaje implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Pelicula pelicula;
	String mensaje;
	
	public PeliculaMensaje() {
		super();
		this.pelicula = null;
		this.mensaje = "";
	}
	public Pelicula getPelicula() {
		return pelicula;
	}
	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
}
