package com.example.demo.Controller;

import java.awt.PageAttributes.MediaType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Student;

@RestController
@RequestMapping("student")
public class StudentController {
	/*
	 * store student
	 * Add new student
	 * Update the student
	 * Delete the student
	 * get a student
	 * get students
	 */
	/*
	List<Student>students=new ArrayList<Student>();
	public void add() {
		Student james=new Student("2018-ICT-01", "James paul", 25, "IT", 3.0);
		Student ravi=new Student("2018-ICT-02", "Raviram", 26, "IT", 3.3);
		Student mala=new Student("2018-ICT-03", "Malathi", 25, "IT", 3.3);
		students.add(james);
		students.add(ravi);
		students.add(mala);
		
	}
	@GetMapping
	public List<Student>getAll(){
		add();
		return students;
	}
	@GetMapping("/{id}")
	public Student get(@PathVariable("id") String id){
		add();
		for(Student student:students) {
			if(student.getId().equals(id)) {
				return student;
			}
		}
		return null;
	}*/
	
	Map<String, Student> students=new HashMap<String, Student>();
	/*public void add() {
		Student james=new Student("2018-ICT-01", "James paul", 25, "IT", 3.0);
		Student ravi=new Student("2018-ICT-02", "Raviram", 26, "IT", 3.3);
		Student mala=new Student("2018-ICT-03", "Malathi", 25, "IT", 3.3);
		students.put(james.getId(), james);
		students.put(ravi.getId(), james);
		students.put(mala.getId(), james);
		
	}*/
	@GetMapping
	public Collection<Student> getAll(){
		//add();
		return students.values();
	}
	@GetMapping("/{id}")
	public Student get(@PathVariable("id") String id){
		//add();
		return students.get(id);
	}
	@PostMapping
	public void add(Student student) {
		students.put(student.getId(), student);
	}
}
