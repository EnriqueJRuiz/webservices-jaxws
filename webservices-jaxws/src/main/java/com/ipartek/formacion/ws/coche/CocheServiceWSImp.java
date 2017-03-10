package com.ipartek.formacion.ws.coche;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;

import com.ipartek.formacion.pojo.Coche;
import com.ipartek.formacion.service.coche.CocheService;
import com.ipartek.formacion.service.coche.CocheServiceImp;

@WebService(serviceName="cocheservice", 
wsdlLocation = "Cocheservice", 
endpointInterface ="com.ipartek.formacion.ws.CocheServiceWS")
public class CocheServiceWSImp implements CocheServiceWS{

	public CocheColeccion getAll() {
		CocheService cS = new CocheServiceImp();
		CocheColeccion coleccion = new CocheColeccion();
		Map<Integer,Coche> coches = cS.getAll();
		List<Coche> cocheLista = new ArrayList(coches.values());
		coleccion.setCoches(cocheLista);
		return coleccion;
	}

	public Coche getById(Integer codigo) {
		Coche coche = null;
		if(codigo != null){
			CocheService cS = new CocheServiceImp();
			coche = cS.getById(codigo);
		}
		return coche;
	}
}
