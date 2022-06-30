package com.knoldus.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.knoldus.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {

	public static void main(String[] args) {
		
		
		
		//create session factory
		
		SessionFactory factory = new Configuration()
				                 .configure("hibernate.cfg.xml")
		                          .addAnnotatedClass(Student.class)
		                          .buildSessionFactory();
		
		
		//create session
		
		Session session = factory.getCurrentSession();
		
		
		try {
			
			
			
			//create 3 student object
			
			System.out.println("Creating 3 student object.... ");
			
			Student tempStudent1 = new Student("Anuradha", "jha", "anuradha@gmail.com");
			Student tempStudent2 = new Student("Anu", "Jha", "anujha@gmail.com");
			Student tempStudent3 = new Student("Anupam", "Priya", "anupamPriya@gmail.com");
			

			
			//start a transaction
			session.beginTransaction();
			
		    //save the student object
			System.out.println("Saving the Student...");
			session.save(tempStudent1);
			session.save(tempStudent2);
			session.save(tempStudent3);
			

			//commit the transaction
			
			session.getTransaction().commit();
			
			System.out.println("Done!");
			
		
		} 
		finally {
			
			factory.close();

		}
		
		

		
	}

}
