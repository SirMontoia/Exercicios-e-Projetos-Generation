package com.blogpessoal.Turma29.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blogpessoal.Turma29.model.Postagem;

// INTERFACE RESPONSÁVEL POR GUARDAR DADOS DA POSTAGEM

@Repository
public interface PostagemRepositorio extends JpaRepository <Postagem, Long> {

}
