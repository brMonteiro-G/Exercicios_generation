package com.farmacia.ExercicioFarmacia.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farmacia.ExercicioFarmacia.Model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria , Long>{
	
	public List<Categoria> findAllByDescricaoContainingIgnoreCase(String descricao); // Sobrescrevendo a função findBy com o nome da coluna que vou usar(query method)

}
