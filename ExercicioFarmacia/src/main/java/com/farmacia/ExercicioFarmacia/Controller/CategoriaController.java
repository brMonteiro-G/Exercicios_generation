package com.farmacia.ExercicioFarmacia.Controller;

import java.util.List;

import javax.validation.Valid;

//import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.farmacia.ExercicioFarmacia.Repository.CategoriaRepository;

import com.farmacia.ExercicioFarmacia.Model.Categoria;
//import com.farmacia.ExercicioFarmacia.Repository.CategoriaRepository;

@RestController
@CrossOrigin("*")
@RequestMapping("/Categorias")
public class CategoriaController {

	private @Autowired CategoriaRepository repository; 
	
	@GetMapping
	public ResponseEntity<List<Categoria>> findAllCategoria(){
	return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity <Categoria> findById( @PathVariable Long id){
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/descricao/{descricao}")
	public ResponseEntity <List<Categoria>> findByDescriçãoCategoria(@PathVariable String descricao){
		return ResponseEntity.ok(repository.findAllByDescricaoContainingIgnoreCase(descricao));
	}
	
	
	@PostMapping 
	public ResponseEntity<Categoria> postCategoria(@Valid @RequestBody Categoria categoria ){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(categoria));
	}
	
	@PutMapping
	public ResponseEntity <Categoria> putCategoria(@Valid @RequestBody Categoria categoria){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(categoria));
		
	}
	
	@DeleteMapping("/{id}")
	public void deleteCategoria(@PathVariable Long id){
		repository.deleteById(id);
	}
 }
