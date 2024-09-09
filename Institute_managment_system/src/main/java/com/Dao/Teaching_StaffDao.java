package com.Dao;

import java.util.List;

import com.sms.Student;
import com.sms.Teaching_Staff;

public interface Teaching_StaffDao {
	Teaching_Staff createTeaching_Staff(Teaching_Staff teacher);
	List<Teaching_Staff> getAllTeaching_Staff();
	Teaching_Staff getTeaching_Staff(String TeacherID);
	Teaching_Staff updateTeaching_Staff(String TeacherID,Teaching_Staff updatedTeaching_Staff);
	String deleteTeaching_Staff(String TeacherID);

}
