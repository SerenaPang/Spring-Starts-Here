package com.ch4.app.example5;

import org.springframework.stereotype.Component;

@Component
public class DBCommentRepository implements CommentRepository {

	@Override
	public void storeComment(Comment comment) {
		System.out.println("Storing comment: " + comment.getText());
	}
}
