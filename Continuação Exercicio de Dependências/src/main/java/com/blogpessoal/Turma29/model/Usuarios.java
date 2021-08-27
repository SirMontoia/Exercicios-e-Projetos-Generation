package com.blogpessoal.Turma29.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Usuarios {

	// DECLARAÇÃO DE MAIS UMA TABELA, AGORA COM EMAIL (IMPORTAR A BIBLIOTECA) E UMA SENHA (IMPORTAR SIZE)
	// SE DETERMINOU O TAMANHO MÍNIMO DA SENHA
	
	private @Id @GeneratedValue (strategy = GenerationType.IDENTITY) Long idUsuario;
	private @NotBlank String nome;
	private @NotBlank @Email String email;
	private @NotBlank @Size (min=5) String senha;
	
	//ABAIXO SEGUE A UNIÃO ENTRE TABELAS (RELACIONAR ENTIDADES)
	//UNIR USUARIOS COM POSTAGEM
	// ONE TO MANY POIS UM USUARIO PODE CRIAR MÚLTIPLAS POSTAGENS
	// ELE É MAPEADO PELA CLASSE POSTAGEM (PAI DO RELACIONAMENTO)
	// CASCADE EXISTE PARA QUE A DELEÇÃO DE UMA POSTAGEM NÃO DELETE O USUARIO JUNTO
	
	@OneToMany (mappedBy = "criador", cascade = CascadeType.REMOVE)
	private List<Postagem> minhasPostagens = new ArrayList<>();
	
	public Long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
