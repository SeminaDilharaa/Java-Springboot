package com.example.demo.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Instructor;
import com.example.demo.Repo.InstructorRepo;

@RestController
@RequestMapping("/instructor")
public class InstructorController {
	@Autowired
	private InstructorRepo repo;
	
	@GetMapping
	public List<Instructor> getAll(){
		return repo.findAll();
	}
	
	/*@PostMapping
	public void addInstructor(@RequestBody Instructor instructor) {
		repo.save(instructor);
	}*/
	
	@PostMapping
	public ResponseEntity<String> addInstructor(@Valid @RequestBody Instructor instructor) {
		repo.save(instructor);
		//return ResponseEntity.ok("Inserted to database");
		return new ResponseEntity<String>("Inserted to database",HttpStatus.CREATED);
	}
}
