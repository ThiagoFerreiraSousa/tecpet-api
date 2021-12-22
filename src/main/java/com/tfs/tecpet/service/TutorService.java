package com.tfs.tecpet.service;

import java.util.List;

import com.tfs.tecpet.model.entity.TutorEntity;

public interface TutorService {

	public List<TutorEntity> listar();

	public TutorEntity salvar(TutorEntity tutor);

	public TutorEntity obter(Long id);

	public void delete(TutorEntity tutor);
}
