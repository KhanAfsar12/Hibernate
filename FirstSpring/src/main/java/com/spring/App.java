package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App{
    public static void main( String[] args ){

    	ApplicationContext context = new ClassPathXmlApplicationContext("Spring.cfg.xml");
    	Student st=(Student) context.getBean("student1");
    	System.out.println(st);
    	
    	Student st1 =(Student) context.getBean("student2");
    	System.out.println(st1);
    	
    	Afsar afsar = (Afsar) context.getBean("student3");
    	System.out.println(afsar);
    	
    	
    }
}
