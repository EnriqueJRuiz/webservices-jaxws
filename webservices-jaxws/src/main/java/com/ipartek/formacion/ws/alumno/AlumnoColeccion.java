package com.ipartek.formacion.ws.alumno;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.ipartek.formacion.pojo.Alumno;

public class AlumnoColeccion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Alumno> alumnos;
	
	public AlumnoColeccion() {
		super();
		alumnos = new ArrayList<Alumno>();
	}
	public List<Alumno> getAlumnos() {
		return alumnos;
	}
	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
	
	
	
}
