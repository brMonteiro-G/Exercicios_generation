package com.LojaGames.MinhaLojaDeGames.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity @Table(name = "Usuário")
public class Usuario {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	
	@NotNull @Size(min = 5, max = 20)
	private String nome;
	
	@NotNull @Size(min = 5, max = 15)
	private Integer numAcesso;

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

	public Integer getNumAcesso() {
		return numAcesso;
	}

	public void setNumAcesso(Integer numAcesso) {
		this.numAcesso = numAcesso;
	}
	
	

}
