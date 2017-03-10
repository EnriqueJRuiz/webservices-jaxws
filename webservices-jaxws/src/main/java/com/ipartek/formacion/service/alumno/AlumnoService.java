package com.ipartek.formacion.service.alumno;

import java.util.Map;

import com.ipartek.formacion.pojo.Alumno;

public interface AlumnoService {

	public Map<Integer, Alumno> getAll();
	public Alumno getById(int codigo);
}
