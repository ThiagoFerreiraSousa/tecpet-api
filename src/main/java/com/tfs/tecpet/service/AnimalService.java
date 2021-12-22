package com.tfs.tecpet.service;

import java.util.List;

import com.tfs.tecpet.model.entity.AnimalEntity;

public interface AnimalService {

	public List<AnimalEntity> listar();

	public AnimalEntity salvar(AnimalEntity animal);

	public AnimalEntity obter(Long id);

	public void delete(AnimalEntity animal);
}
