package com.put;




import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project Started..." );
        
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
         
		/*
		 * student s = new student(); s.setId(21); s.setName("Afsar");
		 * s.setCity("Basra"); System.out.println(s);
		 */
        
        Address ad = new Address();
        ad.setAddressId(2);
        ad.setCity("Mumbai");
        ad.setStreet("LBS Marg");
        ad.setOpen(true);
        ad.setAddedDate(new Date());
        ad.setX(1234);
        
        Session session=factory.openSession();
        
        Transaction txTransaction = session.beginTransaction();
        
       
       int i= (Integer)session.save(ad);
       if(i>0)
    	   System.out.println("value inseerted");
       else
    	   System.out.println("data not inserted");
        txTransaction.commit();
        session.close();
        
        System.out.println("Done....");
    }
}
