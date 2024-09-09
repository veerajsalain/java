package com.Daoimp;

import org.hibernate.HibernateException;


import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Scanner;

import com.Dao.Non_Teaching_StaffDao;
import com.sms.HibernateUtil;
import com.sms.Non_Teaching_Staff;
import com.sms.Teaching_Staff;


public class Non_Teaching_StaffDaoImp implements Non_Teaching_StaffDao {
	Scanner sc=new Scanner(System.in);
	@Override
	public Non_Teaching_Staff createNon_Teaching_Staff(Non_Teaching_Staff nonteacher)	 {
	try(Session session=HibernateUtil.getSession()) {
			
			session.beginTransaction();
			session.save(nonteacher);
			session.getTransaction().commit();
			return nonteacher;
			
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
	public List<Non_Teaching_Staff> getAllNon_Teaching_Staff() {
		try(Session session=HibernateUtil.getSession()) {
			
			//execute HQL query to retrieve all students data
			Query<Non_Teaching_Staff> query=session.createQuery("FROM Non_Teaching_Staff");
			List<Non_Teaching_Staff> nonteachingList=query.list();
			return nonteachingList;
			
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
	public Non_Teaching_Staff getNon_Teaching_Staff(String staffID) {
		try(Session session=HibernateUtil.getSession()) {
			
			Non_Teaching_Staff nonteacher=session.get(Non_Teaching_Staff.class, staffID);
				return nonteacher;
				
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
	public Non_Teaching_Staff updateNon_Teaching_Staff(String Non_TeacherID,Non_Teaching_Staff updatedNon_Teaching_Staff){
		try(Session session=HibernateUtil.getSession()) {
			Non_Teaching_Staff non_teaching_Staff=session.get(Non_Teaching_Staff.class,  Non_TeacherID);
				session.beginTransaction();
				
				non_teaching_Staff.setStaffID(Non_TeacherID);
				non_teaching_Staff.setFirstName(updatedNon_Teaching_Staff.getFirstName());
				non_teaching_Staff.setLastName(updatedNon_Teaching_Staff.getLastName());
				non_teaching_Staff.setGender(updatedNon_Teaching_Staff.getGender());
				non_teaching_Staff.setEmail(updatedNon_Teaching_Staff.getEmail());
				non_teaching_Staff.setPhone(updatedNon_Teaching_Staff.getPhone());
				non_teaching_Staff.setAddress(updatedNon_Teaching_Staff.getAddress());
				non_teaching_Staff.setJobTitle(updatedNon_Teaching_Staff.getJobTitle());
				
				session.saveOrUpdate(non_teaching_Staff);
				session.getTransaction().commit();
				return non_teaching_Staff;
			
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
	public String deleteNon_Teaching_Staff(String StaffID) {
		String message=null;
		try(Session session=HibernateUtil.getSession()) {
			Non_Teaching_Staff teaching_Staff=session.get(Non_Teaching_Staff.class, StaffID);
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
