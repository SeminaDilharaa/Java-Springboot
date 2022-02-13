package lk.ac.vau.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Course {
	@Id
	private String courseId;
	private String name;
	@ManyToMany(mappedBy = "courses")
	private List<Student> students;
	
	
	
	public Course(String courseId, String name, List<Student> students) {
		super();
		this.courseId = courseId;
		this.name = name;
		this.students = students;
	}
	
	

	public Course() {
		super();
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
}
