package com.minhaLojaDeGames.GamesHere.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minhaLojaDeGames.GamesHere.models.Produto;

public interface RepositoryProduto extends JpaRepository <Produto, Long> {

	public List <Produto> findAllByPreco (Double preco);
	
}
