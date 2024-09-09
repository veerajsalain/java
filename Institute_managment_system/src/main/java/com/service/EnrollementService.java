package com.service;

import java.util.List;



import com.sms.Enrollment;
import com.sms.Student;

public interface EnrollementService {
//	Enrollment createEnrollment(Enrollment enrollment);	
//	List<Enrollment> getAllEnrollment();
//	Enrollment StudentEnrollment(Enrollment enrollment);
//	Enrollment getEnrollment(String EnrollmentID);
//	List<Enrollment> getEnrollmentDetailsByCourseId(String courseId);
//	Enrollment updateEnrollment(String EnrollmentID,Enrollment updatedEnrollment);
//	String deleteEnrollment(String EnrollmentID);
	Enrollment createEnrollment(Enrollment enrollment);	
	List<Enrollment> getAllEnrollment();
	Enrollment getEnrollment(String EnrollmentID);
	 List<Enrollment>  getEnrollmentsByStudentId(String studentId);
	 Enrollment updateEnrollment(String EnrollmentID,Enrollment updatedEnrollment);
	String deleteEnrollment(String EnrollmentID);



}
