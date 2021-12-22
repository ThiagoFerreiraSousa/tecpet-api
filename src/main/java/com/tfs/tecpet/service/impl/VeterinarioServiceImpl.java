package com.tfs.tecpet.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tfs.tecpet.model.dao.VeterinarioDao;
import com.tfs.tecpet.model.entity.VeterinarioEntity;
import com.tfs.tecpet.service.VeterinarioService;

public class VeterinarioServiceImpl implements VeterinarioService{
	
	@Autowired
	private VeterinarioDao dao;

	public VeterinarioEntity obter(Long id) {
		return dao.getById(id);
	}
	
	@Override
	public VeterinarioEntity salvar(VeterinarioEntity veterinario) {
		return dao.saveAndFlush(veterinario);
	}
	
	public List<VeterinarioEntity> listar(){
		return dao.findAll();
	}
	
	public void delete(VeterinarioEntity veterinario) {
		dao.delete(veterinario);
	}


	
}
