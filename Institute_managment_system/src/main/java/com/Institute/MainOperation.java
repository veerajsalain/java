package com.Institute;

import static com.Institute.AllOperation.StudentOperations;




import static com.Institute.AllOperation.getEnrollmentDetailsByStudentId;
import static com.Institute.AllOperation.TeacherOperations;
import static com.Institute.AllOperation.NonTeacherOperations;
//import static com.student.AllOparations.getEnrollmentByCourse;
import static com.Institute.AllOperation.EnrollmentOperations;
//import static com.student.AllOparations.studentEnrollment;
//import static com.student.AllOparations.studentService;

import java.util.List;
import java.util.Scanner;

import com.service.InstuteStudentService;
import com.sms.Enrollment;

public class MainOperation {
	static Scanner sc=new Scanner(System.in);

	public static void mainOps()
	{
		while(true) {
		System.out.println("Press 1.Student Details\nPress 2.Teacher Deatils"
				+ "\nPress 3.Non Teacher Deatils\nPress 4. to Enrollment\n"
				+ "\nPress 6.to check all enrollment details based on course\n"
				+ "Press 7 for quit");
		int input=sc.nextInt();

		switch(input)
		{
			case 1:
				StudentOperations();
				System.out.println("=======================================");
		          break;
		          
			case 2:
				TeacherOperations();
				System.out.println("=======================================");
				break;
				
			case 3:
				NonTeacherOperations();
				System.out.println("=======================================");
				break;
				
//			case 4:
//				Enrollment enrollment=StudentEnrollment();
//				InstuteStudentService.StudentEnrollment(enrollment);
//				System.out.println("Enrollment done successfully");
//				break;
			case 4:
				EnrollmentOperations();
				System.out.println("=======================================");
				break;
				
			case 6:List<Enrollment> enroll=getEnrollmentDetailsByStudentId();
			for(Enrollment e:enroll)
			{
				System.out.println(e);
			}
			break;
			case 7:System.exit(0);
				default:
					System.out.println("wrong input");
		}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mainOps();

	}

}
