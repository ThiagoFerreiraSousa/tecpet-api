package com.tfs.tecpet.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tfs.tecpet.model.dao.TutorDao;
import com.tfs.tecpet.model.entity.TutorEntity;
import com.tfs.tecpet.service.TutorService;

public class TutorServiceImpl implements TutorService{
	
	@Autowired
	private TutorDao dao;

	public TutorEntity obter(Long id) {
		return dao.getById(id);
	}
	
	@Override
	public TutorEntity salvar(TutorEntity tutor) {
		return dao.saveAndFlush(tutor);
	}
	
	public List<TutorEntity> listar(){
		return dao.findAll();
	}
	
	public void delete(TutorEntity tutor) {
		dao.delete(tutor);
	}


	
}
