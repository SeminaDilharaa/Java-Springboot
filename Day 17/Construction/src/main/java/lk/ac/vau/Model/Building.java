package lk.ac.vau.Model;


import java.util.List;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Building {
	@Id
	private String BuildId;
	private String Address;
	private int nofloor;
	@OneToMany(mappedBy = "building ")
	private List<Workandbull>workers;
	
	
	public Building() {
		
	}


	public Building(String buildId, String address, int nofloor, List<Workandbull> workers) {
		super();
		BuildId = buildId;
		Address = address;
		this.nofloor = nofloor;
		this.workers = workers;
	}


	public String getBuildId() {
		return BuildId;
	}


	public void setBuildId(String buildId) {
		BuildId = buildId;
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
	}


	public int getNofloor() {
		return nofloor;
	}


	public void setNofloor(int nofloor) {
		this.nofloor = nofloor;
	}


	public List<Workandbull> getWorkers() {
		return workers;
	}


	public void setWorkers(List<Workandbull> workers) {
		this.workers = workers;
	}

	
}
