package com.ipartek.formacion.ws.coche;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.ipartek.formacion.pojo.Coche;

public class CocheColeccion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Coche> coches;
	
	public CocheColeccion() {
		super();
		this.coches = new ArrayList<Coche>();
	}
	public List<Coche> getCoches() {
		return coches;
	}
	public void setCoches(List<Coche> coches) {
		this.coches = coches;
	}
	
	
}
