package com.ipartek.formacion.service.pelicula;

import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


import com.ipartek.formacion.pojo.Genero;
import com.ipartek.formacion.pojo.Pelicula;

public class PeliculaSerciveImp implements PeliculaService {

	Set<Pelicula> peliculas;
	
	public PeliculaSerciveImp() {
		peliculas = new TreeSet<Pelicula>();
		init();
	}
	
	private void init() {
		Genero genero = new Genero();
		genero.setNombre("Fantastica");
		Pelicula pelicula = new Pelicula();
		pelicula.setCodigo(1);
		pelicula.setTitulo("El señor de los anillos");
		pelicula.setfestreno(new Date());
		pelicula.setGenero(genero);
		peliculas.add(pelicula);
		
		genero = new Genero();
		genero.setNombre("Accion");
		pelicula = new Pelicula();
		pelicula.setCodigo(2);
		pelicula.setTitulo("kill Bill 1");
		pelicula.setfestreno(new Date());
		pelicula.setGenero(genero);
		peliculas.add(pelicula);
		
		genero = new Genero();
		genero.setNombre("Ciencia Ficcion");
		pelicula = new Pelicula();
		pelicula.setCodigo(3);
		pelicula.setTitulo("Star Wars Episodio IV: Una nueva Esperanza");
		pelicula.setfestreno(new Date());
		pelicula.setGenero(genero);
		peliculas.add(pelicula);
		
	}

	@Override
	public Set<Pelicula> getAll() {
		return peliculas;
	}

	@Override
	public Pelicula getById(int codigo) {
		Pelicula pelicula = encontrarPorCodigo(codigo);
		return pelicula;
	}

	private Pelicula encontrarPorCodigo(int codigo) {
		boolean encontrado = false;
		Pelicula pelicula = null;
		
		Iterator<Pelicula> it = peliculas.iterator();
		while(it.hasNext() && encontrado == false){
			Pelicula aux = it.next();
			if(aux.getCodigo()==codigo){
				encontrado = true;
				pelicula = aux;
			}
		}
		return pelicula;
	}

}
