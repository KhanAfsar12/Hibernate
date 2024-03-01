package com.tut;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sahil {

	@Id
	@Column(name = "Sahil_id")
	private int id;
	
	
	@Column(name = "Sahil_name")
	private String name;
	
	
	@Column(name = "Sahil_email")
	private String email;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Sahil(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public Sahil() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
