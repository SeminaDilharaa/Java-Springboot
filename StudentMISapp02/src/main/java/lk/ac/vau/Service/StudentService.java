package lk.ac.vau.Service;

import java.util.List;
import java.util.NoSuchElementException;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.ac.vau.Model.Course;
import lk.ac.vau.Model.Department;
import lk.ac.vau.Model.Student;
import lk.ac.vau.Repo.CourseRepo;
import lk.ac.vau.Repo.DepartmentRepo;
import lk.ac.vau.Repo.StudentRepo;

@Service
public class StudentService {
	@Autowired
	private StudentRepo repo;
	@Autowired
	private DepartmentRepo departmentRepo;
	@Autowired
	private CourseRepo courseRepo;

	public List<Student> getAll() {
		if (repo.findAll().isEmpty()) {
			throw new EntityNotFoundException("Sorry, No Students Records are Found !");
		}
		return repo.findAll();
	}

	public Student get(String id) {
		if (repo.findById(id).isEmpty()) {
			throw new NoSuchElementException("Sorry, No Student Records  Found for " + id);
		}
		return repo.findById(id).get();
	}

	public void add(Student student) {
		repo.save(student);
	}

	public void update(Student student) {
		repo.save(student);
	}
	
	public void delete(Student student) {
		repo.delete(student);
	}
	
	public List<Department> getDepartments(){
		if (departmentRepo.findAll().isEmpty()) {
			throw new EntityNotFoundException("Sorry, No Departments Record are Found !");
		}
		return departmentRepo.findAll();
	}
	
	public List<Course> getCourses(){
		if (courseRepo.findAll().isEmpty()) {
			throw new EntityNotFoundException("Sorry, No Course Record are Found !");
		}
		return courseRepo.findAll();
	}
	
	public Course getCourseForId(String id){
		if (courseRepo.findById(id).isEmpty()) {
			throw new EntityNotFoundException("Sorry, No Course Record are Found !");
		}
		return courseRepo.findById(id).get();
	}
}
