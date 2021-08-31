package com.farmacia.DrogaECia.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmacia.DrogaECia.modelos.Produto;

public interface RepositorioProduto extends JpaRepository <Produto, Long> {

	public List <Produto> findAllByNomeContainingIgnoreCase (String nome);

}

