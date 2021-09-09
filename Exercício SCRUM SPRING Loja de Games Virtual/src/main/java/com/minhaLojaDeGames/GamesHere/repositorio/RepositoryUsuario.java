package com.minhaLojaDeGames.GamesHere.repositorio;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.minhaLojaDeGames.GamesHere.models.Usuario;

@Repository
public interface RepositoryUsuario extends JpaRepository <Usuario, Long> {

	public List <Usuario> findAllByEmailContainingIgnoreCase (String email);
	
	Optional<Usuario> findByEmail (String email);
}
