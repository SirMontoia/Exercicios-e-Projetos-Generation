package com.blogpessoal.Turma29.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blogpessoal.Turma29.model.Postagem;
import com.blogpessoal.Turma29.repository.PostagemRepositorio;

// AQUI SE DEFINE O CONTROLADOR, RESPONSÁVEL PELO ACESSO A PAGINA E SE DEFINE O ENDPOINT DA APLICAÇO
// NO CASO, O MÉTODO PEGAR TODES NOS MOSTRA A LISTA CRIADA EM CIMA DE POSTAGENS

@RestController
@RequestMapping ("/api/v1/postagem")

public class PostagemControlador {
	
		private @Autowired PostagemRepositorio repositorio;
		
		@GetMapping ("/todas")
		
		public List <Postagem> pegarTodes(){
			return repositorio.findAll();
		}
		
		@GetMapping ("/postagemsingular")
		
		public ResponseEntity<Postagem> GetById (@PathVariable Long id_postagem){
		return repositorio.findById(id_postagem).map(resp -> ResponseEntity.ok(resp)).orElse (ResponseEntity.notFound().build());
		}
		
}
