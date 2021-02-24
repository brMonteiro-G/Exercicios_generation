package com.farmacia.ExercicioFarmacia.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "Produto")
public class Produto {
     
	public @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id; 
	
	
	public @NotNull @Size(min = 1, max = 500 ) String descricaoTécnica;
	
	@ManyToOne
	@JsonIgnoreProperties("Produto")
	public Categoria categoria;
	
	public @NotNull String nome_remedio;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricaoTécnica() {
		return descricaoTécnica;
	}

	public void setDescricaoTécnica(String descricaoTécnica) {
		this.descricaoTécnica = descricaoTécnica;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getNome_remedio() {
		return nome_remedio;
	}

	public void setNome_remedio(String nome_remedio) {
		this.nome_remedio = nome_remedio;
	}

	
	
	
	
}
