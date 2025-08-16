package com.brunomartins.webservicesspringmongo.resources;

import com.brunomartins.webservicesspringmongo.domain.Post;
import com.brunomartins.webservicesspringmongo.services.PostServices;
import com.brunomartins.webservicesspringmongo.util.URL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/titlesearch")
    public ResponseEntity<List<Post>> findByTitle(@RequestParam(value = "text", defaultValue = "") String text) {
        List<Post> list = service.findByTitle(text);
        return ResponseEntity.ok().body(list);
    }
}
