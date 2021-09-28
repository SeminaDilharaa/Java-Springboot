package lk.ac.vau.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Course {
	@Id
	private long CourseId;
	private String Name;
	private String duration;
	@ManyToMany(fetch = FetchType.LAZY,mappedBy ="courses")
	private List<Student>students=new ArrayList<Student>();
	
	public Course() {
		// TODO Auto-generated constructor stub
	}

	public Course(long courseId, String name, String duration, List<Student> students) {
		super();
		CourseId = courseId;
		Name = name;
		this.duration = duration;
		this.students = students;
	}

	public long getCourseId() {
		return CourseId;
	}

	public void setCourseId(long courseId) {
		CourseId = courseId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}	
	
}
