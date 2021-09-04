package com.example.demo.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Branch {
	@Id
	private String BranchId;
	private String Address;
	private int NoAccount;
	private int NoStaff;
	
	@ManyToOne
	@JoinColumn(name ="bank_id",referencedColumnName ="BankId")
	private Bank bank;
	
	
	@OneToMany(mappedBy ="branch")
	public List<Customer> customer;
	
	@OneToMany
	public List<Employee> employee;
	
	public Branch() {
		
	}
	
	

	public Branch(String branchId, String address, int noAccount, int noStaff, Bank bank, List<Customer> customer,
			List<Employee> employee) {
		super();
		BranchId = branchId;
		Address = address;
		NoAccount = noAccount;
		NoStaff = noStaff;
		this.bank = bank;
		this.customer = customer;
		this.employee = employee;
	}



	public Branch(String branchId, String address, int noAccount, int noStaff) {
		super();
		BranchId = branchId;
		Address = address;
		NoAccount = noAccount;
		NoStaff = noStaff;
	}

	public String getBranchId() {
		return BranchId;
	}

	public void setBranchId(String branchId) {
		BranchId = branchId;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public int getNoAccount() {
		return NoAccount;
	}

	public void setNoAccount(int noAccount) {
		NoAccount = noAccount;
	}

	public int getNoStaff() {
		return NoStaff;
	}

	public void setNoStaff(int noStaff) {
		NoStaff = noStaff;
	}



	public Bank getBank() {
		return bank;
	}



	public void setBank(Bank bank) {
		this.bank = bank;
	}



	public List<Customer> getCustomer() {
		return customer;
	}



	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}



	public List<Employee> getEmployee() {
		return employee;
	}



	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	
	
}
