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


import com.minhaLojaDeGames.GamesHere.models.Produto;

import com.minhaLojaDeGames.GamesHere.repositorio.RepositoryProduto;

@RestController
@RequestMapping ("/apigame/v1/produto")

public class ControllerProduto {
	
	private @Autowired RepositoryProduto repositorio;
	
	
	@GetMapping ("/todos")
	private ResponseEntity <List<Produto>> GetAll(){
		
		return ResponseEntity.ok(repositorio.findAll());
	}


	
	@GetMapping ("/acharIdProduto/{idProduto}")
	public ResponseEntity <Produto> buscaPorId (@PathVariable(value = "idProduto")Long idProduto){
		Optional <Produto> objetoProduto = repositorio.findById(idProduto);
		
		if(objetoProduto.isPresent()) {
			
			return ResponseEntity.status(200).body(objetoProduto.get());
		
		}else {
			
			return ResponseEntity.status(204).build();
		}
	
		
	}

	
	@GetMapping ("/acharporpreco/{preco}")
	public ResponseEntity <List<Produto>> buscaPorNome (@PathVariable (value = "preco") Double preco){
		List <Produto> objetoProduto = repositorio.findAllByPreco(preco);
		
		if (objetoProduto.isEmpty()) {
			return ResponseEntity.status(204).build();
		} else {
			return ResponseEntity.status(200).body(objetoProduto);
		}
	}
	
	@PostMapping ("/salvarProduto")
	public ResponseEntity <Produto> salvarProduto (@Valid @RequestBody Produto novoProduto)
	{
		return ResponseEntity.status(201).body(repositorio.save(novoProduto));
	
	
	}

	
	@PutMapping ("/atualizar")
	public ResponseEntity <Produto> atualizarProduto (@Valid @RequestBody Produto produtoParaAtualizar){
		
		return ResponseEntity.status(201).body (repositorio.save(produtoParaAtualizar));
		
	
	
}
	
	@DeleteMapping ("/delete/{id_produto}")
	public void deletarProdutoPorId (@PathVariable (value = "id_produto") Long idProduto) {
		repositorio.deleteById(idProduto);
	}
}

