package com.sms;
import java.time.LocalDate;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.assciotion.onetoone;
@Entity
public class Student extends onetoone {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "StudentId", updatable = false, nullable = false)
    private String studentId;

    @Column(name = "FirstName", length = 50)
    private String firstName;

    @Column(name = "LastName", length = 25)
    private String lastName;

    @Column(name = "Gender", length = 25)
    private String gender;

    @Column(name = "Email", length = 30)
    private String email;

    @Column(name = "Phone", length = 25)
    private String phone;

    @Column(name = "Address", length = 25)
    private String address;

    // Getter and Setter methods

	public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
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
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public Student(String studentId, String firstName, String lastName, String gender, String email, String phone,
			String address) {
		// TODO Auto-generated constructor stub
	}

    
    public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
    public String toString() {
        return "Student [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName +
               ", gender=" + gender + ", email=" + email + ", phone=" + phone + ", address=" + address + 
               ", enrollment=" + getEnrollment() + "]";
    }
}