package com.service;

public class ByService {
	private String name;
	private UserService userService;
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void saybye(){
		System.out.println("bye"+name);
		userService.printOut();
	}
}
