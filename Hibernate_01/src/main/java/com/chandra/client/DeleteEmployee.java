package com.chandra.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.chandra.model.Employee;

public class DeleteEmployee {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		Employee e = s.get(Employee.class, new Integer(200));
		s.delete(e);
		tx.commit();
		s.close();
		sf.close();

	}

}
