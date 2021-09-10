package com.project.dsvendas.dto;

import java.io.Serializable;

import com.project.dsvendas.entities.Vendedor;

public class SomaVendaDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String nomeVendedor;
	private Double total;
	
	
	public SomaVendaDTO() {
	}

	public SomaVendaDTO(Vendedor vendedor, Double total) {
		this.nomeVendedor = vendedor.getNome();
		this.total = total;
	}

	public String getNomeVendedor() {
		return nomeVendedor;
	}

	public void setNomeVendedor(String nomeVendedor) {
		this.nomeVendedor = nomeVendedor;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}		

}
