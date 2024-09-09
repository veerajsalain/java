package com.sms;
import java.time.LocalDate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class retrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				 // Obtain a Hibernate SessionFactory
				 SessionFactory factory = HibernateUtil.getSessionFactory();
				 // Open a new session
				 Session session = factory.openSession();
				 // Begin a transaction
				 Transaction transaction = session.beginTransaction();
				 // Retrieve the object using the primary key
				 Student C1=session.load( Student.class, "S112");
				 //display data using toString() method
				 System.out.println(C1);
				 // Commit the transaction
				 transaction.commit();
				 // Close the session
				 session.close();

	}

}
