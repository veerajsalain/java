package com.serviceimpl;

import java.util.List;





import com.Dao.EnrollemnetDao;
import com.Daoimp.EnrollmentDaoImpl;
import com.service.EnrollementService;
import com.sms.Enrollment;
import com.sms.Student;



public class EnrollementServiceimpl implements EnrollementService  {
	
	EnrollemnetDao enrollemnetDao=new EnrollmentDaoImpl();
	
	@Override
	public Enrollment createEnrollment(Enrollment enrollment) {
		// TODO Auto-generated method stub
		return enrollemnetDao.createEnrollmnet(enrollment);
	}

//	@Override
//	public Enrollment getCourse(String enrollmentID) {
//		// TODO Auto-generated method stub
//		return EnrollemnetDao.getCourse(enrollmentID);
//	}

	@Override
	public Enrollment getEnrollment(String enrollmentID) {
		// TODO Auto-generated method stub
		return enrollemnetDao.getEnrollment(enrollmentID);
	}
	
	
	
//	EnrollemnetDao enrollemnetDao =new EnrollmentDaoImpl();
//	
//	public Enrollment createEnrollment(Enrollment enrollment)	{
//		//invoke daoimple method to save student object
//		
//		return enrollemnetDao. createEnrollment( enrollment);	
//	
//	}
//
	public List<Enrollment> getAllEnrollment() {
		// TODO Auto-generated method stub
		return enrollemnetDao.getAllEnrollment();
	}
//
//	public Enrollment StudentEnrollment(Enrollment enrollment) {
//		// TODO Auto-generated method stub
//		return enrollemnetDao.StudentEnrollment(enrollment);
//	}
//

//
	public List<Enrollment> getEnrollmentsByStudentId(String studentId) {
		// TODO Auto-generated method stub
		return enrollemnetDao. getEnrollmentsByStudentId(studentId);
	}
//
	public Enrollment updateEnrollment(String EnrollmentID,Enrollment updatedEnrollment) {
		
		return enrollemnetDao.updateEnrollment(EnrollmentID, updatedEnrollment);
	}

	public String deleteEnrollment(String EnrollmentID){
		return enrollemnetDao.deleteEnrollment(EnrollmentID);
	}

	

}
