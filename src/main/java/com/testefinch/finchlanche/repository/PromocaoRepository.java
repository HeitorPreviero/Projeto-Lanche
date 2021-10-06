package com.testefinch.finchlanche.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.testefinch.finchlanche.entites.Promocao;

public interface PromocaoRepository extends JpaRepository<Promocao, Long> {
	
}
