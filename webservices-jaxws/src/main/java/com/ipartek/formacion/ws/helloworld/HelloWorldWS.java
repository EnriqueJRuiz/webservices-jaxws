package com.ipartek.formacion.ws.helloworld;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

//Identificador de los servicios web. 
//El espacio de nombres es unico. Suele ponerse el servicio web
@WebService(targetNamespace="http://formacion.ipartek.com")
@SOAPBinding(style=Style.RPC, use= Use.LITERAL)
public interface HelloWorldWS {

	@WebMethod
	public String obtenerHolaMundo();
	
}
