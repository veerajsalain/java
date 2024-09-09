package com.Institute;

import static com.Institute.MainOperation.mainOps;

import static com.Institute.MainOperation.*;




import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import javax.persistence.Column;

import com.sms.Enrollment;
import com.sms.Teaching_Staff;
//import com.student.entity.Course;
import com.sms.Non_Teaching_Staff;
import com.sms.Student;
import com.Exception.ResourceNotFoundException;
import com.service.InstuteStudentService;
import com.service.TeacherService;
import com.service.NonTeachingStaffService;
import com.service.EnrollementService;
import com.serviceimpl.InstuteStudentServiceImpl;
import com.serviceimpl.TeacherServiceimpl;
import com.serviceimpl.NonTeachingStaffServiceimpl;
import com.serviceimpl.EnrollementServiceimpl;

public class AllOperation {
//	private static final String String = null;
	static InstuteStudentService InstuteStudentService=new InstuteStudentServiceImpl();
	static TeacherService TeacherService=new TeacherServiceimpl();
	static NonTeachingStaffService NonTeachingStaffService=new NonTeachingStaffServiceimpl();
	static EnrollementService EnrollementService=new EnrollementServiceimpl();


	static Scanner sc=new Scanner(System.in);


	public static Student StudentInputs()
	{
		sc.nextLine();
		System.out.println("Enter StudentID");
		String studentId=sc.nextLine();
		
		System.out.println("Enter First Name");
		String firstName=sc.nextLine();

		System.out.println("Enter Last Name");
		String lastName=sc.nextLine();
		
//	 LocalDate dateOfBirth;
		
//	 System.out.println("Enter dateOfBirth");
//	 LocalDate dateOfBirth=sc.nextLine();
	 
		System.out.println("Enter Gender");
		String gender=sc.nextLine();
		
		System.out.println("Enter Email");
		String email=sc.nextLine();
		
		System.out.println("Enter phone");
		String phone=sc.nextLine();
		
		System.out.println("Enter Address");
		String Address=sc.nextLine();
		
		return new Student( studentId,  firstName,  lastName,   gender, email,  phone, Address);
			
			
		}

	public static Teaching_Staff teacherInputs()
	{
		sc.nextLine();
		System.out.println("Enter TeacherID");
		String TeacherID=sc.nextLine();
		
		System.out.println("Enter First Name");
		String firstName=sc.nextLine();

		System.out.println("Enter Last Name");
		String lastName=sc.nextLine();
		
		System.out.println("Enter Gender");
		String gender=sc.nextLine();
		
		System.out.println("Enter Email");
		String email=sc.nextLine();
		
		System.out.println("Enter Phone");
		String phone=sc.nextLine();
		
		System.out.println("Enter Address");
		String Address=sc.nextLine();
		
		System.out.println("Enter Department");
		String Department=sc.nextLine();
	 return new Teaching_Staff( TeacherID, firstName, lastName, gender,email, phone,Address,Department);
	}

	public static Non_Teaching_Staff StaffInputs()
	{
	sc.nextLine();
	System.out.println("Enter StaffID");
		String StaffID=sc.nextLine();
		
		System.out.println("Enter firstName");
		String firstName=sc.nextLine();
		
		System.out.println("Enter lastName");
		String lastName=sc.nextLine();
		
		System.out.println("Enter gender");
		String gender=sc.nextLine();
		
		System.out.println("Enter email");
		String email=sc.nextLine();
		
		System.out.println("Enter phone");
		String phone=sc.nextLine();
		
		System.out.println("Enter Address");
		String Address=sc.nextLine();
		
		System.out.println("Enter JobTitle");
		String JobTitle=sc.nextLine();


	sc.nextLine();
		
	 return new Non_Teaching_Staff(StaffID,firstName, lastName,  gender,email, phone,Address,JobTitle);
}

