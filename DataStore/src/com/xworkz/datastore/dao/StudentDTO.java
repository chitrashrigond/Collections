package com.xworkz.datastore.dao;

import java.io.Serializable;

public class StudentDTO implements Serializable{
private String name;
private int age;

public StudentDTO() {
	super();
	// TODO Auto-generated constructor stub
}

public StudentDTO(String name, int age) {
	super();
	this.name = name;
	this.age = age;
}

@Override
public String toString() {
	return "StudentDTO [name=" + name + ", age=" + age + "]";
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}





}
