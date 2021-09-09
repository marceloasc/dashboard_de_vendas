package com.project.dsvendas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.dsvendas.dto.VendaDTO;
import com.project.dsvendas.entities.Venda;
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
		Page<Venda> result = repository.findAll(pageable);
		return result.map(x -> new VendaDTO(x));
	}

}
