package com.project.dsvendas.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "tb_sales")
public class Venda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer visited;
	private Integer deals; 
	private Double amount;
	private LocalDate date;
	
	@ManyToOne
	@JoinColumn(name = "seller_id")
	private Vendedor seller;
	
	
	public Venda() {
	}
	
	public Venda(Long id, Integer visitados, Integer fechados, Double quantiaVendida, LocalDate data, Vendedor vendedor) {
		this.id = id;
		this.visited = visitados;
		this.deals = fechados;
		this.amount = quantiaVendida;
		this.date = data;
		this.seller = vendedor;
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

	public Vendedor getSeller() {
		return seller;
	}

	public void setSeller(Vendedor seller) {
		this.seller = seller;
	}		

}
