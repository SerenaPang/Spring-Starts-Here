package com.ch5.app.example6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	private CommentRepository commentRepository;
	
	public CommentRepository getCommentRepository() {
		return commentRepository;
	}
}
