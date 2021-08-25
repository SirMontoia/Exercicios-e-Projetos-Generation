package com.blogpessoal.Turma29.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

// Embaixo, está se determinando que esta classe Postagem é uma entidade

@Entity
public class Postagem {
// DETERMINANDO OS ATRIBUTOS DA TABELA POSTAGEM DENTRO DO MYSQL (COLUNAS)
	
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
