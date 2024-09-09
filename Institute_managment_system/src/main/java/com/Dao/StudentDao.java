package com.Dao;

import java.util.List;



import com.sms.Enrollment;
import com.sms.Student;


public interface StudentDao {
	Student createStudent(Student student);	
	List<Student> getAllStudents();
	Enrollment StudentEnrollment(Enrollment enrollment);
	Student getStudent(String studentID);
	List<Enrollment> getEnrollmentDetailsByStudentId(String studentId);
	Student updateStudent(String studentID,Student updatedStudent);
	String deleteStudent(String studentID);

}
