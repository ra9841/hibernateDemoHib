package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {
	
		//----------------------------
				SessionFactory sf= new Configuration().configure().buildSessionFactory();		
				// obtains the session
				Session session = sf.openSession();
				session.beginTransaction();
			//--------------------------
		
             // Student st=new Student(1,"Rabin",31,"San Pablo","rabin@gmail.com");
              //session.save(st);
		
             // Student st2=new Student(3,"Bijeta",31,"Berkley","bijeta@gmail.com");
             // session.save(st2);
				
				Student st=new Student("Bijeta",22,"San Pablo","Bijeta@gmail.com");
				session.save(st);

		
		//------------	
				session.getTransaction().commit();
				session.close();
			
			//-----------------------


		
		

	}

}