	public static Void StudentOperations()
	{
		while(true) {
			System.out.println("Press 1.Add Student Details\nPress 2.Retrieve All Student Data\n"
					+ "Press 3.Update Student Data\nPress 4.Delete Student Data\n"
					+ "Press 5.To getback to the main menu");
			int input=sc.nextInt();	
			
			switch(input) {
			case 1:
				Student student=StudentInputs();
				Student savedEntity=InstuteStudentService.createStudent(student);
				System.out.println("Student Data has been saved successfully"+ savedEntity);
			
			case 2:
				List<Student> students=InstuteStudentService.getAllStudents();
				for(Student stud:students)
				{
					System.out.println(stud);
				}
				break;
				
			case 3:sc.nextLine();
				System.out.println("Enter Student Id to update the infromation");
			       String sId=sc.next();
			       Student s=InstuteStudentService.getStudent(sId);
			       if(s!=null) {
			       Student std=updatedStudentData();
			     //service
			       Student updatedInfo=InstuteStudentService.updateStudent(sId, std);
			       System.out.println("Student Data has been updated Successfully"+ updatedInfo);
			       }
			       
			       else
			       {
			    	   throw new ResourceNotFoundException("Student Id not found");
			       }
			       
				break;
			
			case 4:
				System.out.println("Enter Student Id to delete the infromation");
			       String id=sc.next();
			       String message=InstuteStudentService.deleteStudent(id);
			       System.out.println(message);
				break;
			case 5:mainOps();
			}
			
			}
		}



	//public static String createEnrollmentId()
	//{
	//String s="E"+enrollmentId++; //E1002
	//return s;
	//}
	public static Enrollment enrollmentinput()
	{
//		System.out.println("Enter Student ID:");
//        Long studentId = Long.parseLong(sc.nextLine());
//        Student existingStudent = (Student) InstuteStudentService.getEnrollmentDetailsByStudentId(studentId);
//
//        if (existingStudent == null) {
//            System.out.println("Student not found!");
//            break;
//        }
//
//		    // Check if the student exists
//		    if (existingStudent == null) {
//		        System.out.println("Student not found!"); // If no student is found, notify the user
//		        break;
//		    }
//		sc.nextLine();
//		System.out.println("Enter Enrollment Id");
//		String enrollmentId=sc.nextLine();
//				
//		System.out.println("Enter Course Id");
//		String courseId=sc.nextLine();
//		
//		System.out.println("Enter CourseName");
//		String coursename=sc.nextLine();
//		sc.nextLine();
//		
//		 return new Enrollment(enrollmentId,courseId, coursename,Student);
//		//fetch student object
		
		 {
			 sc.nextLine();
             System.out.println("Enter  for Enrollment:");
             String EnrollmentId = sc.nextLine();
             
             System.out.println("Enter Student Id");
           	String studentId=sc.nextLine();

             System.out.println("Enter CourseID:");
             String courseID = sc.nextLine();
             
             System.out.println("Enter Coursename:");
             String Coursename = sc.nextLine();
             
          	
             Student student=InstuteStudentService.getStudent(studentId);
             
 
             return new Enrollment(EnrollmentId, student, courseID, Coursename);
             
//            EnrollementService.getEnrollmentsByStudentId(student);
//            System.out.println("Saved Enrollment: " + enrollment);
//
//             System.out.println("Do you want to add another enrollment? (yes/no)");
//             String continueEnrollment = sc.nextLine();
//             if (!continueEnrollment.equalsIgnoreCase("yes")) {
//                 break;
//             }
         }
		
	
	}
	public static Void EnrollmentOperations()
	{
		while(true) {
			System.out.println("Press 1.Add Course Details\n2.Retrieve All Course Data\n"
					+ "3.Delete Course Data\nPress 4.To getback to the main menu");
			int input=sc.nextInt();	
			
			switch(input) {
			case 1:
				Enrollment enrollment=enrollmentinput();
				Enrollment ell=EnrollementService. createEnrollment( enrollment);
				System.out.println("Course details added successfully"+ ell);
				break;
			case 2:
				List<Enrollment> enrollment1=EnrollementService.getAllEnrollment();
				for(Enrollment ell1:enrollment1)
				{
					System.out.println(ell1);
				}
				break;
//			case 3:
//			sc.nextLine();
//			System.out.println("Enter  Id to update the infromation");
//		       String ell1=sc.next();
//		       Enrollment s=EnrollementService.getEnrollment(e);
//		       if(s!=null) {
//		    	   Enrollment e=updatedenrollmentData();
//		     //service
//		    	   Enrollment updatedInfo=EnrollementService.updateEnrollment(ell1, e);
//		       System.out.println("Student Data has been updated Successfully"+ updatedInfo);
//		       }
//		       
//		       else
//		       {
//		    	   throw new ResourceNotFoundException("Student Id not found");
//		       }
//		       
//			break;
			case 3:
				System.out.println("Enter Enrollement Id to delete the infromation");
			       String id=sc.next();
			       String message=EnrollementService.deleteEnrollment(id);
			       System.out.println("Deleted");
				break;
				
			case 4:
				mainOps();
			}
	}
	}
	
