package com.javatechie.spring.kafka.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class User
{
	
	public void user()
	{}
	
	private int id;
	public User(int id, String name, String[] address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	private String name;
	private String[] address;
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
	public String[] getAddress() {
		return address;
	}
	public void setAddress(String[] address) {
		this.address = address;
	}
	

}
