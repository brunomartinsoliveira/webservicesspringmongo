package com.brunomartins.webservicesspringmongo.services;

import com.brunomartins.webservicesspringmongo.domain.Post;
import com.brunomartins.webservicesspringmongo.repository.PostRepository;
import com.brunomartins.webservicesspringmongo.servies.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostServices {

    @Autowired
    private PostRepository repository;

    public Post findById(String id) {
        Optional<Post> post = repository.findById(id);
        return post.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}
