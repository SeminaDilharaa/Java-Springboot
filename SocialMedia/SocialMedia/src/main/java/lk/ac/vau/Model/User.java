package lk.ac.vau.Model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
@Entity
public class User {
	@Id
	private String UserId;
	private String Email;
	private String FirstName;
	private String lastName;
	private int age; 
	public User() {
		
	}


	public User(String userId, String email, String firstName, String lastName, int age) {
		super();
		UserId = userId;
		Email = email;
		FirstName = firstName;
		this.lastName = lastName;
		this.age = age;
		
	}


	public String getUserId() {
		return UserId;
	}


	public void setUserId(String userId) {
		UserId = userId;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	public String getFirstName() {
		return FirstName;
	}


	public void setFirstName(String firstName) {
		FirstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	 
}
