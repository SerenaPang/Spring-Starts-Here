package com.ch6.app.example0;

import java.util.logging.Logger;

import org.springframework.stereotype.Service;

@Service
public class CommentService {
	private Logger logger = Logger.getLogger(CommentService.class.getName());
	
	public void publicComment(Comment comment) {
		logger.info("Publishing comment:" + comment.getText() + " by " + comment.getAuthor());
	}
}
