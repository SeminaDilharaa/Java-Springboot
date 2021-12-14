package com.example.demo.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Course {
	@javax.persistence.Id
	private String Id;
	private String Title;
	private int Credits;
	@ManyToOne
	@JoinColumn(name ="DepartmentID",referencedColumnName = "Id")
	private Department department;
	@OneToMany(mappedBy = "course")
	private List<Enrollment>enrollments;
	@ManyToMany(mappedBy = "courses")
	private List<Instructor>instructors;
}
