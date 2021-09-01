package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
@Entity
public class Student {
	@Id
	private String StudentId;
	private String Name;
	private int Age;
	private double GPA;
	private String Degree;
	
	public Student() {
		
	}

	public Student(String studentId, String name, int age, double gPA, String degree) {
		super();
		StudentId = studentId;
		Name = name;
		Age = age;
		GPA = gPA;
		Degree = degree;
	}
	
	public String getStudentId() {
		return StudentId;
	}

	public void setStudentId(String studentId) {
		StudentId = studentId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}

	public String getDegree() {
		return Degree;
	}

	public void setDegree(String degree) {
		Degree = degree;
	}
	 
}
