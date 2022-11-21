package com.mostain.syed.ahmed.yourthoughts.repository;

import com.mostain.syed.ahmed.yourthoughts.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
