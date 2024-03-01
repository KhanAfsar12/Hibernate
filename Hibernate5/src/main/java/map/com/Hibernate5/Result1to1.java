package map.com.Hibernate5;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Result1to1 {
	 public static void main(String[] args) {
        SessionFactory factory=	new Configuration().configure("hibernate.cfg.xml").buildSessionFactory(); 
         
          Question q=new Question();
          q.setQuesId(20);
          q.setQuestion("what is java");
           
			
			  Answer a = new Answer();
			  a.setAnswerId(432);
			  a.setAnswer("Java is a programming language"); 
			  q.setAnswer(a);
			
			 
	          
	    Question q1 = new Question();
	    q1.setQuesId(97);
	    q1.setQuestion("What is python?");
	    
	    Answer a1 = new Answer();
	    a1.setAnswerId(786);
	    a1.setAnswer("Python is a scripting language");
	    q1.setAnswer(a1);
	    
	    System.out.println("Objects inserted.....");
	    
	    Session session=factory.openSession();
        Transaction t=session.beginTransaction();
	    
	      session.save(q1);
          session.save(q);
          session.save(a);
          session.save(a1);
        System.out.println("Objects are saved.....");
          
          t.commit();
       System.out.println("Objects are commited.....");
       
       //Fetching..
       
//       Question newQ = (Question)session.get(Question.class, 97);
//       System.out.println(newQ.getQuestion());
//       System.out.println(newQ.getAnswer().getAnswer());
       
          session.close();
       System.out.println("Session are closed.....");
          factory.close();
       System.out.println("Factory are closed....");
	}

}
