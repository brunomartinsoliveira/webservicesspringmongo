package com.brunomartins.webservicesspringmongo.resources;

import com.brunomartins.webservicesspringmongo.domain.Post;
import com.brunomartins.webservicesspringmongo.domain.User;
import com.brunomartins.webservicesspringmongo.dto.UserDTO;
import com.brunomartins.webservicesspringmongo.services.PostServices;
import com.brunomartins.webservicesspringmongo.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/posts")
public class PostResource {

    @Autowired
    private PostServices service;

    @GetMapping("/{id}")
    public ResponseEntity<Post> findById(@PathVariable String id) {
        Post obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
