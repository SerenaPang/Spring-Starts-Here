package com.ch4.app.example2;

import org.springframework.stereotype.Component;
//make spring mark it as an instance of the bean
@Component
public class DBCommentRepository implements CommentRepository {

	@Override
	public void storeComment(Comment comment) {
		System.out.println("Storing comment: " + comment.getText());
	}
}
