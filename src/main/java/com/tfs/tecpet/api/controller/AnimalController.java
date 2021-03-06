package com.tfs.tecpet.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tfs.tecpet.model.entity.AnimalEntity;
import com.tfs.tecpet.service.AnimalService;

@RestController
@CrossOrigin
@RequestMapping("/animal")
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
	public AnimalEntity salvar(@RequestBody AnimalEntity animal){
		return service.salvar(animal);
	}
	
	@PostMapping("/delete")
	public void delete(@RequestBody AnimalEntity animal){
		service.delete(animal);
	}
		
}
