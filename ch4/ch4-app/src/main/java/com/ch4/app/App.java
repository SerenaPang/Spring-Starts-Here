package com.ch4.app;

/**
 *
 */
public class App {
	public static void main(String[] args) {
		var commentRepository = new DBCommentRepository();
		var commentNotificationProxy = new EmailCommentNotificationProxy();
		var commentService = new CommentService(commentRepository, commentNotificationProxy);

		var comment = new Comment();
		comment.setAuthor("Laurentiu");
		comment.setText("Demo comment");
		
		commentService.publicComment(comment);
	}
}
