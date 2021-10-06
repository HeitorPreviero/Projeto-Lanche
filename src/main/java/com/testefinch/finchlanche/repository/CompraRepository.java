package com.testefinch.finchlanche.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.testefinch.finchlanche.entites.Compra;

public interface CompraRepository extends JpaRepository<Compra, Long> {
	
}
