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

import com.example.demo.Model.Bank;
import com.example.demo.Repo.BankRepo;

@RestController
@RequestMapping("/bank")
@Produces(MediaType.APPLICATION_XML)
public class BankController {
	
	@Autowired
	BankRepo context;
	
	@GetMapping
	
	public List<Bank>getAll(){
		return context.findAll();
	}
	
	@GetMapping("/{id}")
	public Bank get(@PathVariable("id")String id) {
		return context.findById(id).get();
	}
	
	@PostMapping
	public void add(@RequestBody Bank bank) {
		context.save(bank);
	}
	
	@PutMapping
	public void update(@RequestBody Bank bank) {
		context.save(bank);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") String id) {
		context.deleteById(id);
	}
}
