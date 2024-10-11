package com.ch5.app.example6;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Lazy
public class CommentService {
	public CommentService() {
		System.out.println("CommentService instance created!");
	}
}
