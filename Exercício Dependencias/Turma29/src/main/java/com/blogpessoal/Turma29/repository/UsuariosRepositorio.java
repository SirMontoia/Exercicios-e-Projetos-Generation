package com.blogpessoal.Turma29.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blogpessoal.Turma29.model.Usuarios;

@Repository
public interface UsuariosRepositorio extends JpaRepository <Usuarios, Long> {

	
	
}
