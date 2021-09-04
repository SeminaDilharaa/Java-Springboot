package com.example.demo.Model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Employee {
	@javax.persistence.Id
	private int EmpId;
	private String Name;
	private String Designation;
	private String Type;
	@Column(columnDefinition = "date")
	private String AppointedOn;
	@ManyToOne
	@JoinColumn(name = "dept_id",referencedColumnName = "DeptId")
	private Department department;
	
	public Employee() {
		
	}

	public Employee(int id, String name, String designation, String type, String appointedOn, Department department) {
		super();
		EmpId = id;
		Name = name;
		Designation = designation;
		Type = type;
		AppointedOn = appointedOn;
		this.department = department;
	}

	public Employee(int id, String name, String designation, String type, String appointedOn) {
		super();
		EmpId = id;
		Name = name;
		Designation = designation;
		Type = type;
		AppointedOn = appointedOn;
	}

	public int getId() {
		return EmpId;
	}

	public void setId(int id) {
		EmpId = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getAppointedOn() {
		return AppointedOn;
	}

	public void setAppointedOn(String appointedOn) {
		AppointedOn = appointedOn;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
}
