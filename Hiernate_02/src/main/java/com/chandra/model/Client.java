package com.chandra.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		Trainer t = new Trainer();
		t.setTid(1);
		t.setTname("Chandra");
		t.setSubject("Java");
		
		s.save(t);
		tx.commit();
		s.close();
		sf.close();

	}

}
