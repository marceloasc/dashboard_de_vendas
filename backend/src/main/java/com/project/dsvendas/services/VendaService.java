package com.project.dsvendas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.dsvendas.dto.SomaVendaDTO;
import com.project.dsvendas.dto.SucessoVendaDTO;
import com.project.dsvendas.dto.VendaDTO;
import com.project.dsvendas.entities.Sale;
import com.project.dsvendas.repositories.VendaRepository;
import com.project.dsvendas.repositories.VendedorRepository;


@Service
public class VendaService {
	
	@Autowired
	private VendaRepository repository;
	
	@Autowired
	private VendedorRepository vendedorRepository;
	
	@Transactional(readOnly = true)
	public Page<VendaDTO> findAll(Pageable pageable) {
		vendedorRepository.findAll();
		Page<Sale> result = repository.findAll(pageable);
		return result.map(x -> new VendaDTO(x));
	}
	
	@Transactional(readOnly = true)
	public List<SomaVendaDTO> quantiaAgrupadaPorVendedor () {
		return repository.quantiaAgrupadaPorVendedor();
	}
	
	@Transactional(readOnly = true)
	public List<SucessoVendaDTO> sucessoAgrupadoPorVendedor () {
		return repository.sucessoAgrupadoPorVendedor();
	}

}
