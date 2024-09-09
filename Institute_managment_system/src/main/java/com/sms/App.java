//package com.sms;
//import java.time.LocalDate;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//public class App 
//{
//    public static void main( String[] args )
//    {
//    	// Obtain a Hibernate SessionFactory
//    	 SessionFactory factory = HibernateUtil.getSessionFactory();
//    	 // Create a new Student
//    	 LocalDate date1 = LocalDate.of(2000, 1, 13);
//    	// Student Student1 = new Student("S111", "Oliver", "Henry", date1, "M", "oliver@gmail.com", "6742906745","Byculla");
//    	 Student Student1 = new Student("S112", "samir", "narkar", date1, "M", "samir@gmail.com", "6742906745","Byculla");
//    	 // Open a new session
//    	 Session session = factory.openSession();
//    	 // Begin a transaction
//    	 Transaction transaction = session.beginTransaction();
//    	 // Save the student to the database
//    	session.save(Student1);
//    	 
//    	 // Commit the transaction
//    	 transaction.commit();
//    	 // Close the Session
//    	 session.close();
//    	// Close the Session Factory
//    	 factory.close();
//    }
//}
