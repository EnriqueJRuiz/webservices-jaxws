package com.ipartek.formacion.service;

import java.util.Set;

import com.ipartek.formacion.pojo.Pelicula;

public interface PeliculaService {

	public Set<Pelicula> getAll();
	public Pelicula getById(int codigo);
}
