package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    
	public static void main(String[] args) {
		
		System.out.println("Project started ..");
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory factory  = configuration.buildSessionFactory();
		
		Sahil sahil = new Sahil();
		
		sahil.setId(1);
		
		sahil.setName("sahil");
		
		sahil.setEmail("sahil@gmail.com");
		
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(sahil);
		tx.commit();
		System.out.println(factory);
		
		
		factory.close();
		
	}
	
}