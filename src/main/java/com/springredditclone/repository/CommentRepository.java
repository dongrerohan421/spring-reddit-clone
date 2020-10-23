package com.springredditclone.repository;

import java.util.List;

import com.springredditclone.model.Comment;
import com.springredditclone.model.Post;
import com.springredditclone.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}
