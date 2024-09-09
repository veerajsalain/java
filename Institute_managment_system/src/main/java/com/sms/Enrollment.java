package com.sms;

import javax.persistence.Column;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.assciotion.onetoone;

	@Entity
	public class Enrollment extends onetoone {
		 @Id
		  @GeneratedValue(strategy = GenerationType.AUTO)
		    @Column(name = "EnrollmentID", length = 10)
		    private String enrollmentID;

		    @Column(name = "CourseID", length = 10)
		    private String courseID;

		    @Column(name = "CourseName", length = 50)
		    private String courseName;

		    // Getter and Setter methods

			public String getEnrollmentID() {
		        return enrollmentID;
		    }

		    public void setEnrollmentID(String enrollmentID) {
		        this.enrollmentID = enrollmentID;
		    }

		    public String getCourseID() {
		        return courseID;
		    }

		    public void setCourseID(String courseID) {
		        this.courseID = courseID;
		    }

		    public String getCourseName() {
		        return courseName;
		    }

		    public void setCourseName(String courseName) {
		        this.courseName = courseName;
		    }
		    


		    public Enrollment(String enrollmentId, Student student, String courseID, String coursename) {
				// TODO Auto-generated constructor stub
			}

		    @Override
		    public String toString() {
		        return "Enrollment [enrollmentID=" + enrollmentID + ", courseID=" + courseID +
		               ", courseName=" + courseName + ", student=" + getStudent() + "]";
		    }
	}


