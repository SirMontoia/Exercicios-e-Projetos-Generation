package com.minhaLojaDeGames.GamesHere.models;import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
	import javax.validation.constraints.NotBlank;
	import javax.validation.constraints.Size;

	@Entity
	public class Usuario {

	
		private @NotBlank String nome;
		private @NotBlank @Email String email;
		private @NotBlank @Size (min=5) String senha;
		private @Id @GeneratedValue (strategy = GenerationType.IDENTITY) Long IdUsuario;
		
		
		
		public Long getIdUsuario() {
			return IdUsuario;
		}
		public void setIdUsuario(Long idUsuario) {
			IdUsuario = idUsuario;
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


