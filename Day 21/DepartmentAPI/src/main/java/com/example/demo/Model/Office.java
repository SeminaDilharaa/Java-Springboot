package com.example.demo.Model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Office implements Serializable{
	@Id
	@OneToOne
	private Instructor instructor;
	private String Location;
}
