package com.github.erikpedro.clientes.model.repository;

import com.github.erikpedro.clientes.model.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {
}
