package com;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainClass4 {

	public static void main(String[] args) {
	
		//----------------------------
				SessionFactory sf= new Configuration().configure().buildSessionFactory();		
				// obtains the session
				Session session = sf.openSession();
				session.beginTransaction();
			//--------------------------
		
				
				//delete a record
				String hql="delete from Student where rollNo=:ro";
				Query query=session.createQuery(hql);
				query.setParameter("ro",10);
				int count=query.executeUpdate();
				if(count>0) {
					System.out.println("delete "+count+" record sucessfully");
				}
				
				
				
				
				
				
				
				
		
		//------------	
				session.getTransaction().commit();
				session.close();
			
			//-----------------------


		
		

	}

}
