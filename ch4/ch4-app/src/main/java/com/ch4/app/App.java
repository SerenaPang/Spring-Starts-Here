package com.ch4.app;

/**
 *
 */
public class App {
	public static void main(String[] args) {
		//create instances for the dependencies
		var commentRepository = new DBCommentRepository();
		var commentNotificationProxy = new EmailCommentNotificationProxy();
		//create the instance of the service class and providing the dependencies
		var commentService = new CommentService(commentRepository, commentNotificationProxy);

		//creates the instance of comments to send  as a parameter to the publish comment use case
		var comment = new Comment();
		comment.setAuthor("Laurentiu");
		comment.setText("Demo comment");
		
		//call the publish comment use case
		commentService.publicComment(comment);
	}
}
