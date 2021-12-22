package com.tfs.tecpet.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tfs.tecpet.model.dao.AnimalDao;
import com.tfs.tecpet.model.entity.AnimalEntity;
import com.tfs.tecpet.service.AnimalService;

@Service
public class AnimalServiceImpl implements AnimalService{
	
	@Autowired
	private AnimalDao dao;

	public AnimalEntity obter(Long id) {
		return dao.getById(id);
	}
	
	@Override
	public AnimalEntity salvar(AnimalEntity animal) {
		return dao.saveAndFlush(animal);
	}
	
	public List<AnimalEntity> listar(){
		return dao.findAll();
	}
	
	public void delete(AnimalEntity animal) {
		dao.delete(animal);
	}


	
}
