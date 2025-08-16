package com.brunomartins.webservicesspringmongo.repository;

import com.brunomartins.webservicesspringmongo.domain.Post;
import com.brunomartins.webservicesspringmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

    @Query("{ 'title': { $regex: ?0, $options: 'i' } }")
    List<Post>  searchTitle(String text);

    List<Post> findByTitleContaining(String text);
}
