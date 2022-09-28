package com.chandra.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.chandra.model.Employee;

public class CreateEmployee {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		Employee e1 = new Employee();
		e1.setEid(200);
		e1.setEname("pqr");
		e1.setSalary(6000);
		
		s.save(e1);
		tx.commit();
		s.close();
		sf.close();

	}

}
