package com.ch6.app.example8.service;

import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import com.ch6.app.example1.Comment;

@Service
public class CommentService {
	private Logger logger = Logger.getLogger(CommentService.class.getName());
	
	public String publicComment(Comment comment) {
		logger.info("Publishing comment:" + comment.getText());
		return "SUCEESS";
	}
}
