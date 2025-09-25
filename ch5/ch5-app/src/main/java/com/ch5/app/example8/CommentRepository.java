package com.ch5.app.example8;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
//change the bean scope to prototype
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CommentRepository {
	
}
 