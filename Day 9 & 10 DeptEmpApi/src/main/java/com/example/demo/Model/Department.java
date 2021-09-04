package com.example.demo.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Department {
	@javax.persistence.Id
	private int DeptId;
	private String Name;
	private String Faculty;
	private int NoStaff;
	@OneToMany
	@JoinColumn(name="dept_id",referencedColumnName = "DeptId")
	public List<Employee> employees;
	
	
	public Department() {
		
	}


	public Department(int id, String name, String faculty, int noStaff, List<Employee> employees) {
		super();
		DeptId = id;
		Name = name;
		Faculty = faculty;
		NoStaff = noStaff;
		this.employees = employees;
	}


	public Department(int id, String name, String faculty, int noStaff) {
		super();
		DeptId = id;
		Name = name;
		Faculty = faculty;
		NoStaff = noStaff;
	}


	public int getId() {
		return DeptId;
	}


	public void setId(int id) {
		DeptId = id;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getFaculty() {
		return Faculty;
	}


	public void setFaculty(String faculty) {
		Faculty = faculty;
	}


	public int getNoStaff() {
		return NoStaff;
	}


	public void setNoStaff(int noStaff) {
		NoStaff = noStaff;
	}


	public List<Employee> getEmployees() {
		return employees;
	}


	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	
	
}
