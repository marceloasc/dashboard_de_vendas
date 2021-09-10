package com.project.dsvendas.repositories;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.dsvendas.dto.SomaVendaDTO;
import com.project.dsvendas.dto.SucessoVendaDTO;
import com.project.dsvendas.entities.Sale;

public interface VendaRepository extends JpaRepository<Sale, Long>{
	
	@Query("SELECT new com.project.dsvendas.dto.SomaVendaDTO(obj.seller, SUM(obj.amount)) FROM Sale AS obj GROUP BY obj.seller")
	List<SomaVendaDTO> quantiaAgrupadaPorVendedor ();
	
	@Query("SELECT new com.project.dsvendas.dto.SucessoVendaDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) FROM Sale AS obj GROUP BY obj.seller")
	List<SucessoVendaDTO> sucessoAgrupadoPorVendedor ();
	
}
