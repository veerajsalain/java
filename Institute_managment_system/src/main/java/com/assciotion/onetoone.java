package com.assciotion;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.sms.Enrollment;
import com.sms.Student;

import javax.persistence.JoinColumn;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

public class onetoone {
	 @OneToOne(mappedBy = "student")
	    private Enrollment enrollment;

	    @OneToOne
	    @JoinColumn(name = "StudentId")
	    private Student student;

	    // Getter and Setter methods

	    public Enrollment getEnrollment() {
	        return enrollment;
	    }

	    public void setEnrollment(Enrollment enrollment) {
	        this.enrollment = enrollment;
	    }

	    public Student getStudent() {
	        return student;
	    }

	    public void setStudent(Student student) {
	        this.student = student;
	    }
}
