package com.nisha.fullstackapplication.controller;

import com.nisha.fullstackapplication.entity.Comment;
import com.nisha.fullstackapplication.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comments")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @GetMapping("/")
    public List<Comment> getAllComments() {
        return commentService.getAllComments();
    }

    @PostMapping("/")
    public Comment createComment(@RequestBody Comment comment) {
        return commentService.createComment(comment);
    }

}

