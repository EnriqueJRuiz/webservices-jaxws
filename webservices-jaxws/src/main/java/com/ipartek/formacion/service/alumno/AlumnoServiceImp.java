package com.ipartek.formacion.service.alumno;

import java.util.HashMap;
import java.util.Map;

import com.ipartek.formacion.pojo.Alumno;

public class AlumnoServiceImp implements AlumnoService {

	Map<Integer, Alumno> alumnos;
	
	public AlumnoServiceImp(){
		alumnos = new HashMap<Integer, Alumno>();
		init();
	}
	
	private void init() {
		Alumno alumno = new Alumno();
		alumno.setCodigo(0);
		alumno.setNombre("Jorge");
		alumno.setApellidos("Megadeath");
		alumnos.put(alumno.getCodigo(), alumno);
		alumno = new Alumno();
		alumno.setCodigo(1);
		alumno.setNombre("Nora");
		alumno.setApellidos("Perritos");
		alumnos.put(alumno.getCodigo(), alumno);
		alumno = new Alumno();
		alumno.setCodigo(2);
		alumno.setNombre("Santos");
		alumno.setApellidos("Soap eyacu");
		alumnos.put(alumno.getCodigo(), alumno);
		
	}
	@Override
	public Map<Integer, Alumno> getAll() {
		return alumnos;
	}

	@Override
	public Alumno getById(int codigo) {
		return alumnos.get(codigo) ;
	}

}
