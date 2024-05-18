package com.nisha.fullstackapplication.service.serviceimpl;

import com.nisha.fullstackapplication.entity.Post;
import com.nisha.fullstackapplication.repository.PostRepository;
import com.nisha.fullstackapplication.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }
    @Override
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }
    @Override
    public Post getPostById(Long id) {
        return postRepository.findById(id).orElse(null);
    }
    @Override
    public Post createPost(Post post) {
        return postRepository.save(post);
    }
    @Override
    public Post updatePost(Long id, Post updatedPost) {
        Post existingPost = postRepository.findById(id).orElse(null);
        if (existingPost != null) {
            existingPost.setTitle(updatedPost.getTitle());
            existingPost.setContent(updatedPost.getContent());
            existingPost.setLanguage(updatedPost.getLanguage());
            existingPost.setCategory(updatedPost.getCategory());
            return postRepository.save(existingPost);
        }
        return null;
    }
    @Override
    public void deletePost(Long id) {
        postRepository.deleteById(id);
    }
}
