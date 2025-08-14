package com.brunomartins.webservicesspringmongo.resources;

import com.brunomartins.webservicesspringmongo.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value="/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<List<User>> findAll()   {
        User cristiano = new User("1", "Cristiano Ronaldo", "cristianoronaldo@gmail.com");
        User messi = new User("2", "Lionel Messi", "lionelmessi@gmail.com");
        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(cristiano, messi));
        return ResponseEntity.ok().body(list);
    }
}