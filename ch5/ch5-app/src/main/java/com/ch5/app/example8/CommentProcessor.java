package com.ch5.app.example8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//change it to be a prototype bean to avoid race condition
@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)

public class CommentProcessor {
	private Comment comment;
	@Autowired
	private CommentRepository commentRepository;

	public Comment getComment() {
		return comment;
	}

	public void setComment(Comment comment) {
		this.comment = comment;
	}
	
	//two methods alter the value of the comment attribute
	public void processComment() {
		//change comment attribute
	}
	
	public void validateComment() {
		//validating and changing the comment attribute
	}

	public void processComment(Comment c) {
		
	}

	public void validateComment(Comment c) {
		
	}
}
