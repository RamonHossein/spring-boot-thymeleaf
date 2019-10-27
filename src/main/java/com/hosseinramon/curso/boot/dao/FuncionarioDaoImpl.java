package com.hosseinramon.curso.boot.dao;

import org.springframework.stereotype.Repository;

import com.hosseinramon.curso.boot.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {

}
