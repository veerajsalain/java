package com.serviceimpl;

import java.util.List;


import com.Dao.Teaching_StaffDao;

import com.Daoimp.Teaching_StaffDaoImpl;
import com.sms.Student;
import com.sms.Teaching_Staff;
import com.service.TeacherService;

public class TeacherServiceimpl implements TeacherService {
	Teaching_StaffDao Teaching_StaffDao=new Teaching_StaffDaoImpl ();
	
	@Override
	public Teaching_Staff createTeaching_Staff(Teaching_Staff teacher)	 {
		// TODO Auto-generated method stub
		return Teaching_StaffDao.createTeaching_Staff(teacher);
	}
	@Override
	public  List<Teaching_Staff> getAllTeaching_Staff() {
		// TODO Auto-generated method stub
		return Teaching_StaffDao.getAllTeaching_Staff();
	}

	@Override
	public Teaching_Staff getTeaching_Staff(String TeacherID) {
		// TODO Auto-generated method stub
		return Teaching_StaffDao.getTeaching_Staff( TeacherID);
	}
	
    public Teaching_Staff updateTeaching_Staff(String TeacherID,Teaching_Staff updatedTeaching_Staff) {
		
		return Teaching_StaffDao.updateTeaching_Staff(TeacherID, updatedTeaching_Staff);
	}

	public String deleteTeaching_Staff(String TeacherID) {
		return Teaching_StaffDao.deleteTeaching_Staff(TeacherID);
	}

}
