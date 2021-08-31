package com.farmacia.DrogaECia.modelos;



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
	private String categoriaRemedio;
	private @NotBlank String formaRemedio;
	
	@OneToMany (mappedBy = "numero", cascade = CascadeType.REMOVE)
	private List <Produto> minhasCategorias = new ArrayList<>();
	
	
	public Long getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}
		public String getCategoriaRemedio() {
		return categoriaRemedio;
	}
	public void setCategoriaRemedio(String categoriaRemedio) {
		this.categoriaRemedio = categoriaRemedio;
	}
	
	public String getFormaRemedio() {
		return formaRemedio;
	}
	public void setFormaRemedio(String formaRemedio) {
		this.formaRemedio = formaRemedio;
	}
	
	
	
	

}
