package com.Daoimp;

import java.util.ArrayList;



import java.util.List;
import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

import com.Exception.ResourceNotFoundException;
import com.sms.Enrollment;
import com.sms.HibernateUtil;
import com.sms.Non_Teaching_Staff;
import com.sms.Student;
import com.Dao.EnrollemnetDao;

public class EnrollmentDaoImpl implements EnrollemnetDao {
	Scanner sc=new Scanner(System.in);
	@Override
	public Enrollment createEnrollmnet(Enrollment enrollment ){
		
		try(Session session=HibernateUtil.getSession()) {
			
			session.beginTransaction();
			session.save(enrollment);
			session.getTransaction().commit();
			session.close();
			return enrollment;
			
		}
		catch (HibernateException e) {
			System.out.println(e);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		return null;
	}

@Override
public Enrollment getEnrollment(String EnrollemnetID){
	try(Session session=HibernateUtil.getSession()) {
		
		Enrollment enrollment=session.get(Enrollment.class, EnrollemnetID);
		session.close();
			return enrollment;
			
		}
		catch (HibernateException e) {
			System.out.println(e);
		}
		catch (Exception e) {
			System.out.println(e);
		}
	return null;
}
	
	@Override
	public List<Enrollment> getAllEnrollment() {
		try(Session session=HibernateUtil.getSession()) {
			
			//execute HQL query to retrieve all students data
			Query<Enrollment> query=session.createQuery("FROM Enrollment");
			List<Enrollment> enrollmentList=query.list();
			session.close();
			return enrollmentList;
			
		}
		catch (HibernateException e) {
			System.out.println(e);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		return null;
	}
@Override
public  Enrollment updateEnrollment(String EnrollmentID,Enrollment updatedEnrollment){
	try(Session session=HibernateUtil.getSession()) {
		Enrollment enrollment=session.get(Enrollment.class,  EnrollmentID);
			session.beginTransaction();
			
			enrollment.setEnrollmentID(EnrollmentID);
			enrollment.setCourseName(updatedEnrollment.getCourseName());
			
			session.saveOrUpdate(enrollment);
			session.getTransaction().commit();
			session.close();
			return enrollment;
		
	}
	catch (HibernateException e) {
		System.out.println(e);
	}
	catch (Exception e) {
		System.out.println(e);
	}
	return null;
}

@Override
public String deleteEnrollment(String EnrollmentID) {
	String message=null;
	try(Session session=HibernateUtil.getSession()) {
		Enrollment enrollment=session.get(Enrollment.class, EnrollmentID);
			session.beginTransaction();
			
			System.out.println("Are you sure  you want to delete?");
			String status=sc.next();
			if(status.equalsIgnoreCase("yes"))
			{
				session.delete(enrollment);//data will be deleted from DB
				session.getTransaction().commit();
				session.close();
				session.evict(enrollment);//data will remove from session Cache
				message="Object is deleted";
				
			}else
			{
				message="User wants to retain this object!!";
			}
			
	}
	return null;
}
	@Override
    public List<Enrollment>  getEnrollmentsByStudentId(String studentId) {
		try(Session session=HibernateUtil.getSession()){
			
        List<Enrollment> enrollments = null;
         {
            session.beginTransaction();
            Query<Enrollment> enrollment = session.createQuery("from Enrollment where Student.id = :studentId", Enrollment.class);
            enrollment.setParameter("studentId", studentId);
            enrollments = enrollment.getResultList();
            session.getTransaction().commit();
            session.close();
            return enrollments;
			
 		}
		}
 		catch (HibernateException e) {
 			System.out.println(e);
 		}
 		
		
 		catch (Exception e) {
 			System.out.println(e);
 		}
 		
 		return null;
 	
		
	}		
	}
	
