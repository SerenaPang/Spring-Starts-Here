package com.ch3.app.example1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.google.common.base.Supplier;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Example 1 App.main()");
		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		
//		Parrot p = context.getBean(Parrot.class);
//		System.out.println(p);
//		System.out.println(p.getName());

		Parrot x = new Parrot();
		x.setName("Kiki");

		Supplier<Parrot> parrotSupplier = () -> x;
		context.registerBean("kiki", Parrot.class, parrotSupplier);

		context.registerBean("parrot1", Parrot.class, parrotSupplier);
		
		Parrot p = context.getBean(Parrot.class);
		System.out.println(p.getName());
		
		
		//context.registerBean("parrot1", Parrot.class, parrotSupplier, bc -> bc.setPrimary(true));
	}
}
