package OneToMany;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class OneToMany {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		 
//		Question1 q =  new Question1();
//		q.setQuestionId(1);
//		q.setQuestion("How many population of India?");
//		
//	
//		Answer1 a = new Answer1();
//		a.setAnswerId(12);
//		a.setAnswer("The population of india is 1.4 Billion");
//		a.setQuestion1(q);
//		
//		
//		Answer1 b = new Answer1();
//		b.setAnswerId(11);
//		b.setAnswer("The population of india is 1.5 Billion");
//	    b.setQuestion1(q);
//		
//		
//		List<Answer1> list = new ArrayList<>();
//		list.add(a);
//		list.add(b);
//		
//		q.setAnswer(list);
//		
		
		
		
		Session s = factory.openSession();
        Transaction tx = s.beginTransaction();
		
		
//	s.save(a);
//	s.save(b);
//	s.save(q);
//	
	Question1 red = (Question1)s.get(Question1.class, 1);
	System.out.println(red.getQuestion());
	
	Answer1 answer1 = new Answer1();
	
	for(Answer1 a : red.getAnswer()) {
	System.out.println(a.getAnswer());	
	}
	
	List<Answer1> list = red.getAnswer();
	for(int i = 0 ; i < list.size() ; i++) {
		 System.out.println(list.get(i).getAnswer());
	}
	
	tx.commit();
	factory.close();
	s.close();
		
	}

}
