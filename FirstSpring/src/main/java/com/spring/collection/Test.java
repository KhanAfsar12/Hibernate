package com.spring.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/collection/collection.spring.cfg.xml");
		Emp emp1 = (Emp) context.getBean("emp1");
		System.out.println(emp1);
		Emp em2 =(Emp) context.getBean("emp2");
		System.out.println(em2);
		
		PDF pdf =(PDF) context.getBean("Demo");
		System.out.println(pdf);
	}
}
