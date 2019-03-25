package com.pack;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new AnnotationConfiguration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = null;
		try{
			
			t = s.beginTransaction();
			Employee e1 = new Employee();
			e1.setName("alu");
			Regular_Employee r =new Regular_Employee();
			r.setName("potol");
			r.setBonus(300);
			r.setSalary(400);
			Contract_Employee c = new Contract_Employee();
			c.setName("jhinge");
			c.setPay_hour(500);
			c.setContract_duration("lau");
			s.persist(e1);
			s.persist(r);
			s.persist(c);
			t.commit();
			System.out.println("Successfull!!!!!!!!");
		}catch (HibernateException e) {
			// TODO: handle exception
			System.out.println(e);
			t.rollback();
		}finally {
			s.close();
		}
	}

}
