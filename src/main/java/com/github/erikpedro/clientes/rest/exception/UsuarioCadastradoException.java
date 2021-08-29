package com.github.erikpedro.clientes.rest.exception;

public class UsuarioCadastradoException extends  RuntimeException{

    public UsuarioCadastradoException(String login){
        super("Usuario Ja Cadastrado para o login " + login );
    }


}
