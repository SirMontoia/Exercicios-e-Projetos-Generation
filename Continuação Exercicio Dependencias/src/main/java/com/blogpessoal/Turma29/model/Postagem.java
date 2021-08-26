package com.blogpessoal.Turma29.model;

// Nos modelos, determinamos a existência e os atributos das tabelas

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

// Com Entity está se determinando que esta classe Postagem é uma entidade do banco de dados
// Em outras palavras, Entity determina que a classe abaixo será uma entidade do Jpa Hibernate

@Entity
public class Postagem {
// DETERMINANDO OS ATRIBUTOS DA TABELA POSTAGEM DENTRO DO MYSQL (COLUNAS)
// O PRIMEIRO ATRIBUTO É DEFINIDO COMO ID (PRIMARY KEY) E COM GENERATED VALUE 
// NOT BLANK DEFINE COMO IMPOSSIVEL A ENTRADA DE DADOS VAZIOS PARA OS RESPECTIVOS ATRIBUTOS
// AO RODAR A APLICAÇÃO DEPOIS DESSA INSERÇÃO, É GERADA UMA TABELA POSTAGEM NO BD 
	
	private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long idPostagem; 
	private @NotBlank String titulo;
	private @NotBlank String descricao;
	
	
	public Long getIdPostagem() {
		return idPostagem;
	}
	public void setIdPostagem(Long idPostagem) {
		this.idPostagem = idPostagem;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



}
