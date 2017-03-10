package com.ipartek.formacion.ws.alumno;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;

import com.ipartek.formacion.pojo.Alumno;
import com.ipartek.formacion.service.alumno.AlumnoService;
import com.ipartek.formacion.service.alumno.AlumnoServiceImp;

@WebService(endpointInterface="com.ipartek.formacion.ws.AlumnoServiceWS")//A que clase apunta el interfaz
public class AlumnoServiceWSImp implements AlumnoServiceWS {

	@Override
	public AlumnoColeccion getAll() {
		AlumnoService aS = new AlumnoServiceImp();
		AlumnoColeccion coleccion = new AlumnoColeccion();
		Map<Integer, Alumno> alumnos = aS.getAll();
		List<Alumno> alumnoLista = new ArrayList(alumnos.values());
		coleccion.setAlumnos(alumnoLista);
		return coleccion;
	}

	@Override
	public Alumno getById(Integer codigo) {
		Alumno alumno = null;
		if(codigo != null){
			AlumnoService aS = new AlumnoServiceImp();
			alumno = aS.getById(codigo);
		}
		return alumno;
	}

}
