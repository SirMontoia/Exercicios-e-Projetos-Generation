package com.blogpessoal.Turma29.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blogpessoal.Turma29.model.Usuarios;
import com.blogpessoal.Turma29.repository.UsuariosRepositorio;

@RestController
@RequestMapping ("/api/v1/usuario")

public class UsuariosControladores {
	
	private @Autowired UsuariosRepositorio repositorio;
	
	
	@GetMapping ("/todes")
	public List<Usuarios> pegarTodes(){
		
		return repositorio.findAll();
	}
	
	

}
