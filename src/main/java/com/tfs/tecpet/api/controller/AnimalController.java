package com.tfs.tecpet.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tfs.tecpet.model.entity.AnimalEntity;
import com.tfs.tecpet.service.AnimalService;

@RestController
public class AnimalController {
	
	@Autowired
	AnimalService service;

	@GetMapping("/listar")
	public List<AnimalEntity> listar(){
		return service.listar();
	}
	
	@GetMapping("/obter/{id}")
	public AnimalEntity obter(Long id){
		return service.obter(id);
	}
	
	@PostMapping("/salvar")
	public AnimalEntity salvar(AnimalEntity animal){
		return service.salvar(animal);
	}
	
	@PostMapping("/delete")
	public void delete(AnimalEntity animal){
		service.delete(animal);
	}
		
}
