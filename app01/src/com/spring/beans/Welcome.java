package com.spring.beans;

public class Welcome {

	private String name;

	private String message;
	
	public Welcome() {
		
	}
	
	public Welcome(String name, String message) {
		this.name = name;
		this.message = message;
	}

	public static Welcome getInstance() {
		System.out.println("get Instance method");
		return new Welcome();
	}
	
	public String getName() {
		return name;
	}

	public String getMessage() {
		return message;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String displayMessage() {
		return "Hello " + name + ", " + message;
	}

}
