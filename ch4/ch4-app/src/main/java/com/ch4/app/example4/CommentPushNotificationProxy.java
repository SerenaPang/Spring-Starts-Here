package com.ch4.app.example4;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CommentPushNotificationProxy implements CommentNotificationProxy{

	@Override
	public void sendComment(Comment comment) {
		System.out.println("Sending push notificatin for comment: " + comment.getText());
	}

}
