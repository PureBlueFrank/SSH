package com.service;

public class UserService {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void printOut(){
		System.out.println("say hello"+name);
	}
}
