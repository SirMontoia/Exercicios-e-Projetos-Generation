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

import com.farmacia.DrogaECia.modelos.Produto;

import com.farmacia.DrogaECia.repositorio.RepositorioProduto;

@RestController
@RequestMapping("/apifarma/v1/produto")
public class ControladorProduto {

	private @Autowired RepositorioProduto repositorio;

	@GetMapping("/todos")
	private ResponseEntity<List<Produto>> getAll() {
		return ResponseEntity.ok(repositorio.findAll());
	}

	@GetMapping("/acharid/{idProduto}")
	public ResponseEntity<Produto> acharPorId(@PathVariable(value = "idProduto") Long IdProduto) {
		Optional<Produto> objetoProduto = repositorio.findById(IdProduto);

		if (objetoProduto.isPresent()) {
			return ResponseEntity.status(200).body(objetoProduto.get());
		} else {
			return ResponseEntity.status(204).build();
		}
	}

	@GetMapping("/achar/{nome}")
	public ResponseEntity<List<Produto>> acharPorNome(@PathVariable(value = "nome") String nome) {
		List<Produto> objetoProduto = repositorio.findAllByNomeContainingIgnoreCase(nome);

		if (objetoProduto.isEmpty()) {
			return ResponseEntity.status(204).build();
		} else {
			return ResponseEntity.status(200).body(objetoProduto);
		}

	}

	@PostMapping("/salvar")
	public ResponseEntity<Produto> salvarProduto(@Valid @RequestBody Produto produtoSalvo) {
		return ResponseEntity.status(200).body(repositorio.save(produtoSalvo));
	}

	@PutMapping("/atualizar")
	public ResponseEntity<Produto> atualizarProduto(@Valid @RequestBody Produto produtoAtualizado) {
		return ResponseEntity.status(200).body(repositorio.save(produtoAtualizado));
	}

	@DeleteMapping ("/deletar/{idProduto}")
	public void deletarProduto (@PathVariable (value = "idProduto") Long IdProduto ) {
		repositorio.deleteById(IdProduto);
	}
	
	
}
