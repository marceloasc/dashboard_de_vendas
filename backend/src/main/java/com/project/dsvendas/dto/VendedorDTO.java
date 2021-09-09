package com.project.dsvendas.dto;

import java.io.Serializable;

import com.project.dsvendas.entities.Vendedor;

public class VendedorDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	
	
	public VendedorDTO() {
	}

	public VendedorDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public VendedorDTO(Vendedor entity) {
		id = entity.getId();
		name = entity.getNome();
	}
	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
}
