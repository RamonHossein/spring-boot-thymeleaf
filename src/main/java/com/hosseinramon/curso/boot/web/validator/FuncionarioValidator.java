package com.hosseinramon.curso.boot.web.validator;

import java.time.LocalDate;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.hosseinramon.curso.boot.domain.Funcionario;

public class FuncionarioValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Funcionario.class.equals(clazz);
	}

	@Override
	public void validate(Object object, Errors errors) {
		
		Funcionario funcionario = (Funcionario) object;
		LocalDate entrada = funcionario.getDataEntrada();
		
		if(funcionario.getDataSaida() != null && funcionario.getDataSaida().isBefore(entrada))
			errors.rejectValue("dataSaida", "PosteriorDataEntrada.funcionario.dataSaida");
	}

}
