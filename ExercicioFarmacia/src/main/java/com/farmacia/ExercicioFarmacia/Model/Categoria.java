package com.farmacia.ExercicioFarmacia.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "Categoria")
public class Categoria {
     
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id; 
	
	@NotNull
	@Size(min = 3 , max = 20)
	public String nome;
	
	
	@NotNull
	@Size(min = 1 , max = 20 )
	public String marca; 
	
	@NotNull
	@Size(min = 10 , max = 500)
	public String descricao;
	
	@NotNull
	@Size(min = 5 , max = 20)
	public String preco;
	


	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL ) // mappedBy --> Informa para o hibernate quem é o mestre na relação bidirecional 
	@JsonIgnoreProperties("categoria")                             // Por isso não é adequado usar em OneToOne 
	//.ALL --> Significa que todos os tipos de alteração que o hibernate aceita serão repassados no cascade	|| CascadeType --> Significa que todas as alterações serão repercutidas pras entidades filhas 
	public List<Produto> produto;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}


	
	
}
