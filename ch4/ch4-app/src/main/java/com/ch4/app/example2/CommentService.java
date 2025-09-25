package com.ch4.app.example2;

import org.springframework.stereotype.Component;
//spring creates a bean of this class and adds it to its context
@Component
public class CommentService {
	private final CommentRepository commentRepository;
	private final CommentNotificationProxy commentNotificationProxy;
	//use autowired if class has more than one constructor
	//spring use the parameter to inject beans when creating the instances
	public CommentService(CommentRepository commentRepository, CommentNotificationProxy commentNotificationProxy) {
		this.commentRepository = commentRepository;
		this.commentNotificationProxy = commentNotificationProxy;
	}
	
	public void publicComment(Comment comment) {
		commentRepository.storeComment(comment);
		commentNotificationProxy.sendComment(comment);
	}
}
