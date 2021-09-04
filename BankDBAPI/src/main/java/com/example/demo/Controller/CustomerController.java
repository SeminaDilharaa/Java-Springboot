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

import com.example.demo.Model.Customer;
import com.example.demo.Repo.CustomerRepo;

@RestController
@RequestMapping("/customer")
@Produces(MediaType.APPLICATION_XML)
public class CustomerController {
	@Autowired
	CustomerRepo context;
	
	@GetMapping
	
	public List<Customer>getAll(){
		return context.findAll();
	}
	
	@GetMapping("/{id}")
	public Customer get(@PathVariable("id")String id) {
		return context.findById(id).get();
	}
	
	@PostMapping
	public void add(@RequestBody Customer customer) {
		context.save(customer);
	}
	
	@PutMapping
	public void update(@RequestBody Customer customer) {
		context.save(customer);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") String id) {
		context.deleteById(id);
	}
}
