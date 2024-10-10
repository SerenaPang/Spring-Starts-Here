package com.ch5.app.example3;

import org.springframework.stereotype.Service;

@Service
public class CommentService {
	
	private final CommentRepository commentRepository;

	public CommentService( CommentRepository commentRepository) {
		this.commentRepository = commentRepository;
	}
	public CommentRepository getCommentRepository() {
		return commentRepository;
	}
}
