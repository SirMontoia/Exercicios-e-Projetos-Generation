package com.minhaLojaDeGames.GamesHere.models;






import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.validation.constraints.NotBlank;

import com.sun.istack.NotNull;

@Entity
public class Produto {
	
	private @Id @GeneratedValue (strategy = GenerationType.IDENTITY) Long idProduto;
	private @NotNull double preco;
	private boolean lancamento;
	private boolean edicaoEspecial;
	private @NotBlank String nome;
	private @NotNull String dataDeLancamento;
	
	
	@ManyToOne
	@JoinColumn (name = "numero_produto")
	private Categoria numero;
	
	
	
	public Long getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}

	public boolean isEdicaoEspecial() {
		return edicaoEspecial;
	}
	public void setEdicaoEspecial(boolean edicaoEspecial) {
		this.edicaoEspecial = edicaoEspecial;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isLancamento() {
		return lancamento;
	}
	public void setLancamento(boolean lancamento) {
		this.lancamento = lancamento;
	}
	
	public Categoria getNumero() {
		return numero;
	}
	public void setNumero(Categoria numero) {
		this.numero = numero;
	}
	public String getDataDeLancamento() {
		return dataDeLancamento;
	}
	public void setDataDeLancamento(String dataDeLancamento) {
		this.dataDeLancamento = dataDeLancamento;
	}
	
	
	
	
	
	

}
