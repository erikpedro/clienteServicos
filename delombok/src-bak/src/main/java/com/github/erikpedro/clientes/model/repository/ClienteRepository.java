package com.github.erikpedro.clientes.model.repository;

import com.github.erikpedro.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
