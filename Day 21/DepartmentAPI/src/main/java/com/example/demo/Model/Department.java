package com.example.demo.Model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Department {
	@javax.persistence.Id
	private String Id;
	private String Name;
	private int Budget;
	private Date StartDate;
	@ManyToOne
	@JoinColumn(name = "administrator",referencedColumnName = "Id")
	private Instructor administrator;
	@OneToMany(mappedBy = "department")
	private List<Course>courses;
}
