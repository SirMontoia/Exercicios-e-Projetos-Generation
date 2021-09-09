package com.minhaLojaDeGames.GamesHere.servicos;

import java.nio.charset.Charset;
import java.util.Optional;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.minhaLojaDeGames.GamesHere.models.Usuario;
import com.minhaLojaDeGames.GamesHere.models.utilities.UsuarioDTO;
import com.minhaLojaDeGames.GamesHere.repositorio.RepositoryUsuario;


@Service
public class UsuarioServicos {

	private @Autowired RepositoryUsuario repositorio;
	
	public Optional <Object> cadastrarUsuario (Usuario novoUsuario){
		return repositorio.findByEmail(novoUsuario.getEmail()).map(usuarioExistente -> {
			return Optional.empty();
		}).orElseGet(() -> {
			BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
			String result = encoder.encode (novoUsuario.getSenha());
			novoUsuario.setSenha(result);
			return Optional.ofNullable(repositorio.save(novoUsuario));
		});
	}
	
	
	
public Optional<?> pegarCredenciais(UsuarioDTO usuarioParaAutenticar){
		return repositorio.findByEmail(usuarioParaAutenticar.getEmail()).map(usuarioExistente ->{
			BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
			
			if (encoder.matches(usuarioParaAutenticar.getSenha(), usuarioExistente.getSenha())) {
				
					String estruturaBasic = usuarioParaAutenticar.getEmail() + ":" + usuarioParaAutenticar.getSenha();
					byte[] autorizacaoBase64 = Base64.encodeBase64(estruturaBasic.getBytes(Charset.forName("US-ASCII")));
					String autorizacaoHeader = "Basic " + new String(autorizacaoBase64);	
					
					usuarioParaAutenticar.setToken (autorizacaoHeader);
					usuarioParaAutenticar.setId (usuarioExistente.getIdUsuario());
					usuarioParaAutenticar.setNome (usuarioExistente.getNome());
					usuarioParaAutenticar.setSenha (usuarioExistente.getSenha());
					return Optional.ofNullable(usuarioParaAutenticar);
					
					
			} else {
				return Optional.empty();
			}
			
		}).orElseGet(() -> {
			return Optional.empty();
		});
	}
}
