package com.farmacia.DrogaECia.modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;



@Entity
public class Produto {
	
	private @Id @GeneratedValue( strategy = GenerationType.IDENTITY) Long IdProduto;
	private @NotBlank String nome;
	private boolean disponibilidade;
	private double preco;
	private int estoque;
	
	
	@ManyToOne
	@JoinColumn (name = "numero_produto")
	private Categoria numero;
	
	
	
	
	public Categoria getNumero() {
		return numero;
	}
	public void setNumero(Categoria numero) {
		this.numero = numero;
	}
	public Long getIdProduto() {
		return IdProduto;
	}
	public void setIdProduto(Long idProduto) {
		IdProduto = idProduto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isDisponibilidade() {
		return disponibilidade;
	}
	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	

}
