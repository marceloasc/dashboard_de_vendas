package com.project.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.dsvendas.entities.Vendedor;

public interface VendedorRepository extends JpaRepository<Vendedor, Long> {
	
	

}
