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


import com.minhaLojaDeGames.GamesHere.models.Categoria;
import com.minhaLojaDeGames.GamesHere.repositorio.RepositorioCategoria;


@RestController
@RequestMapping ("/apigame/v1/categoria")

public class ControllerCategoria {
	
	private @Autowired RepositorioCategoria repositorio;

	
	@GetMapping ("/todas")
	public ResponseEntity <List<Categoria>> GetAll()
	{
		return ResponseEntity.ok(repositorio.findAll());
	}

	
	@GetMapping ("/{idCategoria}")
	public ResponseEntity <Categoria> buscarPorId (@PathVariable (value= "idCategoria") Long idCategoria)
	{
	Optional <Categoria> objetoCategoria = repositorio.findById(idCategoria);
	
	if(objetoCategoria.isPresent()) {
		
		return ResponseEntity.status(200).body(objetoCategoria.get());
	
	}else {
		
		return ResponseEntity.status(204).build();
	}
	
	}

	
	@GetMapping ("/pesquisarGenero/{generoJogo}")
	public ResponseEntity<List<Categoria>> buscarPorGenero (@PathVariable(value = "generoJogo") String generoJogo){
		List<Categoria> objetoCategoria = repositorio.findAllByGeneroJogoContainingIgnoreCase(generoJogo);
		
		if(objetoCategoria.isEmpty()) {
			return ResponseEntity.status(204).build();
		}else {
			return ResponseEntity.status(200).body(objetoCategoria);
		}
	}
	
	
	@PostMapping ("/salvarCategoria")
	public ResponseEntity <Categoria> salvar (@Valid @RequestBody Categoria novaCategoria){
		return ResponseEntity.status(201).body(repositorio.save(novaCategoria));
	}
	
	
	
	@PutMapping ("/atualizar")
	public ResponseEntity <Categoria> atualizar (@Valid @RequestBody Categoria categoriaParaAtualizar){
		return ResponseEntity.status(201).body(repositorio.save(categoriaParaAtualizar));
	}
	
	@DeleteMapping ("/deletar/{id_Categoria}")
	public void deletarJogoPorId(@PathVariable(value = "id_Categoria") Long idCategoria) {
		repositorio.deleteById(idCategoria);
	}
	
}





