package com.brunomartins.webservicesspringmongo.domain;

import com.brunomartins.webservicesspringmongo.dto.AuthorDTO;
import com.brunomartins.webservicesspringmongo.dto.CommentDTO;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.xml.crypto.Data;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Document
public class Post implements Serializable {

    @Id
    private String id;
    private Data date;
    private String title;
    private String body;
    private AuthorDTO author;

    private List<CommentDTO> comments = new ArrayList<>();

    public Post(String id, Date parse, String title, String body, AuthorDTO author)   {
    }

    public Post(String id, String body, String title, Data date, AuthorDTO author) {
        this.id = id;
        this.body = body;
        this.title = title;
        this.date = date;
        this.author = author;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Data getDate() {
        return date;
    }

    public void setDate(Data date) {
        this.date = date;
    }

    public AuthorDTO getAuthor() {
        return author;
    }

    public List<CommentDTO> getComments() {
        return comments;
    }

    public void setComments(List<CommentDTO> comments) {
        this.comments = comments;
    }

    public void setAuthor(AuthorDTO author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return Objects.equals(getId(), post.getId()) && Objects.equals(getDate(), post.getDate()) && Objects.equals(getTitle(), post.getTitle()) && Objects.equals(getBody(), post.getBody());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getDate(), getTitle(), getBody());
    }
}
