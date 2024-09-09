package com.service;

import java.util.List;

import com.sms.Non_Teaching_Staff;

public interface NonTeachingStaffService {
	Non_Teaching_Staff createNon_Teaching_Staff(Non_Teaching_Staff nonteacher);	
	List<Non_Teaching_Staff> getAllNon_Teaching_Staff();
	Non_Teaching_Staff updateNon_Teaching_Staff(String Non_TeacherID,Non_Teaching_Staff updatedNon_Teaching_Staff);
	String deleteNon_Teaching_Staff(String StaffID);

	Non_Teaching_Staff getNon_Teaching_Staff(String StaffID);

}
