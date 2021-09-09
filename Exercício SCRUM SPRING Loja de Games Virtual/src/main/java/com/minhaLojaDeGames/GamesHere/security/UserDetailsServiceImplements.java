package com.minhaLojaDeGames.GamesHere.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.minhaLojaDeGames.GamesHere.models.Usuario;
import com.minhaLojaDeGames.GamesHere.repositorio.RepositoryUsuario;

@Service
public class UserDetailsServiceImplements implements UserDetailsService {
	
	private @Autowired RepositoryUsuario repositorio;
	
	
	@Override
	public UserDetails loadUserByUsername (String username) throws UsernameNotFoundException{
		Optional <Usuario> objetoOptional = repositorio.findByEmail(username);
		
		if(objetoOptional.isPresent()) {
			return new UserDetailsImplements (objetoOptional.get());
		}else {
			throw new UsernameNotFoundException (username + "Não existe!");
		}
	}
	

}
