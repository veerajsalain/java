//package com.sms;
//
//import java.time.LocalDate;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//
//public class Non_Teaching_Staff_Operation {
//
//	public static void main(String[] args) {
//		// Obtain a Hibernate SessionFactory
//	   	 SessionFactory factory = HibernateUtil.getSessionFactory();
//	   	 // Create a new Teacher
//	   	 LocalDate date1 = LocalDate.of(1970, 2, 14);
//	   	Non_Teaching_Staff NonTeacher1 = new Non_Teaching_Staff("N101", "Radhika", "Patil", date1, "M", "radhika@gmail.com", "911345677","Dadar","Receptionist");
//	   	 // Open a new session
//	   	 Session session = factory.openSession();
//	   	 // Begin a transaction
//	   	 Transaction transaction = session.beginTransaction();
//	   	 // Save the student to the database
//	   	 session.save(NonTeacher1);
//	   	 // Commit the transaction
//	   	 transaction.commit();
//	   	 // Close the Session
//	   	 session.close();
//	   	// Close the Session Factory
//	   	 factory.close();
//
//	}
//
//}
