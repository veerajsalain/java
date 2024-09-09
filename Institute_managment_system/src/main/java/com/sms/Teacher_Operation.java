//package com.sms;
//import java.time.LocalDate;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//public class Teacher_Operation {
//
//	public static void main(String[] args) {
//		// Obtain a Hibernate SessionFactory
//   	 SessionFactory factory = HibernateUtil.getSessionFactory();
//   	 // Create a new Teacher
//   	 LocalDate date1 = LocalDate.of(1970, 2, 14);
//   	Teaching_Staff Teacher1 = new Teaching_Staff("T101", "Veeraj", "Salian", date1, "M", "veeraj@gmail.com", "911345677","Dadar","Msc IT");
//   	 // Open a new session
//   	 Session session = factory.openSession();
//   	 // Begin a transaction
//   	 Transaction transaction = session.beginTransaction();
//   	 // Save the student to the database
//   	 session.save(Teacher1);
//   	 // Commit the transaction
//   	 transaction.commit();
//   	 // Close the Session
//   	 session.close();
//   	// Close the Session Factory
//   	 factory.close();
//		
//
//	}
//
//}
