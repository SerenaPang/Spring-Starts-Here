package com.ch6.app.example6;

import java.util.logging.Logger;

import org.springframework.stereotype.Service;

@Service
public class CommentService {
	private Logger logger = Logger.getLogger(CommentService.class.getName());
	
	public String publishComment(Comment comment) {
		logger.info("Publishing comment:" + comment.getText());
		//make the intercepted method returns a value
		return "SUCCESS";
	}
	
//	public CommentService() {
//		System.out.println("CommentService.CommentService()");
//	}
//	
//	public void publicComment(Comment comment) {
//		System.out.println("Publishing comment:" + comment.getText());
//	}
//	
//	@ToLog
//	public void deleteComment(Comment comment) {
//		System.out.println("Deleting commit:" + comment.getText());
//	}
//	
//	public void editComment(Comment comment) {
//		System.out.println("Editing commit:" + comment.getText());
//	}
}
