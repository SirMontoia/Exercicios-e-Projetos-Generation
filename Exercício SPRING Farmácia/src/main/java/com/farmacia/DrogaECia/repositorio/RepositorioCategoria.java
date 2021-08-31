package com.farmacia.DrogaECia.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmacia.DrogaECia.modelos.Categoria;



public interface RepositorioCategoria extends JpaRepository <Categoria, Long> {

	public List<Categoria> findAllByFormaRemedioContainingIgnoreCase ( String formatoRemedio);
	
}
