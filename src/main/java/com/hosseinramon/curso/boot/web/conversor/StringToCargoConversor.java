package com.hosseinramon.curso.boot.web.conversor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

import com.hosseinramon.curso.boot.domain.Cargo;
import com.hosseinramon.curso.boot.service.CargoService;

public class StringToCargoConversor implements Converter<String, Cargo> {

	@Autowired
	private CargoService service;
	
	@Override
	public Cargo convert(String text) {
		
		if(text.isEmpty())
			return null;
		
		Long id = Long.valueOf(text);
		return service.buscarPorId(id);
	}

}
