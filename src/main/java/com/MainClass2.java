package com;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainClass2 {

	public static void main(String[] args) {
	
		//----------------------------
				SessionFactory sf= new Configuration().configure().buildSessionFactory();		
				// obtains the session
				Session session = sf.openSession();
				session.beginTransaction();
			//--------------------------
		
				
				//fetching all records from table 
				String hql="from Student";
				Query query=session.createQuery(hql);
				List<Student>li=query.list();
				for(Student st:li) {
					System.out.println(st);
					System.out.println(st.getRollNo()+" "+st.getName()+" "+st.getAddress()+" "+st.getAge());
				}
				
				
				
				
				
				
				
		
		//------------	
				session.getTransaction().commit();
				session.close();
			
			//-----------------------


		
		

	}

}
