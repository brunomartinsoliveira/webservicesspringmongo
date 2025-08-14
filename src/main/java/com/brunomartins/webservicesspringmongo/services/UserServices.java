package com.brunomartins.webservicesspringmongo.services;

import com.brunomartins.webservicesspringmongo.domain.User;
import com.brunomartins.webservicesspringmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServices {

    @Autowired
    private UserRepository  repo;

    public List<User> findAll()   {
        return repo.findAll();
    }

}
