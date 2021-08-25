package com.blogpessoal.Turma29.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blogpessoal.Turma29.model.Tema;
import com.blogpessoal.Turma29.repository.TemaRepositorio;

@RestController
@RequestMapping ("/api/v1/tema")

public class TemaControlador {

	private @Autowired TemaRepositorio repositorio;
	
	@GetMapping ("/todos")
	public List<Tema> pegarTodes (){
		return repositorio.findAll();
	}
	
}
