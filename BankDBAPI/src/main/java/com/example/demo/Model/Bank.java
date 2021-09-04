package com.example.demo.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Bank {
	@Id

	private String BankId;
	private String Name;
	private String Address;
	private int NoBranch;
	
	@OneToMany(mappedBy = "bank")
	
	public List<Branch> branch;
	
	public Bank() {
		
	}
	
	

	public Bank(String bankId, String name, String address, int noBranch, List<Branch> branch) {
		super();
		BankId = bankId;
		Name = name;
		Address = address;
		NoBranch = noBranch;
		this.branch = branch;
	}



	public Bank(String bankId, String name, String address, int noBranch) {
		super();
		BankId = bankId;
		Name = name;
		Address = address;
		NoBranch = noBranch;
	}

	public String getBankId() {
		return BankId;
	}

	public void setBankId(String bankId) {
		BankId = bankId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public int getNoBranch() {
		return NoBranch;
	}

	public void setNoBranch(int noBranch) {
		NoBranch = noBranch;
	}



	public List<Branch> getBranch() {
		return branch;
	}



	public void setBranch(List<Branch> branch) {
		this.branch = branch;
	}
	
	
}
