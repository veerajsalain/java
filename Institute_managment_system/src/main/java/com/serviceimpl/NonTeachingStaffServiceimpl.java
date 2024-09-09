package com.serviceimpl;

import java.util.List;


import com.Dao.Non_Teaching_StaffDao;
import com.Daoimp.Non_Teaching_StaffDaoImp;
import com.service.NonTeachingStaffService;
import com.sms.Non_Teaching_Staff;
import com.sms.Teaching_Staff;

public class NonTeachingStaffServiceimpl implements NonTeachingStaffService {
	Non_Teaching_StaffDao StaffDao=new Non_Teaching_StaffDaoImp ();
	
	@Override
	public Non_Teaching_Staff createNon_Teaching_Staff(Non_Teaching_Staff nonteacher)	 {
		// TODO Auto-generated method stub
		return StaffDao.createNon_Teaching_Staff(nonteacher);
	}

	public  List<Non_Teaching_Staff> getAllNon_Teaching_Staff() {
		// TODO Auto-generated method stub
		return StaffDao.getAllNon_Teaching_Staff();
	}
	
	@Override
	public Non_Teaching_Staff getNon_Teaching_Staff(String StaffID) {
		// TODO Auto-generated method stub
		return StaffDao.getNon_Teaching_Staff( StaffID);
	}
	
	 public Non_Teaching_Staff updateNon_Teaching_Staff(String Non_TeacherID,Non_Teaching_Staff updatedNon_Teaching_Staff) {
			
			return StaffDao.updateNon_Teaching_Staff(Non_TeacherID, updatedNon_Teaching_Staff);
		}

		public String deleteNon_Teaching_Staff(String StaffID){
			return StaffDao.deleteNon_Teaching_Staff(StaffID);
		}

}
