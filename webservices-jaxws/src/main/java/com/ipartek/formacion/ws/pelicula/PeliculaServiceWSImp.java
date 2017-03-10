package com.ipartek.formacion.ws.pelicula;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

import com.ipartek.formacion.pojo.Pelicula;
import com.ipartek.formacion.service.pelicula.PeliculaSerciveImp;
import com.ipartek.formacion.service.pelicula.PeliculaService;

@WebService(serviceName="peliculasservice",
portName="",
targetNamespace="")
@SOAPBinding(use = Use.LITERAL, style = Style.DOCUMENT)
public class PeliculaServiceWSImp {
	
	@Resource
	WebServiceContext webServiceContext;

	@WebMethod(operationName="obtenerporid")
	public PeliculaMensaje getById(int codigo){
		PeliculaMensaje pM = new PeliculaMensaje();
		
		if(validarPeticion()){//Si la contraseña es correcta....
			PeliculaService pS = new PeliculaSerciveImp();
			Pelicula pelicula = pS.getById(codigo);
			if(pelicula == null){
				pM.setMensaje("El codigo enviado no corresponde a ninguna pelicula: "+codigo);
			}else{
				pM.setPelicula(pelicula);
			}
		}else{//Si la contraseña NO es correcta....
			pM.setMensaje("La contraseña enviada no es correcta");
		}
		return pM;		
	}
	
	//Valida la contraseña
	private boolean validarPeticion(){
		boolean valida = false;
		//WS-Security
		//Con esto recogemos los datos de la cabecera
		MessageContext contextoMensajes = webServiceContext.getMessageContext();
		Map<?,?> encabezados = (Map<?,?>) contextoMensajes.get(MessageContext.HTTP_REQUEST_HEADERS);
		//el nombre del atributo del "encabezados" se llama asi porque sei se decide
		//es una lista porque lo decidimos
		List<?> session = (List<?>) encabezados.get("sessionId");
		//cargamos el identificador
		String sessionid = "ipsession";
		
		if(session!=null){
			//aqui hariamos o produciriamos cualquier validaci�n compleja
			if(sessionid.equals(session.get(0).toString())){
				valida=true;
			}
		}
		
		return valida;
	}
	
	@WebMethod(operationName="obtenertodo")
	public Set<Pelicula> getAll(){
		return null;
	}
}
