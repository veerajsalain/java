package com.sms;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class HibernateUtil {
	private static final SessionFactory sessionFactory = buildSessionFactory();
	 private static SessionFactory buildSessionFactory() {
	 try {
	 return new
	 Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).addAnnotatedClass(Teaching_Staff.class).addAnnotatedClass(Non_Teaching_Staff.class).addAnnotatedClass(Enrollment.class).buildSessionFactory();
	 } catch (Throwable ex) {
	 throw new ExceptionInInitializerError(ex);
	 }
	 }
	 public static SessionFactory getSessionFactory() {
	 return sessionFactory;
	 }
	public static Session getSession() {
		// TODO Auto-generated method stub
		 return getSessionFactory().openSession();
	}

}
