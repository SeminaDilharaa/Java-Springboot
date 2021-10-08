package lk.ac.vau.Model;


import java.util.List;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity 
public class Worker {
	@Id
	private String WorkerId;
	private String Name;
	private String Job;
	@OneToMany(mappedBy = "worker")
	private List<Workandbull>buildings;
	
	public Worker() {
		
	}

	public Worker(String workerId, String name, String job, List<Workandbull> buildings) {
		super();
		WorkerId = workerId;
		Name = name;
		Job = job;
		this.buildings = buildings;
	}

	public String getWorkerId() {
		return WorkerId;
	}

	public void setWorkerId(String workerId) {
		WorkerId = workerId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getJob() {
		return Job;
	}

	public void setJob(String job) {
		Job = job;
	}

	public List<Workandbull> getBuildings() {
		return buildings;
	}

	public void setBuildings(List<Workandbull> buildings) {
		this.buildings = buildings;
	} 

	
}
