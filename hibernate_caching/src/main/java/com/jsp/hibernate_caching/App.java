package com.jsp.hibernate_caching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {

//		Car car = new Car();
//		car.setCarId(1);
//		car.setCarBrand("moto");

		Configuration cfg = new Configuration().configure().addAnnotatedClass(Car.class);
		// sessionfactory is create the first initial connection to database
		SessionFactory sf = cfg.buildSessionFactory();

		// for every single request it will build the connection from the database
		Session session1 = sf.openSession();

		Transaction tran1 = session1.beginTransaction();

		// session.save(car);

		Car car1 = session1.get(Car.class, 1);
		System.out.println(car1);

		Car car2 = session1.get(Car.class, 1);
		System.out.println(car1);

		tran1.commit();
		session1.close();
		
		System.out.println("=======================================================================");

		Session session2 = sf.openSession();

		Transaction tran2 = session2.beginTransaction();

	

		Car car3 = session2.get(Car.class, 1);
		System.out.println(car3);

		Car car4 = session2.get(Car.class, 1);
		System.out.println(car4);

		tran2.commit();
		session2.close();

		sf.close();

	}
}
