package com.ch5.app.example8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

//this is a singleton, which means spring only creates 1 instance of this class
@Service
public class CommentService {
	@Autowired
	private ApplicationContext context;
	public void sendComment(Comment c) {
	//	CommentProcessor p = new CommentProcessor();
		//a new instance always provided here
		CommentProcessor p = context.getBean(CommentProcessor.class);
		p.setComment(c);
		//use the processor to modify the comment instance
		p.processComment(c);
		p.validateComment(c);
		//gets the modified comment instance and uses it further
		c = p.getComment();
	}

}
