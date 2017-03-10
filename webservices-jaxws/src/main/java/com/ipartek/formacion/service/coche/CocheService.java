package com.ipartek.formacion.service.coche;

import java.util.Map;

import com.ipartek.formacion.pojo.Coche;

public interface CocheService {

	public Map<Integer, Coche> getAll();
	public Coche getById(int codigo);
}
