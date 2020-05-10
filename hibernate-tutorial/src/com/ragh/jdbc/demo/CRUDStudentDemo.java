package com.ragh.jdbc.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ragh.jdbc.demo.entity.Student;

public class CRUDStudentDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			System.out.println("Insertion started");
			Student theStudent1 = new Student("Shreya", "Kothari", "shreya@manh.com");
			Student theStudent2 = new Student("Aman", "Singh", "aman@manh.com");
			session.beginTransaction();
			// Creating the data
			session.save(theStudent1);
			session.save(theStudent2);

			System.out.println("Inserted");
			// Reading the data
			System.out.println("Fetching started");
			Student theStudent3 = session.get(Student.class, theStudent1.getId());
			System.out.println(theStudent3);
			System.out.println("Fetched");

			System.out.println("Getting list of student started");
			List<Student> list = session.createQuery("from Student").list();
			for (Student list1 : list)
				System.out.println(list1.toString());
			System.out.println("Fetched list of student");

			// updating the data(No need to do save or update while committing transaction
			// changes will be reflected in db)
			theStudent3.setFirstName("Scooby");

			session.getTransaction().commit();

			// Bulk update can also be performed by creating the query and executeUpdate().
			// Create new session and do the same.
			
			//Delete
			session = factory.getCurrentSession();
			session.beginTransaction();
			//approach 1
			//Student theStudent4 = session.get(Student.class,1);
			//session.delete(theStudent4);		
			
			//approach 2
			//session.createQuery("delete from Student where id=2").executeUpdate();
			session.getTransaction().commit();
			
		} finally {
			factory.close();
		}
	}

}
