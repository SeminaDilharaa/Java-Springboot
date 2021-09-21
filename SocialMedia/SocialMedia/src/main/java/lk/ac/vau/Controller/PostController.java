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

import lk.ac.vau.Model.Post;
import lk.ac.vau.Repo.PostRepo;
@RestController
@RequestMapping("/post")
@Produces(MediaType.APPLICATION_XML)
public class PostController {
	
	@Autowired
	PostRepo context;
	
	@GetMapping
	
	public List<Post>getAll(){
		return context.findAll();
	}
	
	@GetMapping("/{id}")
	public Post get(@PathVariable("id") long id) {
		return context.findById(id).get();
	}
	
	@PostMapping
	public void add(@RequestBody Post post) {
		context.save(post);
	}
	
	@PutMapping
	public void update(@RequestBody Post post) {
		context.save(post);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") long id) {
		context.deleteById(id);
	}
}
