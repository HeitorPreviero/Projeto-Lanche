package com.testefinch.finchlanche.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.testefinch.finchlanche.entites.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
	
}