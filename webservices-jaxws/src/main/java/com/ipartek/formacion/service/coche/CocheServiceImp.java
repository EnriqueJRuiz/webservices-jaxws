package com.ipartek.formacion.service.coche;

import java.util.HashMap;
import java.util.Map;

import com.ipartek.formacion.pojo.Coche;

public class CocheServiceImp implements CocheService {

	Map<Integer, Coche> coches;
	
	public CocheServiceImp(){
		coches = new HashMap<Integer, Coche>();
		init();
	}
	private void init() {
		Coche coche = new Coche();
		coche.setCodigo(0);
		coche.setNombre("Renault Megane");
		coches.put(coche.getCodigo(), coche);
		coche = new Coche();
		coche.setCodigo(1);
		coche.setNombre("Renault Scenic");
		coches.put(coche.getCodigo(), coche);
		coche = new Coche();
		coche.setCodigo(2);
		coche.setNombre("Ford Focus");
		coches.put(coche.getCodigo(), coche);
	}
	
	public Map<Integer, Coche> getAll() {
		return coches;
	}

	public Coche getById(int codigo) {
		return coches.get(codigo);
	}

}
