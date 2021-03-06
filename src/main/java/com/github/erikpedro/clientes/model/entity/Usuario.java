package com.github.erikpedro.clientes.model.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty(message = "{campo.login.obrigatorio}")
    @Column(unique = true, name = "login")
    private String username;

    @NotEmpty(message = "{campo.senha.obrigatorio}")
    @Column(name = "senha")
    private String password;


}
