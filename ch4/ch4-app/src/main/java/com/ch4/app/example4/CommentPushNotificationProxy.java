package com.ch4.app.example4;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//now we have two component spring will not know which one to choose to do injection
@Component
//add primary let spring know choose this first when not specified
@Primary
public class CommentPushNotificationProxy implements CommentNotificationProxy{

	@Override
	public void sendComment(Comment comment) {
		System.out.println("Sending push notificatin for comment: " + comment.getText());
	}

}
