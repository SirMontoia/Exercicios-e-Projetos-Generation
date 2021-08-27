package com.blogpessoal.Turma29.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blogpessoal.Turma29.model.Usuarios;

@Repository
public interface UsuariosRepositorio extends JpaRepository <Usuarios, Long> {
		
	// AQUI SE DECLAROU UM MÉTODO QUE PODE SER CHAMADO COMO UMA DAS FORMAS DE FINDALLBY
	// ABAIXO, SEGUE PRIMEIRO SUA DOCUMENTAÇÃO DEPOIS O MÉTODO EM SI
	
	/*
	 * 
	 * Método utilizado para pesquisar coluna nome ContainingIgnoreCase
	 *
	 * 
	 * @param nome do tipo String
	 * @return List de  Usuarios
	 * @author Turma 29
	 */
	
	List <Usuarios> findAllByNomeContainingIgnoreCase (String nome);
	
	
	
}
