package com.ch4.app.example5;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//use qualifier to name different implementation
@Qualifier("PUSH")
public class CommentPushNotificationProxy implements CommentNotificationProxy{

	@Override
	public void sendComment(Comment comment) {
		System.out.println("Sending push notificatin for comment: " + comment.getText());
	}

}
