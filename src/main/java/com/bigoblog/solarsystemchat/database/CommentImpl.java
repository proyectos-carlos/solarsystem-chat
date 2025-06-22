package com.bigoblog.solarsystemchat.database;

import com.bigoblog.solarsystemchat.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentImpl implements CommentService {

    @Autowired
    CommentaryRepository repository;

    @Override
    public boolean addComment(Comment newComment) {
        repository.save(newComment);
        return true;
    }

    @Override
    public List<Comment> getAllComments() {
        return repository.findAll();
    }

    @Override
    public boolean deleteCommentById(int idComment) {
        if(repository.findById(idComment).isPresent()) {
            repository.deleteById(idComment);
            return true;
        }
        return false;
    }

    @Override
    public Comment getCommentById(int idComment) {
        return repository.findById(idComment).orElse(null);
    }



}
