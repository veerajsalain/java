package com.serviceimpl;

import java.util.List;



import com.Dao.StudentDao;
import com.Daoimp.StudentDaoImpl;
import com.sms.Enrollment;
import com.sms.Student;
import com.service.InstuteStudentService;

public class InstuteStudentServiceImpl implements InstuteStudentService {
StudentDao studentDao =new StudentDaoImpl();
	
	public Student createStudent(Student student)	{
		//invoke daoimple method to save student object
		
		return studentDao.createStudent(student);
	
	}

	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentDao.getAllStudents();
	}

	public Enrollment StudentEnrollment(Enrollment enrollment) {
		// TODO Auto-generated method stub
		return studentDao.StudentEnrollment(enrollment);
	}

	public Student getStudent(String studentID) {
		// TODO Auto-generated method stub
		return studentDao.getStudent(studentID);
	}

	public List<Enrollment> getEnrollmentDetailsByStudentId(String StudentId) {
		// TODO Auto-generated method stub
		return studentDao.getEnrollmentDetailsByStudentId( StudentId);
	}

	public Student updateStudent(String studentID, Student updatedStudent) {
		
		return studentDao.updateStudent(studentID, updatedStudent);
	}

	public String deleteStudent(String studentID) {
		return studentDao.deleteStudent(studentID);
	}

}
