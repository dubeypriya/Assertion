package com.assertion.model;

import java.util.HashMap;
import java.util.List;


import javax.persistence.Query;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

public class DBOperation {
	Configuration  con =new Configuration().configure("hibernate.cfg.xml");
	SessionFactory sf;
	Session session;
	Transaction tx;
	List<Password> fetchedData;
	public HashMap<String, String> getData() {
		try {
			System.out.println("Beggining Transaction");
			sf = con.buildSessionFactory();
			session = sf.openSession();
			tx = session.beginTransaction();
			System.out.println("Query");
			Query query = session.createQuery("from Password");
			List list = query.getResultList();
	        System.out.println(list);
			tx.commit();
			}  catch(Exception exception){
			     System.out.println("Problem creating session factory");
			     exception.printStackTrace();
			}        
		        
		     finally {
		        session.close(); 
		    }
		return null;

	}
}
