package com.tfs.tecpet.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tfs.tecpet.model.dao.ConsultaDao;
import com.tfs.tecpet.model.entity.ConsultaEntity;
import com.tfs.tecpet.service.ConsultaService;

public class ConsultaServiceImpl implements ConsultaService{
	
	@Autowired
	private ConsultaDao dao;

	public ConsultaEntity obter(Long id) {
		return dao.getById(id);
	}
	
	@Override
	public ConsultaEntity salvar(ConsultaEntity consulta) {
		return dao.saveAndFlush(consulta);
	}
	
	public List<ConsultaEntity> listar(){
		return dao.findAll();
	}
	
	public void delete(ConsultaEntity consulta) {
		dao.delete(consulta);
	}


	
}
