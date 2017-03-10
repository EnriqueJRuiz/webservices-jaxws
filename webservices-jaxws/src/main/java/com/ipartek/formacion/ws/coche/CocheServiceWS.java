package com.ipartek.formacion.ws.coche;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import com.ipartek.formacion.pojo.Coche;


@WebService(targetNamespace="http://com.ipartek.formacion/types", name = "cochews")
@SOAPBinding(use=Use.LITERAL, style=Style.DOCUMENT)//Tipo de servicio web que nos publica
public interface CocheServiceWS {
	
	//Sustituye el nombre del metodo por el que pongamos
	@WebMethod(operationName="obtenerTodos")
	public CocheColeccion getAll();
	
	@WebMethod(operationName="obtenerCocheporCodigo")
	public Coche getById(Integer codigo); 
}
