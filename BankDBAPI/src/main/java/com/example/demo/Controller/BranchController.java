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

import com.example.demo.Model.Branch;
import com.example.demo.Repo.BranchRepo;

@RestController
@RequestMapping("/branch")
@Produces(MediaType.APPLICATION_XML)

public class BranchController {
	@Autowired
	BranchRepo context;
	
	@GetMapping
	
	public List<Branch>getAll(){
		return context.findAll();
	}
	
	@GetMapping("/{id}")
	public Branch get(@PathVariable("id")String id) {
		return context.findById(id).get();
	}
	
	@PostMapping
	public void add(@RequestBody Branch branch) {
		context.save(branch);
	}
	
	@PutMapping
	public void update(@RequestBody Branch branch) {
		context.save(branch);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") String id) {
		context.deleteById(id);
	}
}
