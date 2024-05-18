package com.nisha.fullstackapplication.repository;

import com.nisha.fullstackapplication.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
