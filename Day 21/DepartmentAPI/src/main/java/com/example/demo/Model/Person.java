package com.example.demo.Model;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
@MappedSuperclass
public class Person {
	@Id
	private int Id;
	private String FirstName;
	private String LastName;
	
	public  Person() {
		
	}

	public Person(int id, String firstName, String lastName) {
		super();
		Id = id;
		FirstName = firstName;
		LastName = lastName;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
}