	public static List<Enrollment> getEnrollmentDetailsByStudentId()	{
	System.out.println("Enter Student Id");
	String crsId=sc.nextLine();
	List<Enrollment> enroll=InstuteStudentService.getEnrollmentDetailsByStudentId(crsId);
	return enroll;
	}
		
//	private static Enrollment updatedenrollmentData() {
//		// TODO Auto-generated method stub
//		sc.nextLine();
//		System.out.println("Enter CourseName");
//		String CourseName =sc.nextLine();
//		
//		return new Enrollment( CourseName);
//		
//	}

	////fetch course object
	//Enrollment enrollment=EnrollementService.getEnrollemnet(courseId);
//		
//		return enrollment;
		
		//fetch Instructr object
	//	Instructor instructor=instructorService.getInstructor(instId);
		//return new Enrollment(enrollmentId, student, courseId, coursename);
	


	public static Student updatedStudentData()
	{
		sc.nextLine();
		System.out.println("Enter StudentID");
		String studentId=sc.nextLine();
		
		System.out.println("Enter First Name");
		String firstName=sc.nextLine();

		System.out.println("Enter Last Name");
		String lastName=sc.nextLine();
		
		System.out.println("Enter Gender");
		String gender=sc.nextLine();
		
		System.out.println("Enter Email");
		String email=sc.nextLine();
		
		System.out.println("Enter phone");
		String phone=sc.nextLine();
		
		System.out.println("Enter Address");
		String Address=sc.nextLine();
		
		return new Student( studentId,  firstName,  lastName,  gender, email,  phone, Address);
			
				
		}

	public static Void TeacherOperations()
	{
		while(true) {
			System.out.println("Press 1.Add Teacher Details\nPress 2.Retrieve All Teacher Data\n"
					+ "Press 3.Update Teacher Data\nPress 4.Delete Teacher Data\n"
					+ "Press 5.To getback to the main menu");
			int input=sc.nextInt();	
			
			switch(input) {
			case 1:
				Teaching_Staff instructor=teacherInputs();
				Teaching_Staff ins=TeacherService.createTeaching_Staff(instructor);
				System.out.println("Teacher details added successfully"+ ins);
				break;
				
			case 2:
				List<Teaching_Staff>  teacher=TeacherService.getAllTeaching_Staff();
				for(Teaching_Staff teach:teacher)
				{
					System.out.println(teach);
				}
				break;
				
			case 3:sc.nextLine();
				System.out.println("Enter teacher Id to update the infromation");
			       String TeacherID=sc.next();
			       Teaching_Staff s=TeacherService.getTeaching_Staff(TeacherID);
			       if(s!=null) {
			    	   Teaching_Staff teach=updatedteacherData();
			     //service
			    	   Teaching_Staff updatedInfo=TeacherService.updateTeaching_Staff(TeacherID, teach);
			       System.out.println("Student Data has been updated Successfully"+ updatedInfo);
			       }
			       
			       else
			       {
			    	   throw new ResourceNotFoundException("Student Id not found");
			       }
			       
				break;
			case 4:
				System.out.println("Enter teacher Id to delete the infromation");
			       String id=sc.next();
			       String message=TeacherService.deleteTeaching_Staff(id);
			       System.out.println(message);
				break;
			
				
			case 5:
				mainOps();
			}
	}
	}

	private static Teaching_Staff updatedteacherData() {
		sc.nextLine();
		
		System.out.println("Enter TeacherID");
		String TeacherID=sc.nextLine();

		System.out.println("Enter First Name");
		String firstName=sc.nextLine();

		System.out.println("Enter Last Name");
		String lastName=sc.nextLine();
		
		System.out.println("Enter Gender");
		String gender=sc.nextLine();
		
		System.out.println("Enter Email");
		String email=sc.nextLine();
		
		System.out.println("Enter Phone");
		String phone=sc.nextLine();
		
		System.out.println("Enter Address");
		String Address=sc.nextLine();
		
		System.out.println("Enter Department");
		String Department=sc.nextLine();
		
		
		return new Teaching_Staff( TeacherID,  firstName,  lastName,   gender, email,  phone, Address, Department);
	}

