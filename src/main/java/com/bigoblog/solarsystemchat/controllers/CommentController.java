package com.bigoblog.solarsystemchat.controllers;

import com.bigoblog.solarsystemchat.database.CommentService;
import com.bigoblog.solarsystemchat.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*") // Para no bloquear peticiones JavaScript
@RestController
public class CommentController {
    @Autowired
    private CommentService commentService;

    @PostMapping(value = "comments", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.TEXT_PLAIN_VALUE)
    public String addComment(@RequestBody Comment newComment) {
        boolean success = commentService.addComment(newComment);
        if (success) return "Comment added successfully!";
        else return "Failed to add comment";
    }

    @GetMapping(value = "comments", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Comment> getAllComments() {
        return commentService.getAllComments();
    }

    @GetMapping(value = "comments/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Comment getCommentById(@PathVariable("id") int idComment) {
        return commentService.getCommentById(idComment);
    }

    @DeleteMapping(value = "comments/{id}", produces = MediaType.TEXT_PLAIN_VALUE)
    public String deleteCommentById(@PathVariable("id") int idComment){
        boolean success = commentService.deleteCommentById(idComment);
        if(success) return "Comment deleted successfully!";
        else return "Comment does not exist";
    }
}
