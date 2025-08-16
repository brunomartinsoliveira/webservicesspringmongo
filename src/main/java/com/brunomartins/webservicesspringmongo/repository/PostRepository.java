package com.brunomartins.webservicesspringmongo.repository;

import com.brunomartins.webservicesspringmongo.domain.Post;
import com.brunomartins.webservicesspringmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

    List<Post> findByTitleContaining(String text);
}
