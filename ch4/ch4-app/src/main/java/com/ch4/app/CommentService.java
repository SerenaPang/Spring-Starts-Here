package com.ch4.app;

public class CommentService {
	//define the 2 dependencies as the attributes of the class
	private final CommentRepository commentRepository;
	private final CommentNotificationProxy commentNotificationProxy;
	
	//provide the 2 dependencies when object is built through the parameters of the constructor
	public CommentService(CommentRepository commentRepository, CommentNotificationProxy commentNotificationProxy) {
		this.commentRepository = commentRepository;
		this.commentNotificationProxy = commentNotificationProxy;
	}
	
	//defining the use case of service which can store and send comment
	public void publicComment(Comment comment) {
		commentRepository.storeComment(comment);
		commentNotificationProxy.sendComment(comment);
	}
}
