package com.brunomartins.webservicesspringmongo.dto;

import com.brunomartins.webservicesspringmongo.domain.User;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collector;

public class UserDTO implements Serializable {

    private String id;
    private String name;
    private String email;

    public UserDTO()    {
    }
    public UserDTO(User obj)    {
        id = obj.getId();
        name = obj.getName();
        email = obj.getEmail();
    }

    public Object collect(Collector<Object,?, List<Object>> list) {
        return null;
    }
}