	public static Void NonTeacherOperations()
	{
		while(true) {
			System.out.println("Press 1.Add NonTeacher Details\nPress 2.Retrieve All NonTeacher Data\n"
					+ "Press 3.Update NonTeacher Data\nPress 4.Delete NonTeacher Data\n"
					+ "Press 5.To getback to the main menu");
			int input=sc.nextInt();	
			
			switch(input) {
			case 1:
				Non_Teaching_Staff staff=StaffInputs();
				Non_Teaching_Staff sf=NonTeachingStaffService.createNon_Teaching_Staff(staff);
				System.out.println("NonTeacher details added successfully"+ sf);
				break;
				
			case 2:
				List<Non_Teaching_Staff>  nonteacher=NonTeachingStaffService.getAllNon_Teaching_Staff();
				for(Non_Teaching_Staff nonteach:nonteacher)
				{
					System.out.println(nonteach);
				}
				break;
				
			case 3:sc.nextLine();
				System.out.println("Enter nonteacher Id to update the infromation");
			       String nId=sc.next();
			       Non_Teaching_Staff s=NonTeachingStaffService.getNon_Teaching_Staff(nId);
			       if(s!=null) {
			    	   Non_Teaching_Staff nonteach=updatednonteacherData();
			     //service
			    	   Non_Teaching_Staff updatedInfo=NonTeachingStaffService.updateNon_Teaching_Staff(nId, nonteach);
			       System.out.println("Non Teaching Staff Data has been updated Successfully"+ updatedInfo);
			       }
			       
			       else
			       {
			    	   throw new ResourceNotFoundException("Student Id not found");
			       }
			       
				break;
			case 4:
				System.out.println("Enter teacher Id to delete the infromation");
			       String id=sc.next();
			       String message=NonTeachingStaffService.deleteNon_Teaching_Staff(id);
			       System.out.println(message);
				break;
			
				
			case 5:
				mainOps();
			}
			}
	}
	
//	public static Void courseOperations()
//	{
//		while(true) {
//			System.out.println("Press 1.Add Course Details\n2.Retrieve All Course Data\n"
//					+ "3.Update Course Data\nPress 4.To getback to the main menu");
//			int input=sc.nextInt();	
//			
//			switch(input) {
//			case 1:
//				Course course=couseInputs();
//				Course crs=courseService.createCourse(course);
//				System.out.println("Course details added successfully"+ crs);
//				break;
//				
//			case 4:
//				mainOps();
//			}
//	}
//	}
//	public static List<Enrollment> getEnrollmentDetailsByStudentId( studentId)	{
//	System.out.println("Enter Student Id");
//	String crsId=sc.nextLine();
//	List<Enrollment> enroll=InstuteStudentService.getEnrollmentDetailsByStudentId(crsId);
//	return enroll;
//	}
//
//}

//	public static List<Enrollment> getEnrollmentByCourse()
//	{
//	System.out.println("Enter Course Id");
//	String crsId=sc.nextLine();
//	List<Enrollment> enroll=studentService.getEnrollmentDetailsByCourseId(crsId);
//	return enroll;
//	}
	private static Non_Teaching_Staff updatednonteacherData() {
		// TODO Auto-generated method stub
sc.nextLine();
		
		System.out.println("Enter StaffID");
		String StaffID=sc.nextLine();

		System.out.println("Enter First Name");
		String firstName=sc.nextLine();

		System.out.println("Enter Last Name");
		String lastName=sc.nextLine();
		
		System.out.println("Enter Gender");
		String gender=sc.nextLine();
		
		System.out.println("Enter Email");
		String email=sc.nextLine();
		
		System.out.println("Enter Phone");
		String phone=sc.nextLine();
		
		System.out.println("Enter Address");
		String Address=sc.nextLine();
		
		System.out.println("Enter JobTitle");
		String JobTitle=sc.nextLine();
		
		
		return new  Non_Teaching_Staff( StaffID,  firstName,  lastName,   gender, email,  phone, Address, JobTitle);
	}
}
