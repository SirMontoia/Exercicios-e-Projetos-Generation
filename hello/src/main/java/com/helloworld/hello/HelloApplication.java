package com.helloworld.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RequestMapping("/")
@RestController
public class HelloApplication {
	
	@GetMapping ("/exercicio1")
	public String helloworld(){
		return "Para esta atividade, tive de focar na mentalidade de "
				+ "crescimento e tive de demonstrar persistência em aprender o passo a passo";
	}
	
	@GetMapping ("/exercicio2")
	public String helloworld2() {
		return " Nesta semana, espero conseguir compreender o básico em desenvolvimento web, desde a criação correta do arquivo"
				+ "gerado no Spring initialize até a compreensão da inserção de cada método e import dentro do POM e do executável.";
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}

}
