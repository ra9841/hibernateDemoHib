package com;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainClass1 {

	public static void main(String[] args) {
	
		//----------------------------
				SessionFactory sf= new Configuration().configure().buildSessionFactory();		
				// obtains the session
				Session session = sf.openSession();
				session.beginTransaction();
			//--------------------------
		
				
				//fetching  records on condition based
				String hql="from Student where rollNo=:ro";
				Query qu=session.createQuery(hql);
				qu.setParameter("ro",1);
				List<Student>li=qu.list();
				for(Student stu:li) {
					System.out.println(stu);
				}
				
				
				
				
				
				
				
				
		
		//------------	
				session.getTransaction().commit();
				session.close();
			
			//-----------------------


		
		

	}

}
