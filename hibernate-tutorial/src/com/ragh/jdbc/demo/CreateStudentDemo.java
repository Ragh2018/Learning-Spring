package com.ragh.jdbc.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ragh.jdbc.demo.entity.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session session=factory.getCurrentSession();
		try {
			System.out.println("Insertion started");
			Student theStudent1=new Student("Shreya", "Kothari", "shreya@manh.com");
			Student theStudent2=new Student("Aman", "Singh", "aman@manh.com");
			session.beginTransaction();
			//saving the data
			session.save(theStudent1);
			session.save(theStudent2);
			
			System.out.println("Inserted");
			//getting the data
			System.out.println("Fetching started");
			Student theStudent3=session.get(Student.class, theStudent1.getId());
			System.out.println(theStudent3);
			System.out.println("Fetched");
			
			System.out.println("Getting list of student started");
			List<Student> list=session.createQuery("from Student").list();
			for(Student list1:list)
				System.out.println(list1.toString());
			System.out.println("Fetched list of student");	
			session.getTransaction().commit();
		}
		finally {
			factory.close();
		}
	}

}
