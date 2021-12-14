package com.example.demo.Model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Instructor extends Person{
	private Date HireDate;
	@ManyToMany
	@JoinTable(name = "InstructorCourses",joinColumns = @JoinColumn(name="InstructorID",referencedColumnName = "Id" ),
	inverseJoinColumns =@JoinColumn(name="CourseID",referencedColumnName = "Id" ))
	private List<Course>courses;
	@OneToOne
	private Office office;
	@OneToMany(mappedBy = "administrator")
	private List<Department>departments;
	
	public Instructor() {
		
	}

	public Instructor(int id, String firstName, String lastName,Date hireDate) {
		super(id, firstName, lastName);
		HireDate = hireDate;
		this.courses = courses;
		this.office = office;
		// TODO Auto-generated constructor stub
	}

	public Date getHireDate() {
		return HireDate;
	}

	public void setHireDate(Date hireDate) {
		HireDate = hireDate;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public Office getOffice() {
		return office;
	}

	public void setOffice(Office office) {
		this.office = office;
	}


	
	
	
}
