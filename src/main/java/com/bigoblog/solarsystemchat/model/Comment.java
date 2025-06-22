package com.bigoblog.solarsystemchat.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_comment;

    private String id_body;
    private String author;
    private String comment;

    // Para guardar en base de datos, LocalDateTime nos permite parsear a SQL -> TIMESTAMP
    //USAR ETIQUETA @CreationTimestamp para que se guarde la fecha de creación automáticamente
    @CreationTimestamp
    private LocalDateTime date;

    public Comment(){

    }

    public Comment(String id_body, String author, String comment) {
        this.id_body = id_body;
        this.author = author;
        this.comment = comment;
    }

    public int getId_comment() {
        return id_comment;
    }

    public void setId_comment(int id_comment) {
        this.id_comment = id_comment;
    }

    public String getId_body() {
        return id_body;
    }

    public void setId_body(String id_body) {
        this.id_body = id_body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id_comment=" + id_comment +
                ", id_body='" + id_body + '\'' +
                ", author='" + author + '\'' +
                ", comment='" + comment + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
