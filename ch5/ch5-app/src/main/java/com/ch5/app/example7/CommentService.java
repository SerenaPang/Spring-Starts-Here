package com.ch5.app.example7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
	@Autowired
	private  CommentRepository commentRepository;
	public CommentRepository getCommentRepository() {
		return commentRepository;
	}
}
