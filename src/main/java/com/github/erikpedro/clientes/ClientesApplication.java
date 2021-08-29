package com.github.erikpedro.clientes;

import com.github.erikpedro.clientes.model.entity.Cliente;
import com.github.erikpedro.clientes.model.entity.Usuario;
import com.github.erikpedro.clientes.model.repository.ClienteRepository;
import com.github.erikpedro.clientes.model.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClientesApplication {

    @Bean
    public CommandLineRunner runner(@Autowired ClienteRepository clienteRepository, UsuarioRepository usuarioRepository){
        return args -> {
            Cliente cliente = Cliente.builder().cpf("87847529041").nome("4devs").build();
            Usuario usuario = Usuario.builder().username("4devs").password("1234").build();
            usuarioRepository.save(usuario);
            clienteRepository.save(cliente);

        };
    }


    public static void main(String[] args) {
        SpringApplication.run(ClientesApplication.class, args);
    }
}
