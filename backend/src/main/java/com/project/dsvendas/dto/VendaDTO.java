package com.project.dsvendas.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.project.dsvendas.entities.Sale;

public class VendaDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Integer visited;
	private Integer deals; 
	private Double amount;
	private LocalDate date;
	
	private VendedorDTO vendedor;
	
	
	public VendaDTO() {
	}

	public VendaDTO(Long id, Integer visited, Integer deals, Double amount, LocalDate date, VendedorDTO vendedor) {
		this.id = id;
		this.visited = visited;
		this.deals = deals;
		this.amount = amount;
		this.date = date;
		this.vendedor = vendedor;
	}
	
	public VendaDTO(Sale entity) {
		this.id = entity.getId();
		this.visited = entity.getVisited();
		this.deals = entity.getDeals();
		this.amount = entity.getAmount();
		this.date = entity.getDate();
		this.vendedor = new VendedorDTO(entity.getSeller());
	}
		

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getVisited() {
		return visited;
	}

	public void setVisited(Integer visited) {
		this.visited = visited;
	}

	public Integer getDeals() {
		return deals;
	}

	public void setDeals(Integer deals) {
		this.deals = deals;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public VendedorDTO getVendedor() {
		return vendedor;
	}

	public void setVendedor(VendedorDTO vendedor) {
		this.vendedor = vendedor;
	}

}
