package lk.ac.vau.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.Model.Worker;
import lk.ac.vau.Repo.WorkerRepo;

@RestController
@RequestMapping("/woker")
public class WorkerController {
	@Autowired
	private WorkerRepo context;
	@GetMapping
	public List<Worker>getAll(){
		return context.findAll();
	}
	
	@GetMapping("/id")
	public Worker get(@PathVariable("id")int id){
		return context.findById(id).get();
	}
	
	@GetMapping("/skilltype/{skill}")
	public List<Worker>getSkill(@PathVariable("skill")String skill){
		return context.findBySkillType(skill);
	}
	
	@GetMapping("/name/{name}")
	public List<Worker>getName(@PathVariable("skill")String name){
		return context.findByName(name);
	}
	
	/*@GetMapping("sup/{id}")
	public Worker getSupervisor(@PathVariable("id") int id){
		return context.findBySupervisor(id);
	 }*/
}