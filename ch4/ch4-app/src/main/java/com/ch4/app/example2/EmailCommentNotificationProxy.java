package com.ch4.app.example2;

import org.springframework.stereotype.Component;
//mark it so spring knows this is the class instance created for implement the interfaces
@Component
public class EmailCommentNotificationProxy implements CommentNotificationProxy{

	@Override
	public void sendComment(Comment comment) {
		System.out.println("Sending notification for comment: " + comment.getText());
	}
}
