package com.tfs.tecpet.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tfs.tecpet.model.entity.TutorEntity;
import com.tfs.tecpet.service.TutorService;

@CrossOrigin
@RequestMapping("/tutor")
@RestController
public class TutorController {

	@Autowired
	TutorService service;

	@GetMapping("/listar")
	public List<TutorEntity> listar() {
		return service.listar();
	}

	@GetMapping("/obter/{id}")
	public TutorEntity obter(@PathVariable Long id) {
		return service.obter(id);
	}

	@PostMapping("/salvar")
	public TutorEntity salvar(@RequestBody TutorEntity tutor) {
		return service.salvar(tutor);
	}

	@PostMapping("/delete")
	public void delete(@RequestBody TutorEntity tutor) {
		service.delete(tutor);
	}

}
