package com.nisha.fullstackapplication.service;

import com.nisha.fullstackapplication.entity.Post;

import java.util.List;

public interface PostService {

    public List<Post> getAllPosts();

    public Post getPostById(Long id);

    public Post createPost(Post post);

    public Post updatePost(Long id, Post updatedPost);

    public void deletePost(Long id);
}
