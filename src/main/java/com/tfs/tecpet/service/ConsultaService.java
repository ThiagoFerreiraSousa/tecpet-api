package com.tfs.tecpet.service;

import java.util.List;

import com.tfs.tecpet.model.entity.ConsultaEntity;

public interface ConsultaService {

	public List<ConsultaEntity> listar();

	public ConsultaEntity salvar(ConsultaEntity consulta);

	public ConsultaEntity obter(Long id);

	public void delete(ConsultaEntity consulta);
}
