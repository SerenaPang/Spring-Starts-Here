package com.ch6.app.example8;

import java.util.logging.Logger;

import org.springframework.stereotype.Service;

@Service
public class CommentService {
	private Logger logger = Logger.getLogger(CommentService.class.getName());
	
	@ToLog
	public String publicComment(Comment comment) {
		logger.info("Publishing comment:" + comment.getText());
		return "SUCEESS";
	}
}
