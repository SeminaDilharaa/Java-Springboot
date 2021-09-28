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

import lk.ac.vau.Model.Student;
import lk.ac.vau.Repo.StudentRepo;
@RestController
@RequestMapping("/student")
@Produces(MediaType.APPLICATION_XML)
public class StudentController {
	@Autowired
	StudentRepo context;
	

	@GetMapping
	public List<Student>getAll(){
		return context.findAll();
	}
	
	@GetMapping("/{id}")
	public Student get(@PathVariable("id") String id)
	{
		return context.findById(id).get();
	}
	@PostMapping
	public void add(@RequestBody Student student)
	{
		context.save(student);
	}
	@PutMapping
	public void update(@RequestBody Student student)
	{
		context.save(student);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") String id)
	{
		context.deleteById(id);
	}
}




