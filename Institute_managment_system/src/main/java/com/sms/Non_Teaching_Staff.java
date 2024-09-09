package com.sms;
import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Non_Teaching_Staff {
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY )
	 @Column(name = "StaffID", length = 10)
	 private String StaffID;
	 @Column(name = "FirstName", length = 50)
	 private String firstName;
	 @Column(name = "LastName", length = 25)
	 private String lastName;
//	@Column(name = "DateOfBirth")
//	 private LocalDate dateOfBirth;
	 @Column(name = "Gender", length = 25)
	 private String gender;
	 @Column(name = "Email", length = 30)
	 private String email;
	 @Column(name = "Phone", length = 25)
	 private String phone;
	 @Column(name = "Address", length = 25)
	 private String Address;
	 @Column(name = "JobTitle", length = 25)
	 private String JobTitle;
	 //Setter And Getter
	 public String getStaffID() {
	 return StaffID;
	 }
	 public void setStaffID(String studentId) {
	 this.StaffID = studentId;
	 }
	 public String getFirstName() {
	 return firstName;
	 }
	 public void setFirstName(String firstName) {
	 this.firstName = firstName;
	 }
	 public String getLastName() {
	 return lastName;
	 }
	 public void setLastName(String lastName) {
	 this.lastName = lastName;
	 }
//	 public LocalDate getDateOfBirth() {
//	 return dateOfBirth;
//	 }
//	 public void setDateOfBirth(LocalDate dateOfBirth) {
//	 this.dateOfBirth = dateOfBirth;
//	 }
	 public String getGender() {
	 return gender;
	}
	 public void setGender(String gender) {
	 this.gender = gender;
	 }
	 public String getEmail() {
	 return email;
	 }
	 public void setEmail(String email) {
	 this.email = email;
	 }
	 public String getPhone() {
	 return phone;
	 }
	 public void setPhone(String phone) {
	 this.phone = phone;
	 }
	 public String getAddress() {
		 return Address;
		 }
		 public void setAddress(String Address) {
		 this.Address = Address;
		 }
		 public String getJobTitle() {
			 return JobTitle;
			 }
			 public void setJobTitle(String Address) {
			 this.Address = JobTitle;
			 }
	 //All argument Constructor
	 public Non_Teaching_Staff(String StaffID, String firstName, String lastName,  String gender,String email, String phone,String Address,String JobTitle)
	 {
	 super();
	 this.StaffID = StaffID;
	 this.firstName = firstName;
	 this.lastName = lastName;
	// this.dateOfBirth = dateOfBirth;
	 this.gender = gender;
	 this.email = email;
	 this.phone = phone;
	 this.Address = Address;
	 }
	 //Default Constructor
	 public Non_Teaching_Staff() {
	 super();
	 }
	 //ToString method
	 @Override
	 public String toString() {
	return " Teaching_Staff[TeacherID=" + StaffID + ", firstName=" + firstName + ",lastName=" + lastName+ ",  gender=" + gender + ",email=" + email + ", phone=" + phone + "Address="+Address+"Department="+JobTitle+"]";
	 }

}
