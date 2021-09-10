package com.project.dsvendas.dto;

import java.io.Serializable;

import com.project.dsvendas.entities.Vendedor;

public class SucessoVendaDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String nomeVendedor;
	private Long visited;
	private Long deals;
	
	public SucessoVendaDTO() {
	}	

	public SucessoVendaDTO(Vendedor seller, Long visited, Long deals) {
		nomeVendedor = seller.getNome();
		this.visited = visited;
		this.deals = deals;
	}

	public String getNomeVendedor() {
		return nomeVendedor;
	}

	public void setNomeVendedor(String nomeVendedor) {
		this.nomeVendedor = nomeVendedor;
	}

	public Long getVisited() {
		return visited;
	}

	public void setVisited(Long visited) {
		this.visited = visited;
	}

	public Long getDeals() {
		return deals;
	}

	public void setDeals(Long deals) {
		this.deals = deals;
	}

}
