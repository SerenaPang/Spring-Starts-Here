package com.ch4.app.example3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CommentService {
	@Autowired
	private CommentRepository commentRepository;
	@Autowired
	private CommentNotificationProxy commentNotificationProxy;
	
	public CommentService(CommentRepository commentRepository, CommentNotificationProxy commentNotificationProxy) {
		this.commentRepository = commentRepository;
		this.commentNotificationProxy = commentNotificationProxy;
	}

	public void publicComment(Comment comment) {
		commentRepository.storeComment(comment);
		commentNotificationProxy.sendComment(comment);
	}
}
