package com.ch6.app.example1;

import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import com.ch6.app.example1.Comment;

//use stereotype annotation to add this bean in spring context
@Service
public class CommentService {
	//log the message every time calls the use case
	private Logger logger = Logger.getLogger(CommentService.class.getName());
	
	//defines the use case
	public void publicComment(Comment comment) {
		logger.info("Publishing comment:" + comment.getText());
	}
}
