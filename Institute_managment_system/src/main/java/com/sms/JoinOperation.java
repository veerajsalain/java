//package com.sms;
//
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.List;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//
//public class JoinOperation {
//
//	public static void main(String[] args) {
//		// Obtain a Hibernate SessionFactory
//		SessionFactory factory = HibernateUtil.getSessionFactory();
//		// Create a new Student
//	
//		 Student Student1 = new Student("S113", "samir", "narkar",  "M", "samir@gmail.com", "6742906745","Byculla");
//		// Create Enrollment
//		Enrollment enrollment1 = new Enrollment("E1001", "C101","Bsc IT",Student1);
//		// set EnrollmentID to student
//		List<Enrollment> enrollments = new ArrayList<Enrollment>();
//		enrollments.add(enrollment1);
//		Student1.setEnrollments(enrollments);
//		// Open a new session
//		Session session = factory.openSession();
//		// Begin a transaction
//		Transaction transaction = session.beginTransaction();
//		// Save the student to the database
//		session.save(Student1);
//		// Save the enrollement to the database
//		session.save(enrollment1);
//		// Commit the transaction
//		transaction.commit();
//		// Close the Session
//		session.close();
//		// Close the Session Factory
//		factory.close();
//
//	}
//
//}
