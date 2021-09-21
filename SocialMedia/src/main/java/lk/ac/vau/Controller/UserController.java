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

import lk.ac.vau.Model.User;
import lk.ac.vau.Repo.UserRepo;
@RestController
@RequestMapping("/user")
@Produces(MediaType.APPLICATION_XML)

public class UserController {
	
	@Autowired
	UserRepo context;
	
	@GetMapping
	public List<User>getAll(){
		return context.findAll();
	}
	
	@GetMapping("/{id}")
	public User get(@PathVariable("id")long id) {
		return context.findById(id).get();
				
			
	}
	
	@PostMapping
	public void add(@RequestBody User user) {
		context.save(user);
	}
	
	@PutMapping
	public void update(@RequestBody User user) {
		context.save(user);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") long id) {
		context.deleteById(id);
	}
}
