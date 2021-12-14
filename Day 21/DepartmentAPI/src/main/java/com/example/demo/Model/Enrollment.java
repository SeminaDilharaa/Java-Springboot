package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Enrollment {
	@Id
	private int EnrollmentId;
	private String Grade;
	@ManyToOne
	@JoinColumn(name = "CourseId",referencedColumnName = "Id")
	private Course course;
	@ManyToOne 
	@JoinColumn(name = "student",referencedColumnName = "Id")
	private Student student;
	
}
