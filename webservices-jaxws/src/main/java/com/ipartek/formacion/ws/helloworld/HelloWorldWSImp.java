package com.ipartek.formacion.ws.helloworld;

import javax.jws.WebService;

//endpointInterfaz es la interfaz a la que apunta
@WebService(endpointInterface="com.ipartek.formacion.ws.HelloWorldWS")
public class HelloWorldWSImp implements HelloWorldWS{

	public String obtenerHolaMundo() {
		return "Hello world";
	}
}
