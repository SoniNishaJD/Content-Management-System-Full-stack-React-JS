package com.nisha.fullstackapplication.service;

import com.nisha.fullstackapplication.entity.Comment;

import java.util.List;

public interface CommentService {

    public List<Comment> getAllComments();
    public Comment createComment(Comment comment);
}
