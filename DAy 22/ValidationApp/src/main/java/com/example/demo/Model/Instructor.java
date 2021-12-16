package com.example.demo.Model;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.constraints.Email;
import javax.persistence.Entity;
@Entity
public class Instructor {
	@Id
	@NotEmpty
	@Size(min = 4,max = 8,message = "Check your ID!")
	private String Id;
	@NotNull(message = "Please provide a name")
	private String Name;
	@Min(value = 30,message = "Age should be more than 30")
	@Max(value = 60,message = "Age should be less than 60")
	private int Age;
	@Email(message = "Check your Email Address ")
	private String Email;
	private int Experience;
	
	public Instructor() {
		
	}

	public Instructor(String id, String name, int age, String email, int experience) {
		super();
		Id = id;
		Name = name;
		Age = age;
		Email = email;
		Experience = experience;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
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

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public int getExperience() {
		return Experience;
	}

	public void setExperience(int experience) {
		Experience = experience;
	}
	
	
}
