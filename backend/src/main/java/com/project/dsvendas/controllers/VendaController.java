package com.project.dsvendas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.dsvendas.dto.VendaDTO;
import com.project.dsvendas.services.VendaService;

@RestController
@RequestMapping(value = "/vendas")
public class VendaController {
	
	@Autowired
	private VendaService service;
	
	@GetMapping
	public ResponseEntity<Page<VendaDTO>> findAll(Pageable pageable) {
		Page<VendaDTO> lista = service.findAll(pageable);
		return ResponseEntity.ok(lista);
	}

}
