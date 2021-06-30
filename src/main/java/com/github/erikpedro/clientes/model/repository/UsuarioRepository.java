package com.github.erikpedro.clientes.model.repository;

import com.github.erikpedro.clientes.model.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
