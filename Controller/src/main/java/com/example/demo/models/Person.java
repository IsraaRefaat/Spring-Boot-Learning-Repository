package com.example.demo.models;


public class Person {
	
	private int id;
	private String name;
	private float age;
	
	
	
	
	public Person(int id, String name, float age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	
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
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
	
	

}
