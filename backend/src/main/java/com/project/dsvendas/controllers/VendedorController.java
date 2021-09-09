package com.project.dsvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.dsvendas.dto.VendedorDTO;
import com.project.dsvendas.services.VendedorService;

@RestController
@RequestMapping(value = "/vendedores")
public class VendedorController {
	
	@Autowired
	private VendedorService service;
	
	
	@GetMapping
	public ResponseEntity<List<VendedorDTO>> findAll() {
		List<VendedorDTO> lista = service.findAll();
		return ResponseEntity.ok(lista);
	}

}
