package com.ch4.app.example6;

import org.springframework.stereotype.Repository;

@Repository
public class DBCommentRepository implements CommentRepository {

	@Override
	public void storeComment(Comment comment) {
		System.out.println("Storing comment: " + comment.getText());
	}
}
