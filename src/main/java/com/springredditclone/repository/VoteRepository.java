package com.springredditclone.repository;

import java.util.Optional;

import com.springredditclone.model.Post;
import com.springredditclone.model.User;
import com.springredditclone.model.Vote;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}
