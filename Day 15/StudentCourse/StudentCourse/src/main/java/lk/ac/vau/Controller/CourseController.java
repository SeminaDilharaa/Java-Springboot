package lk.ac.vau.Controller;


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

import lk.ac.vau.Model.Course;
import lk.ac.vau.Repo.CourseRepo;
@RestController
@RequestMapping("/cource")
@Produces(MediaType.APPLICATION_XML)
public class CourseController {
	@Autowired
	CourseRepo context;
	

	@GetMapping
	public List<Course>getAll(){
		return context.findAll();
	}
	
	@GetMapping("/{id}")
	public Course get(@PathVariable("id") String id)
	{
		return context.findById(id).get();
	}
	@PostMapping
	public void add(@RequestBody Course course)
	{
		context.save(course);
	}
	@PutMapping
	public void update(@RequestBody Course course)
	{
		context.save(course);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") String id)
	{
		context.deleteById(id);
	}
}






