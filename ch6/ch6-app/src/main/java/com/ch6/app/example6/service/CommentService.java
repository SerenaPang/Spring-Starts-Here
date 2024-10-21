package com.ch6.app.example6.service;

import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import com.ch6.app.example1.Comment;

@Service
public class CommentService {
	private Logger logger = Logger.getLogger(CommentService.class.getName());
	
	public void publicComment(Comment comment) {
		logger.info("Publishing comment:" + comment.getText());
	}
	
	
	@ToLog
	public void deleteComment(Comment comment) {
		logger.info("Deleting commit:" + comment.getText());
	}
	
	public void editComment(Comment comment) {
		logger.info("Editing commit:" + comment.getText());
	}
}
