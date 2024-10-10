package com.ch5.app.example4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentRepository {
	@Autowired
	private CommentRepository commentRepository;
	
	public CommentRepository getCommentRepository() {
		return commentRepository;
	}
}
 