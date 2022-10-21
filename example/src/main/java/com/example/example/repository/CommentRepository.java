package com.example.example.repository;

import com.example.example.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findByUserIdAndPostId(Long userId, Long postId);


    List<Comment> findByUserId(Long userId);

    List<Comment> findByPostId(Long postId);
}
