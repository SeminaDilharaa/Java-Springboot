package com.example.demo.Controller;

import java.util.List;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Employee;
import com.example.demo.Repo.EmployeeRepo;

@RestController
@RequestMapping("/employee")
@Produces(MediaType.APPLICATION_XML)

public class EmployeeController {
	@Autowired
	EmployeeRepo context;
	
	@GetMapping
	
	public List<Employee>getAll(){
		return context.findAll();
	}
	
	@GetMapping("/{id}")
	public Employee get(@PathVariable("id")String id) {
		return context.findById(id).get();
	}
	
	@PostMapping
	public void add(@RequestBody Employee employee) {
		context.save(employee);
	}
	
	@PutMapping
	public void update(@RequestBody Employee employee) {
		context.save(employee);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") String id) {
		context.deleteById(id);
	}
}
