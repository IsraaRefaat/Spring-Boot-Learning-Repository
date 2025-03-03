package com.esraa.SpringFramewrokDemo;

public class Alien {

	private int age;
	private Computer com;

	public void setAge(int age) {
		this.age = age;
	}


	public int getAge() {
		return age;
	}

	public Computer getCom() {
		return com;
	}

	public void setCom(Computer com) {
		this.com = com;
	}

	public void code() {
		System.out.println("Coding...");
		com.compile();
	}

}
