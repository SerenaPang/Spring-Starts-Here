package com.ch5.app.example4;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
//The lazy annotation tells spring that it needs to created the bean only when someone refers to the bean for the first time
@Lazy
public class CommentService {
	public CommentService() {
		System.out.println("CommentService instance created!");
	}
}
