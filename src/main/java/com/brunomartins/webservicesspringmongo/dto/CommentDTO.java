package com.brunomartins.webservicesspringmongo.dto;

import java.io.Serializable;
import java.util.Date;

public class CommentDTO implements Serializable {

    private String text;
    private Date date;
    private AuthorDTO authorDTO;

    public CommentDTO(Date date, String text, AuthorDTO authorDTO) {
        this.date = date;
        this.text = text;
        this.authorDTO = authorDTO;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public AuthorDTO getAuthorDTO() {
        return authorDTO;
    }

    public void setAuthorDTO(AuthorDTO authorDTO) {
        this.authorDTO = authorDTO;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public CommentDTO(String text, Date date, AuthorDTO author) {

    }
}
