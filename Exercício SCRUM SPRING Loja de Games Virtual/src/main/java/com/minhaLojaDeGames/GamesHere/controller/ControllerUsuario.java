package com.minhaLojaDeGames.GamesHere.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.minhaLojaDeGames.GamesHere.models.Usuario;
import com.minhaLojaDeGames.GamesHere.models.utilities.UsuarioDTO;
import com.minhaLojaDeGames.GamesHere.repositorio.RepositoryUsuario;
import com.minhaLojaDeGames.GamesHere.servicos.UsuarioServicos;


@RestController
@RequestMapping ("/apigame/v1/Usuario")
public class ControllerUsuario {
	
	private @Autowired UsuarioServicos servico;
	
	
	private @Autowired RepositoryUsuario repositorio;
	
	
	
	@GetMapping("/todos")
	private ResponseEntity <List<Usuario>> pegarTodos(){
		return ResponseEntity.status(200).body(repositorio.findAll());
	}
	
	@GetMapping ("/acharUsuarioPorId/ {idUsuario}")
	private ResponseEntity <Usuario> buscarPorId (@PathVariable (value = "idUsuario") Long idUsuario){
		Optional <Usuario> objetoUsuario = repositorio.findById(idUsuario);
		
		if (objetoUsuario.isPresent()) {
			return ResponseEntity.status(200).body(objetoUsuario.get());
		}else {
			return ResponseEntity.status(204).build();		}
	}
	
	@GetMapping ("/acharUsuarioPorEmail/{emailUsuario}")
	private ResponseEntity <List<Usuario>> buscarTodosPorEmail (@PathVariable (value = "emailUsuario") String email){
		List <Usuario> objetoUsuario = repositorio.findAllByEmailContainingIgnoreCase(email);
		
		if (objetoUsuario.isEmpty()) {
			return ResponseEntity.status(204).build();
		}else {
			return ResponseEntity.status(200).body(objetoUsuario);
		}
	}
	
	@PostMapping ("/salvarECadastrar")
	private ResponseEntity <Object> salvarELoginUsuario (@RequestBody @Valid Usuario usuarioParaLogin){
		Optional <Object> objetoOptional = servico.cadastrarUsuario(usuarioParaLogin);
		
		if (objetoOptional.isEmpty()) {
			return ResponseEntity.status(400).build();
		}else {
			return ResponseEntity.status(201).body(objetoOptional.get());
		}
	
	}
	
	@PutMapping ("/atualizarUsuario")
	private ResponseEntity <Usuario> atualizarUsuario (@RequestBody @Valid Usuario usuarioParaAtualizar){
		return ResponseEntity.status(201).body(repositorio.save(usuarioParaAtualizar));
	}
	
	@DeleteMapping ("/deletarUsuario/{idUsuario}")
	private void deletarUsuario (@PathVariable (value = "idUsuario") Long idUsuario){
		repositorio.deleteById(idUsuario);
	}
	
	@PutMapping ("/pegarCredenciaisUsuario")
	public ResponseEntity <Object> credenciais (@Valid @RequestBody UsuarioDTO usuarioParaAutenticar){
		Optional <?> objetoOptional = servico.pegarCredenciais(usuarioParaAutenticar);
		
		if(objetoOptional.isEmpty()) {
			return ResponseEntity.status(400).build();
		}else {
			return ResponseEntity.status(201).body(objetoOptional.get());
		}
}
}
