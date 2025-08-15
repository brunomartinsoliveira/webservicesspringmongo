package com.brunomartins.webservicesspringmongo.dto;

import com.brunomartins.webservicesspringmongo.domain.User;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collector;

public class UserDTO implements Serializable {

    private String id;
    private String name;
    private String email;

    public UserDTO() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserDTO(User obj) {
        this.id = obj.getId();
        this.name = obj.getName();
        this.email = obj.getEmail();


    }
}