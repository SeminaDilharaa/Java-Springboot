package com.example.demo.Model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
@Entity

public class Student extends Person{
	private Date EnrollmentDate;
	@OneToMany(mappedBy = "student")
	private List<Enrollment>enrollments;
	
	
	public Student() {
		
	}

	public Student(int id, String firstName, String lastName,Date enrollmentDate) {
		super(id, firstName, lastName);
		EnrollmentDate = enrollmentDate;
		this.enrollments = enrollments;
		// TODO Auto-generated constructor stub
	}

	public Date getEnrollmentDate() {
		return EnrollmentDate;
	}

	public void setEnrollmentDate(Date enrollmentDate) {
		EnrollmentDate = enrollmentDate;
	}

	public List<Enrollment> getEnrollments() {
		return enrollments;
	}

	public void setEnrollments(List<Enrollment> enrollments) {
		this.enrollments = enrollments;
	}

	
	
	
}
