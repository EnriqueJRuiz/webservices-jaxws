package com.ipartek.formacion.ws.alumno;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.WebParam.Mode;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import com.ipartek.formacion.pojo.Alumno;

@WebService(targetNamespace="http://com.ipartek.formacion/types", name="alumnows")
@SOAPBinding(use=Use.LITERAL, style=Style.RPC)//Tipo de servicio web que publicamos
public interface AlumnoServiceWS {

	@WebMethod
	@ResponseWrapper(targetNamespace="http://com.ipartek.formacion/types",
	className="com.ipartek.formacion.ws.AlumnoColeccion")//Mapeamos la respuesta
	public AlumnoColeccion getAll();
	
	@WebMethod
	@ResponseWrapper(targetNamespace="http://com.ipartek.formacion/types",
	className="com.ipartek.formacion.pojo.Alumno")//Mapeamos la peticion
	@RequestWrapper()
	public Alumno getById(@WebParam(targetNamespace="http://com.ipartek.formacion/types",
	mode=Mode.IN, name = "codigoAlumno") Integer codigo); //Ponemos integer porque queremos que pueda ser nulo
}
