package com.brunomartins.webservicesspringmongo.servies.exception;

public class ObjectNotFoundException extends RuntimeException {

    public ObjectNotFoundException(String msg)  {
        super(msg);
    }
}
