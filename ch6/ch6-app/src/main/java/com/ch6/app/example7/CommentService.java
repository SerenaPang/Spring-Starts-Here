package com.ch6.app.example7;

import java.util.logging.Logger;

import org.springframework.stereotype.Service;

@Service
public class CommentService {

	private Logger logger = Logger.getLogger(CommentService.class.getName());

	public void publishComment(Comment comment) {
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
