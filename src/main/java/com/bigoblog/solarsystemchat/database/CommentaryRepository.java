package com.bigoblog.solarsystemchat.database;

import com.bigoblog.solarsystemchat.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentaryRepository extends JpaRepository<Comment, Integer>{

}
