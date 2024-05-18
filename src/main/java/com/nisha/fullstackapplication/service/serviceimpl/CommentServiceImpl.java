package com.nisha.fullstackapplication.service.serviceimpl;

import com.nisha.fullstackapplication.entity.Comment;
import com.nisha.fullstackapplication.repository.CommentRepository;
import com.nisha.fullstackapplication.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public CommentServiceImpl(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }
    @Override
    public List<Comment> getAllComments() {
        return commentRepository.findAll();
    }
    @Override
    public Comment createComment(Comment comment) {
        return commentRepository.save(comment);
    }
}
