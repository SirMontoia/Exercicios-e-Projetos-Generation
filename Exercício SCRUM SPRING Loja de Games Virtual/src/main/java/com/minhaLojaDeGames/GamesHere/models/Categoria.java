package com.minhaLojaDeGames.GamesHere.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;


@Entity
public class Categoria {
	
	private @Id @GeneratedValue (strategy = GenerationType.IDENTITY) Long idCategoria;
	private @NotBlank String generoJogo;
	private @NotBlank String origemJogo;
	private @NotBlank String arteJogo;
	private  boolean coopeMultiplayer;
	
	@OneToMany (mappedBy = "numero", cascade = CascadeType.REMOVE)
	private List <Produto> minhasCategorias = new ArrayList<>();
	
	
	public Long getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}
	
	public String getGeneroJogo() {
		return generoJogo;
	}
	public void setGeneroJogo(String generoJogo) {
		this.generoJogo = generoJogo;
	}
	public String getOrigemJogo() {
		return origemJogo;
	}
	public void setOrigemJogo(String origemJogo) {
		this.origemJogo = origemJogo;
	}
	public String getArteJogo() {
		return arteJogo;
	}
	public void setArteJogo(String arteJogo) {
		this.arteJogo = arteJogo;
	}
	public boolean isCoopeMultiplayer() {
		return coopeMultiplayer;
	}
	public void setCoopeMultiplayer(boolean coopeMultiplayer) {
		this.coopeMultiplayer = coopeMultiplayer;
	}
	
	

}
