package com.brunomartins.webservicesspringmongo.resources;

import com.brunomartins.webservicesspringmongo.domain.User;
import com.brunomartins.webservicesspringmongo.dto.UserDTO;
import com.brunomartins.webservicesspringmongo.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value="/users")
public class UserResource {

    @Autowired
    private UserServices services;

    @RequestMapping(method=RequestMethod.POST)
    public ResponseEntity<Void> Insert(@RequestBody UserDTO objDto) {
        User obj = services.fromDTO(objDto);
        obj = services.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }
 }