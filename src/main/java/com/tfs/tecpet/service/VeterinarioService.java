package com.tfs.tecpet.service;

import java.util.List;

import com.tfs.tecpet.model.entity.VeterinarioEntity;

public interface VeterinarioService {

	public List<VeterinarioEntity> listar();

	public VeterinarioEntity salvar(VeterinarioEntity veterinario);

	public VeterinarioEntity obter(Long id);

	public void delete(VeterinarioEntity veterinario);
}
