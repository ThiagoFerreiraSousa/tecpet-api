package com.tfs.tecpet.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tfs.tecpet.model.entity.ConsultaEntity;
import com.tfs.tecpet.service.ConsultaService;

@RestController
public class ConsultaController {
	
	@Autowired
	ConsultaService service;

	@GetMapping("/listar")
	public List<ConsultaEntity> listar(){
		return service.listar();
	}
	
	@GetMapping("/obter/{id}")
	public ConsultaEntity obter(Long id){
		return service.obter(id);
	}
	
	@PostMapping("/salvar")
	public ConsultaEntity salvar(ConsultaEntity tutor){
		return service.salvar(tutor);
	}
	
	@PostMapping("/delete")
	public void delete(ConsultaEntity tutor){
		service.delete(tutor);
	}
	
}
