package com.blogProject.ProjetoBlog.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blogProject.ProjetoBlog.Model.Postagem;
import com.blogProject.ProjetoBlog.Repository.PostagemRepository;

@RestController
@RequestMapping("/postagens")
@CrossOrigin("*")
public class PostagemController {

	
	
	private @Autowired PostagemRepository repository;
	
	@GetMapping
	
	public ResponseEntity<List<Postagem>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Postagem> GetById(@PathVariable long id){
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build()); // Perguntar ao professor 
		
	}
	
	@GetMapping("/titulo/{titulo}") //Entre chaves é um atributo, por isso é necessário colocar mais um caminho denominado titulo, se não o back-end entende como duplicidade de atributo devido ao id anterior 
	public ResponseEntity<List<Postagem>> GetByTitulo(@PathVariable String titulo){
		return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(titulo)); // esse método devolve lista por isso temos que chama-la após o ResponseEntity
	}
	
	
	

}
