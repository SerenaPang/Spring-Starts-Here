package com.ch6.app.example2.service;

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
	
//	public String getSecretMessage() {
//		System.out.println("CommentService.getSecretMessage()");
//		return "Enjoying Spring with Aspects";
//	}
	
}
