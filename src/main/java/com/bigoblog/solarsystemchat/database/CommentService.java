package com.bigoblog.solarsystemchat.database;

import com.bigoblog.solarsystemchat.model.Comment;

import java.util.List;

public interface CommentService {

    boolean addComment(Comment newComment);

    List<Comment> getAllComments();

    //boolean updateComment(Comment comment);

    boolean deleteCommentById(int idComment);

    Comment getCommentById(int idComment);





}
