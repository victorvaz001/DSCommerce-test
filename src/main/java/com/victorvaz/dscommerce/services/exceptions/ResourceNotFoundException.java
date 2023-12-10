package com.victorvaz.dscommerce.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException (String msg){
        super(msg); /*chama o construtor da RuntimeException repassando a mensagem*/
    }
}
