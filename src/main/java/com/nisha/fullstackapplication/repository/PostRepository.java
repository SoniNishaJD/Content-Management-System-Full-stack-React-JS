package com.nisha.fullstackapplication.repository;

import com.nisha.fullstackapplication.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findByLanguage(String language);
}
