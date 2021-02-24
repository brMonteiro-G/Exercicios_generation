package com.farmacia.ExercicioFarmacia.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmacia.ExercicioFarmacia.Model.Produto;
//<Entidade , PK>
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	
	public List<Produto> findAllByDescricaoTécnicaContainingIgnoreCase(String descricaoTécnica); 
	
	

}
