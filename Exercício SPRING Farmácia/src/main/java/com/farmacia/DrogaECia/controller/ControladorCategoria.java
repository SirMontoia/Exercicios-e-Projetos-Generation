package com.farmacia.DrogaECia.controller;

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

import com.farmacia.DrogaECia.modelos.Categoria;
import com.farmacia.DrogaECia.repositorio.RepositorioCategoria;

@RestController
@RequestMapping("/apifarma/v1/categoria")
public class ControladorCategoria {

	private @Autowired RepositorioCategoria repositorio;

	@GetMapping("/todas")
	private ResponseEntity<List<Categoria>> GetAll() {
		return ResponseEntity.ok(repositorio.findAll());
	}

	@GetMapping("/acharid/{idCategoria}")
	public ResponseEntity<Categoria> acharPorId(@PathVariable(value = "idCategoria") Long idCategoria) {

		Optional<Categoria> objetoCategoria = repositorio.findById(idCategoria);

		if (objetoCategoria.isPresent()) {
			return ResponseEntity.status(200).body(objetoCategoria.get());
		} else {
			return ResponseEntity.status(204).build();
		}

	}

	@GetMapping("/acharforma/ {formaRemedio}")
	public ResponseEntity<List<Categoria>> acharPorForma(@PathVariable(value = "formaRemedio") String formaRemedio) {

		List<Categoria> objetoCategoria = repositorio.findAllByFormaRemedioContainingIgnoreCase(formaRemedio);

		if (objetoCategoria.isEmpty()) {

			return ResponseEntity.status(204).build();
		} else {
			return ResponseEntity.status(200).body(objetoCategoria);
		}

	}

	@PostMapping ("/salvar")
	public ResponseEntity <Categoria> salvarCategoria (@Valid @RequestBody Categoria categoriaSalva){
		return ResponseEntity.status(201).body(repositorio.save(categoriaSalva));
	}
	
	@PutMapping ("/atualizar")
	public ResponseEntity <Categoria> atualizarCategoria (@Valid @RequestBody Categoria categoriaAtualizada){
		return ResponseEntity.status(201).body(repositorio.save(categoriaAtualizada));
	
	}
	
	@DeleteMapping ("/deletar/{idRemedio}")
	public void deletarRemedioPorId (@PathVariable (value= "idRemedio")Long idCategoria) 
	{
		
		repositorio.deleteById(idCategoria);
		
	}
	
	
	
	
}


	

