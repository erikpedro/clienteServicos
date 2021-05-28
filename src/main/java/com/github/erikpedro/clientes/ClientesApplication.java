package com.github.erikpedro.clientes;

import com.github.erikpedro.clientes.model.entity.Cliente;
import com.github.erikpedro.clientes.model.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClientesApplication {

    @Bean
    public CommandLineRunner runner(@Autowired ClienteRepository clienteRepository){
        return args -> {
            Cliente cliente = Cliente.builder().cpf("87847529041").nome("4devs").build();
            clienteRepository.save(cliente);
        };
    }


    public static void main(String[] args) {
        SpringApplication.run(ClientesApplication.class, args);
    }
}
