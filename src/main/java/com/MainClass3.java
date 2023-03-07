package com;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainClass3 {

	public static void main(String[] args) {
	
		//----------------------------
				SessionFactory sf= new Configuration().configure().buildSessionFactory();		
				// obtains the session
				Session session = sf.openSession();
				session.beginTransaction();
			//--------------------------
		
				
				//update a record
				String hql="update Student set name=:na,age=:age,address=:addr,email=:emai where rollNo=:ro";
				Query que=session.createQuery(hql);
				que.setParameter("na","hem");
				que.setParameter("age",30);
				que.setParameter("addr","Herclues");
				que.setParameter("emai","hari@gamil.com");
				que.setParameter("ro",5);
				int count=que.executeUpdate();
				if(count>0) {
					System.out.println("update "+count+" record sucessfully");
				}
				
				
				
				
				
				
				
		
		//------------	
				session.getTransaction().commit();
				session.close();
			
			//-----------------------


		
		

	}

}
