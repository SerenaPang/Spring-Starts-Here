package com.ch6.app.example6.service;

import org.springframework.stereotype.Service;

import com.ch6.app.example6.Comment;
import com.ch6.app.example6.ToLog;

@Service
public class CommentService {
	
	public CommentService() {
		System.out.println("CommentService.CommentService()");
	}
	
	public void publicComment(Comment comment) {
		System.out.println("Publishing comment:" + comment.getText());
	}
	
	@ToLog
	public void deleteComment(Comment comment) {
		System.out.println("Deleting commit:" + comment.getText());
	}
	
	public void editComment(Comment comment) {
		System.out.println("Editing commit:" + comment.getText());
	}
}
