package com.tfs.tecpet.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tfs.tecpet.model.entity.VeterinarioEntity;
import com.tfs.tecpet.service.VeterinarioService;

@RestController
@CrossOrigin
@RequestMapping("/veterinario")
public class VeterinarioController {
	
	@Autowired
	VeterinarioService service;

	@GetMapping("/listar")
	public List<VeterinarioEntity> listar(){
		return service.listar();
	}
	
	@GetMapping("/obter/{id}")
	public VeterinarioEntity obter(Long id){
		return service.obter(id);
	}
	
	@PostMapping("/salvar")
	public VeterinarioEntity salvar(VeterinarioEntity veterinario){
		return service.salvar(veterinario);
	}
	
	@PostMapping("/delete")
	public void delete(VeterinarioEntity veterinario){
		service.delete(veterinario);
	}
	
}
