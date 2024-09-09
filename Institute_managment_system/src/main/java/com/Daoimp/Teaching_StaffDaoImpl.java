package com.Daoimp;

import org.hibernate.HibernateException;

import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Scanner;

import com.sms.Teaching_Staff;
import com.Dao.Teaching_StaffDao;
import com.sms.HibernateUtil;
import com.sms.Student;

public class Teaching_StaffDaoImpl implements Teaching_StaffDao  {
	
	 Scanner sc=new Scanner(System.in);
	@Override
	public Teaching_Staff  createTeaching_Staff(Teaching_Staff teacher) {
	try(Session session=HibernateUtil.getSession()) {
			
			session.beginTransaction();
			session.save(teacher);
			session.getTransaction().commit();
			return teacher;
			
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
	public List<Teaching_Staff> getAllTeaching_Staff() {
		try(Session session=HibernateUtil.getSession()) {
			
			//execute HQL query to retrieve all students data
			Query<Teaching_Staff> query=session.createQuery("FROM Teaching_Staff ");
			List<Teaching_Staff> teachingList=query.list();
			return teachingList;
			
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
	public Teaching_Staff getTeaching_Staff(String TeacherID) {
		try(Session session=HibernateUtil.getSession()) {
			
			Teaching_Staff teacher=session.get(Teaching_Staff.class, TeacherID);
				return teacher;
				
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
	public Teaching_Staff updateTeaching_Staff(String TeacherID,Teaching_Staff updatedTeaching_Staff){
		try(Session session=HibernateUtil.getSession()) {
			Teaching_Staff teaching_Staff=session.get(Teaching_Staff.class, TeacherID);
				session.beginTransaction();
				
				teaching_Staff.setTeacherID(TeacherID);
				teaching_Staff.setFirstName(updatedTeaching_Staff.getFirstName());
				teaching_Staff.setLastName(updatedTeaching_Staff.getLastName());
				teaching_Staff.setGender(updatedTeaching_Staff.getGender());
				teaching_Staff.setEmail(updatedTeaching_Staff.getEmail());
				teaching_Staff.setPhone(updatedTeaching_Staff.getPhone());
				teaching_Staff.setAddress(updatedTeaching_Staff.getAddress());
				teaching_Staff.setDepartment(updatedTeaching_Staff.getDepartment());
				
				
				session.saveOrUpdate(teaching_Staff);
				session.getTransaction().commit();
				return teaching_Staff;
			
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
	public String  deleteTeaching_Staff(String TeacherID) {
		String message=null;
		try(Session session=HibernateUtil.getSession()) {
			Teaching_Staff teaching_Staff=session.get(Teaching_Staff.class, TeacherID);
				session.beginTransaction();
				System.out.println("Are you sure  you want to delete?");
				String status=sc.next();
				if(status.equalsIgnoreCase("yes"))
				{
					session.delete(teaching_Staff);//data will be deleted from DB
					session.getTransaction().commit();
					session.evict(teaching_Staff);//data will remove from session Cache
					message="Object is deleted";
					
				}else
				{
					message="User wants to retain this object!!";
				}
				
		}
		catch (HibernateException e) {
			System.out.println(e);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return message;
	}


}
